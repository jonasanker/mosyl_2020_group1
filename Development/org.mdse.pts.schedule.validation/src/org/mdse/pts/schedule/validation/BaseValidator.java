package org.mdse.pts.schedule.validation;

import java.util.List;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

public class BaseValidator {

	private final DiagnosticChain diagnostics;

	public BaseValidator(DiagnosticChain diagnostics) {
		this.diagnostics = diagnostics;
	}

	protected void reportValidationErrors(List<ValidationError> validationErrors) {
		validationErrors.forEach(validationError -> {
			diagnostics.add(new BasicDiagnostic(Diagnostic.ERROR, validationError.getErrorEObject().toString(), 0,
					validationError.getErrorMessage(), new Object[] { validationError.getErrorEObject() }));
		});
	}
}
