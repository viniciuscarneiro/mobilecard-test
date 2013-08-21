package br.com.mobilecard.application.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mobilecard.application.exception.ApplicationException;
import br.com.mobilecard.application.model.Client;
import br.com.mobilecard.application.repository.ClientRepository;
import br.com.mobilecard.application.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientRepository clientRepository;

	@Override
	public List< Client > findAll() throws ApplicationException {
		return clientRepository.findAll();
	}

	@Override
	public void save( Client client ) throws ApplicationException {
		if ( client.getId() != 0 ) {
			clientRepository.saveOrUpdate( client );
		} else {
			clientRepository.save( client );
		}
	}

	@Override
	public Client findById( Long clientId ) throws ApplicationException {
		return clientRepository.findById( clientId );
	}

	@Override
	public void delete( Client c ) throws ApplicationException {
		clientRepository.delete( c );

	}

}
