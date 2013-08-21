package br.com.mobilecard.application.exception;

public class ApplicationException extends Exception {

	private static final long serialVersionUID = -4244086151275687617L;

	public ApplicationException() {
		super();
	}

	public ApplicationException( String message, Throwable cause ) {
		super( message, cause );
	}

	public ApplicationException( String message ) {
		super( message );
	}

	public ApplicationException( Throwable cause ) {
		super( cause );
	}

}
