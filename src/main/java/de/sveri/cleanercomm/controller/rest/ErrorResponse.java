package de.sveri.cleanercomm.controller.rest;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public final class ErrorResponse extends Response {

	private final String id;

	public ErrorResponse(String id, String message) {
		super(message);
		this.id = id;
	}

}
