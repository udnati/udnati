// default package
// Generated 12 Jul, 2015 1:05:28 PM by Hibernate Tools 3.4.0.CR1

package com.udanti.inventory.dao;

//import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PurchaseHeader.
 * @see .PurchaseHeader
 * @author Hibernate Tools
 */
//@Stateless
public class PurchaseHeaderHome {

	private static final Log log = LogFactory.getLog(PurchaseHeaderHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PurchaseHeader transientInstance) {
		log.debug("persisting PurchaseHeader instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PurchaseHeader persistentInstance) {
		log.debug("removing PurchaseHeader instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PurchaseHeader merge(PurchaseHeader detachedInstance) {
		log.debug("merging PurchaseHeader instance");
		try {
			PurchaseHeader result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PurchaseHeader findById(int id) {
		log.debug("getting PurchaseHeader instance with id: " + id);
		try {
			PurchaseHeader instance = entityManager.find(PurchaseHeader.class,
					id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
