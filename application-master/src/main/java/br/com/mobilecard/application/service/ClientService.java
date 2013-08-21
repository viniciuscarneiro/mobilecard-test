package br.com.mobilecard.application.service;

import java.util.List;

import br.com.mobilecard.application.exception.ApplicationException;
import br.com.mobilecard.application.model.Client;

public interface ClientService {

	List< Client > findAll() throws ApplicationException;

	void save( Client client ) throws ApplicationException;

	Client findById( Long clientId ) throws ApplicationException;

	void delete( Client c ) throws ApplicationException;

}
