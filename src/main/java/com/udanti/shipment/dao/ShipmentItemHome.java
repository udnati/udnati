// default package
// Generated 12 Jul, 2015 1:05:28 PM by Hibernate Tools 3.4.0.CR1

package com.udanti.shipment.dao;
//import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ShipmentItem.
 * @see .ShipmentItem
 * @author Hibernate Tools
 */
//@Stateless
public class ShipmentItemHome {

	private static final Log log = LogFactory.getLog(ShipmentItemHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ShipmentItem transientInstance) {
		log.debug("persisting ShipmentItem instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ShipmentItem persistentInstance) {
		log.debug("removing ShipmentItem instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ShipmentItem merge(ShipmentItem detachedInstance) {
		log.debug("merging ShipmentItem instance");
		try {
			ShipmentItem result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ShipmentItem findById(int id) {
		log.debug("getting ShipmentItem instance with id: " + id);
		try {
			ShipmentItem instance = entityManager.find(ShipmentItem.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
