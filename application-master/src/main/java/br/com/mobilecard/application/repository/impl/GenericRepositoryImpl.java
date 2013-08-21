package br.com.mobilecard.application.repository.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import br.com.mobilecard.application.exception.ApplicationException;
import br.com.mobilecard.application.repository.GenericRepository;

/**
 * {@inheritDoc}
 * 
 * @author Vinicius Carneiro
 * @since 05/08/2013
 * 
 */
@Transactional
public class GenericRepositoryImpl< T > implements GenericRepository< T > {

	private static final Logger LOGGER = Logger.getLogger( GenericRepositoryImpl.class );

	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * Metodo GET.
	 * 
	 * @return the sessionFactory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * Metodo SET.
	 * 
	 * @param sessionFactory the sessionFactory to set
	 */
	public void setSessionFactory( SessionFactory sessionFactory ) {
		this.sessionFactory = sessionFactory;
	}

	/**
	 * Metodo GET.
	 * 
	 * @return the currentSession
	 */
	public Session getSession() {
		LOGGER.info( "Criação da sessão do Hibernate" );
		return this.sessionFactory.getCurrentSession();
	}

	/**
	 * Metodo GET.
	 * 
	 * @return the class of persistence
	 */
	@SuppressWarnings( "unchecked" )
	public Class< T > getPersistentClass() {

		return (Class< T >) ( (ParameterizedType) getClass().getGenericSuperclass() ).getActualTypeArguments()[ 0 ];
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void delete( T object ) throws ApplicationException {

		getSession().delete( object );
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T saveOrUpdate( T object ) throws ApplicationException {

		getSession().saveOrUpdate( object );
		return object;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T refresh( T object ) throws ApplicationException {

		getSession().refresh( object );
		return object;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@SuppressWarnings( "unchecked" )
	public T findById( Serializable id ) throws ApplicationException {

		return (T) getSession().get( getPersistentClass(), id );
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List< T > findAll() throws ApplicationException {

		return findByCriteria();
	}

	/**
	 * Metodo que cria o criteria atraves de uma lista de criterion.
	 * 
	 * @param criterion
	 * @return the list of object
	 */
	@SuppressWarnings( "unchecked" )
	public List< T > findByCriteria( Criterion... criterion ) {

		Criteria crit = getSession().createCriteria( getPersistentClass() );
		if ( criterion != null ) {
			for ( Criterion c : criterion ) {

				crit.add( c );
			}
		}
		return crit.list();
	}

	@SuppressWarnings( "unchecked" )
	@Override
	public T save( T object ) throws ApplicationException {
		return (T) getSession().save( object );
	}
}
