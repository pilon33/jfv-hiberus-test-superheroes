package jfv.hiberus.superheroes.challenge.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExceptionResponse {

	private String errorMessage;
	private String requestedURI;
}
