package br.com.mobilecard.application.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.ValidationMessage;
import br.com.mobilecard.application.exception.ApplicationException;
import br.com.mobilecard.application.model.Client;
import br.com.mobilecard.application.service.ClientService;

@Resource
@Path( "/client" )
public class ClientController {

	private static final Logger LOGGER = Logger.getLogger( ClientController.class );

	@Autowired
	private Validator validator;

	@Autowired
	private Result result;

	@Autowired
	private ClientService clientService;

	public ClientController() {}

	@Get( "/" )
	public void client() {

	}

	@Post( "/save" )
	public void save( Client client ) {
		try {
			clientService.save( client );
			result.forwardTo( getClass() ).list();
		} catch ( ApplicationException e ) {
			validator.add( new ValidationMessage( e.getMessage(), "error" ) );
			LOGGER.error( e );
		}
	}

	@Get( "/manage" )
	public void manage( Long clientId ) {
		try {
			Client c = clientService.findById( clientId );
			if ( c != null ) {
				result.include( "address", c.getAddress() );
				result.include( "city", c.getCity() );
				result.include( "email", c.getEmail() );
				result.include( "id", c.getId() );
				result.include( "name", c.getName() );
				result.include( "neighborhood", c.getNeighborhood() );
				result.include( "uf", c.getUf() );
			}
			result.forwardTo( getClass() ).client();
		} catch ( ApplicationException e ) {
			validator.add( new ValidationMessage( e.getMessage(), "error" ) );
			LOGGER.error( e );
		}
	}

	@Get( "/delete" )
	public void delete( Long clientId ) {
		try {
			Client c = clientService.findById( clientId );
			if ( c != null ) {
				clientService.delete( c );
			}
			result.forwardTo( getClass() ).list();
		} catch ( ApplicationException e ) {
			validator.add( new ValidationMessage( e.getMessage(), "error" ) );
			LOGGER.error( e );
		}
	}

	@Get( "/list" )
	public void list() {

		try {
			result.include( "clientList", clientService.findAll() );
		} catch ( ApplicationException e ) {
			validator.add( new ValidationMessage( e.getMessage(), "error" ) );
			LOGGER.error( e );
		}
	}
}
