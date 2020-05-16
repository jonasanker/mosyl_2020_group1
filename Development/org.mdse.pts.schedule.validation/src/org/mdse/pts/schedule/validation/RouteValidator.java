package org.mdse.pts.schedule.validation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.mdse.pts.network.Leg;
import org.mdse.pts.schedule.Route;
import org.mdse.pts.schedule.Stop;

public class RouteValidator extends BaseValidator {

	private final Route route;

	private List<ValidationError> validationErrors = new ArrayList<>();

	public RouteValidator(Route route, DiagnosticChain diagnostics) {
		super(diagnostics);

		this.route = route;
	}

	public boolean validate() {
		routeIterator(route.getStops(), (first, second) -> {
			validateRouteStop(first, second);
		});

		if (validationErrors.isEmpty()) {
			return true;
		} else {
			reportValidationErrors(validationErrors);
			return false;
		}
	}

	private void validateRouteStop(Stop start, Stop destination) {
		if (start.getStation().equals(destination.getStation())) {
			validationErrors.add(new ValidationError(route, "The route stop must be between two different stations"));
			return;
		}
		
		List<Leg> matchingLegs = start.getStation().getLegs() //
				.stream().filter(l -> l.getStations().contains(destination.getStation())) //
				.distinct().collect(Collectors.toList());

		if (matchingLegs.isEmpty()) {
			validationErrors.add(new ValidationError(route,
					"No connecting leg was found between " + start.getStation().getName() + " and "
							+ destination.getStation().getName()
							+ ". There must be at least one leg connecting two stations"));
			// No legs found
			return;
		}
		
		Leg via = destination.getVia();
		if (matchingLegs.size() == 1) {
					
			if (via != null && !via.equals(matchingLegs.get(0))) {
				validationErrors.add(new ValidationError(route,
						"The via leg " + via.getName() + " is not connected between "
								+ start.getStation().getName() + " and " + destination.getStation().getName()));
			}
			
			return;
		}

		if (via == null) {
			validationErrors.add(new ValidationError(route,
					"No via Leg is set between " + start.getStation().getName() + " and "
							+ destination.getStation().getName()
							+ ". A via must be set when there is more than one leg connecting the two same stations"));
		} else if (!matchingLegs.contains(via)) {
			validationErrors
					.add(new ValidationError(route, "The via leg " + via.getName() + " is not connected between "
							+ start.getStation().getName() + " and " + destination.getStation().getName()));
		}
	}

	private <T> void routeIterator(Iterable<T> iterable, BiConsumer<T, T> consumer) {
		Iterator<T> it = iterable.iterator();
		if (!it.hasNext())
			return;
		T first = it.next();

		while (it.hasNext()) {
			T next = it.next();
			consumer.accept(first, next);
			first = next;
		}
	}
}
