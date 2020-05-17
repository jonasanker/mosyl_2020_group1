package org.mdse.pts.schedule.validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.mdse.pts.depot.Coach;
import org.mdse.pts.depot.Locomotive;
import org.mdse.pts.depot.Train;
import org.mdse.pts.schedule.Stop;
import org.mdse.pts.schedule.TrainSchedule;

public class TrainScheduleValidator extends BaseValidator {

	private final TrainSchedule trainSchedule;

	private List<ValidationError> validationErrors = new ArrayList<>();

	public TrainScheduleValidator(TrainSchedule trainSchedule, DiagnosticChain diagnostics) {
		super(diagnostics);

		this.trainSchedule = trainSchedule;
	}

	@Override
	public boolean validate() {
		checkRouteStopTurnAroundTrainSupport();

		if (validationErrors.isEmpty()) {
			return true;
		} else {
			reportValidationErrors(validationErrors);
			return false;
		}
	}

	private void checkRouteStopTurnAroundTrainSupport() {
		Optional<Stop> turnAroundStop = trainSchedule.getRoute().getStops().stream().filter(s -> s.isShouldTurnAround()).findFirst();

		if (!turnAroundStop.isPresent()) {
			return;
		}

		List<Coach> coaches = trainSchedule.getTrain().getCoaches();
		if (coaches.size() < 2) {
			validationErrors
					.add(new ValidationError(trainSchedule.getTrain(), "The train must have at least two coaches"));
			return;
		} else if ((coaches.get(0) instanceof Locomotive) && (coaches.get(coaches.size() - 1) instanceof Locomotive)) {
			return;
		} else {
			Train train = trainSchedule.getTrain();
			validationErrors.add(new ValidationError(turnAroundStop.get(), "The train " + train.getName() + " cannot be used. The route has a turn around stop which requires a train with a Locomotive at both ends"));
		}
	}

}
