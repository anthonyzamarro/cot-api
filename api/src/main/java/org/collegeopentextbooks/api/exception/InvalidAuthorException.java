package org.collegeopentextbooks.api.exception;

import org.springframework.http.HttpStatus;

/**
 * Thrown when one or more of the provided author's properties fail input validation. 
 * @author steve.perkins
 *
 */
@ResponseException(code = HttpStatus.BAD_REQUEST, reason = "Invalid author")
public class InvalidAuthorException extends IllegalArgumentException {

	private static final long serialVersionUID = 1L;

	public InvalidAuthorException() {
		super();
	}

	public InvalidAuthorException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidAuthorException(String message) {
		super(message);
	}

	public InvalidAuthorException(Throwable cause) {
		super(cause);
	}

}
