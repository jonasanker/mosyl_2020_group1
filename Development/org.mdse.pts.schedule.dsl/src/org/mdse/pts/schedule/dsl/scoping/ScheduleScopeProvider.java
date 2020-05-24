package org.mdse.pts.schedule.dsl.scoping;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.mdse.pts.depot.Train;
import org.mdse.pts.network.Leg;
import org.mdse.pts.network.Station;
import org.mdse.pts.schedule.Schedule;
import org.mdse.pts.schedule.Stop;
import org.mdse.pts.schedule.TrainSchedule;

/**
 * ScopeProvider for Schedule which provides a scope for Trains, Stations and Legs
 */
public class ScheduleScopeProvider extends AbstractScheduleScopeProvider {

	private static final String SCHEDULE_TRAIN_REF = "train";
	private static final String SCHEDULE_STATION_REF = "station";
	private static final String SCHEDULE_VIA_LEG_REF = "via";

	@Override
	public IScope getScope(EObject context, EReference reference) {
		if (context instanceof TrainSchedule && reference.getName().equals(SCHEDULE_TRAIN_REF)) {
			TrainSchedule trainSchedule = (TrainSchedule) context;
			return getTrainScope(trainSchedule);
		} else if (context instanceof Stop && reference.getName().equals(SCHEDULE_STATION_REF)) {
			Stop stop = (Stop) context;
			return getStationScope(stop);
		} else if (context instanceof Stop && reference.getName().equals(SCHEDULE_VIA_LEG_REF)) {
			Stop stop = (Stop) context;
			return getLegScope(stop);
		}

		return super.getScope(context, reference);
	}

	private IScope getTrainScope(TrainSchedule trainSchedule) {
		// Get root element, schedule
		EObject rootElement = EcoreUtil.getRootContainer(trainSchedule);

		if (rootElement instanceof Schedule) {
			Schedule schedule = (Schedule) rootElement;

			List<Train> trains = schedule.getDepots().stream().flatMap(d -> d.getTrains().stream())
					.collect(Collectors.toList());
			return Scopes.scopeFor(trains);
		}

		return null;
	}

	private IScope getStationScope(Stop stop) {
		// Get root element, schedule
		EObject rootElement = EcoreUtil.getRootContainer(stop);

		if (rootElement instanceof Schedule) {
			Schedule schedule = (Schedule) rootElement;

			List<Station> stations = schedule.getNetwork().getStations();
			return Scopes.scopeFor(stations);
		}

		return null;
	}

	private IScope getLegScope(Stop stop) {
		// Get root element, schedule
		EObject rootElement = EcoreUtil.getRootContainer(stop);

		if (rootElement instanceof Schedule) {
			Schedule schedule = (Schedule) rootElement;

			List<Leg> legs = schedule.getNetwork().getLegs();
			return Scopes.scopeFor(legs);
		}

		return null;
	}
}
