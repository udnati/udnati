// default package
// Generated 12 Jul, 2015 1:05:28 PM by Hibernate Tools 3.4.0.CR1

package com.udanti.finance.dao;
//import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class FinanceInventory.
 * @see .FinanceInventory
 * @author Hibernate Tools
 */
//@Stateless
public class FinanceInventoryHome {

	private static final Log log = LogFactory
			.getLog(FinanceInventoryHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(FinanceInventory transientInstance) {
		log.debug("persisting FinanceInventory instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(FinanceInventory persistentInstance) {
		log.debug("removing FinanceInventory instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public FinanceInventory merge(FinanceInventory detachedInstance) {
		log.debug("merging FinanceInventory instance");
		try {
			FinanceInventory result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public FinanceInventory findById(int id) {
		log.debug("getting FinanceInventory instance with id: " + id);
		try {
			FinanceInventory instance = entityManager.find(
					FinanceInventory.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
