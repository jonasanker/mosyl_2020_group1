package org.mdse.pts.schedule.validation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.mdse.pts.schedule.Frequency;

public class FrequencyValidator extends BaseValidator {

	private final Frequency frequency;

	private List<ValidationError> validationErrors = new ArrayList<>();

	public FrequencyValidator(Frequency frequency, DiagnosticChain diagnostics) {
		super(diagnostics);

		this.frequency = frequency;
	}

	@Override
	public boolean validate() {
		validateTime();

		if (validationErrors.isEmpty()) {
			return true;
		} else {
			reportValidationErrors(validationErrors);
			return false;
		}
	}

	private void validateTime() {
		frequency.getTime().forEach(time -> {
			int hours = time.getHours();
			int minutes = time.getMinutes();

			if (hours > 24 || hours < 0 || minutes > 60 || minutes < 0) {
				validationErrors.add(new ValidationError(time, "The timeformat " + time + " is not valid"));
			}
		});
	}

}
