// default package
// Generated 12 Jul, 2015 1:05:28 PM by Hibernate Tools 3.4.0.CR1
package com.udanti.common.dao;

//import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class CustomerHome.
 * @see .CustomerHome
 * @author Hibernate Tools
 */
//@Stateless
public class CustomerHome {

	private static final Log log = LogFactory.getLog(CustomerHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(CustomerHome transientInstance) {
		log.debug("persisting CustomerHome instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(CustomerHome persistentInstance) {
		log.debug("removing CustomerHome instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public CustomerHome merge(CustomerHome detachedInstance) {
		log.debug("merging CustomerHome instance");
		try {
			CustomerHome result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CustomerHome findById(int id) {
		log.debug("getting CustomerHome instance with id: " + id);
		try {
			CustomerHome instance = entityManager.find(CustomerHome.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
