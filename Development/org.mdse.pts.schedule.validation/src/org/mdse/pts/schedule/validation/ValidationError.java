package org.mdse.pts.schedule.validation;

import org.eclipse.emf.ecore.EObject;

public class ValidationError {

	private final EObject object;
	private final String message;

	public ValidationError(EObject object, String message) {
		this.object = object;
		this.message = message;
	}
	
	public EObject getErrorEObject() {
		return this.object;
	}
	
	public String getErrorMessage() {
		return this.message;
	}
}
