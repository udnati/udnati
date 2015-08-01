// default package
// Generated 12 Jul, 2015 1:05:28 PM by Hibernate Tools 3.4.0.CR1

package com.udanti.shipment.dao;
//import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ShipmentHeader.
 * @see .ShipmentHeader
 * @author Hibernate Tools
 */
//@Stateless
public class ShipmentHeaderHome {

	private static final Log log = LogFactory.getLog(ShipmentHeaderHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ShipmentHeader transientInstance) {
		log.debug("persisting ShipmentHeader instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ShipmentHeader persistentInstance) {
		log.debug("removing ShipmentHeader instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ShipmentHeader merge(ShipmentHeader detachedInstance) {
		log.debug("merging ShipmentHeader instance");
		try {
			ShipmentHeader result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ShipmentHeader findById(int id) {
		log.debug("getting ShipmentHeader instance with id: " + id);
		try {
			ShipmentHeader instance = entityManager.find(ShipmentHeader.class,
					id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
