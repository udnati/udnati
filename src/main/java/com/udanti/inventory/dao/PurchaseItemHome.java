// default package
// Generated 12 Jul, 2015 1:05:28 PM by Hibernate Tools 3.4.0.CR1

package com.udanti.inventory.dao;
//import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class PurchaseItem.
 * @see .PurchaseItem
 * @author Hibernate Tools
 */
//@Stateless
public class PurchaseItemHome {

	private static final Log log = LogFactory.getLog(PurchaseItemHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PurchaseItem transientInstance) {
		log.debug("persisting PurchaseItem instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PurchaseItem persistentInstance) {
		log.debug("removing PurchaseItem instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PurchaseItem merge(PurchaseItem detachedInstance) {
		log.debug("merging PurchaseItem instance");
		try {
			PurchaseItem result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PurchaseItem findById(int id) {
		log.debug("getting PurchaseItem instance with id: " + id);
		try {
			PurchaseItem instance = entityManager.find(PurchaseItem.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
