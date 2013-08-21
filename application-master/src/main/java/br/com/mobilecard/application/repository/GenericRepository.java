package br.com.mobilecard.application.repository;

import java.io.Serializable;
import java.util.List;

import br.com.mobilecard.application.exception.ApplicationException;

/**
 * Classe com metodos de repositorio generico.
 * 
 * @author Vinicius Carneiro
 * @since 05/08/2013
 * 
 */
public interface GenericRepository< T > {

	/**
	 * Metodo que exclui o objeto do banco.
	 * 
	 * @param object
	 * @throws ApplicationException 
	 */
	void delete( T object ) throws ApplicationException;

	/**
	 * Metodo que atualiza ou salva o objeto no banco.
	 * 
	 * @param object
	 * @return
	 * @throws ApplicationException 
	 */
	T saveOrUpdate( T object ) throws ApplicationException;

	/**
	 * Metodo que busca o serializado objeto no banco pelo id.
	 * 
	 * @param object
	 * @return
	 * @throws ApplicationException 
	 */
	T refresh( T object ) throws ApplicationException;

	/**
	 * Metodo que busca o objeto no banco pelo id.
	 * 
	 * @param id
	 * @return
	 * @throws ApplicationException 
	 */
	T findById( Serializable id ) throws ApplicationException;

	/**
	 * Metodo que retorna uma lista de objetos.
	 * 
	 * @return
	 * @throws ApplicationException 
	 */
	List< T > findAll() throws ApplicationException;
	
	/**
	 * Metodo que salva o objeto no banco.
	 * 
	 * @param object
	 * @return
	 * @throws ApplicationException 
	 */
	T save( T object ) throws ApplicationException;

}
