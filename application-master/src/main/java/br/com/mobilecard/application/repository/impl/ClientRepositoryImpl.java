package br.com.mobilecard.application.repository.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.mobilecard.application.model.Client;
import br.com.mobilecard.application.repository.ClientRepository;

@Repository
@Transactional
public class ClientRepositoryImpl extends GenericRepositoryImpl< Client > implements ClientRepository {

}
