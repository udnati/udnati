// default package
// Generated 12 Jul, 2015 1:05:28 PM by Hibernate Tools 3.4.0.CR1

package com.udanti.delivery.dao;
//import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class DeliveryItem.
 * @see .DeliveryItem
 * @author Hibernate Tools
 */
//@Stateless
public class DeliveryItemHome {

	private static final Log log = LogFactory.getLog(DeliveryItemHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(DeliveryItem transientInstance) {
		log.debug("persisting DeliveryItem instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(DeliveryItem persistentInstance) {
		log.debug("removing DeliveryItem instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public DeliveryItem merge(DeliveryItem detachedInstance) {
		log.debug("merging DeliveryItem instance");
		try {
			DeliveryItem result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public DeliveryItem findById(int id) {
		log.debug("getting DeliveryItem instance with id: " + id);
		try {
			DeliveryItem instance = entityManager.find(DeliveryItem.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
