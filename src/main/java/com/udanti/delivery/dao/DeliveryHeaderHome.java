// default package
// Generated 12 Jul, 2015 1:05:28 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class DeliveryHeader.
 * @see .DeliveryHeader
 * @author Hibernate Tools
 */
@Stateless
public class DeliveryHeaderHome {

	private static final Log log = LogFactory.getLog(DeliveryHeaderHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(DeliveryHeader transientInstance) {
		log.debug("persisting DeliveryHeader instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(DeliveryHeader persistentInstance) {
		log.debug("removing DeliveryHeader instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public DeliveryHeader merge(DeliveryHeader detachedInstance) {
		log.debug("merging DeliveryHeader instance");
		try {
			DeliveryHeader result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public DeliveryHeader findById(int id) {
		log.debug("getting DeliveryHeader instance with id: " + id);
		try {
			DeliveryHeader instance = entityManager.find(DeliveryHeader.class,
					id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
