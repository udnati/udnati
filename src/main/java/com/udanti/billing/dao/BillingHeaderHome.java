// default package
// Generated 12 Jul, 2015 1:05:28 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class BillingHeader.
 * @see .BillingHeader
 * @author Hibernate Tools
 */
@Stateless
public class BillingHeaderHome {

	private static final Log log = LogFactory.getLog(BillingHeaderHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(BillingHeader transientInstance) {
		log.debug("persisting BillingHeader instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(BillingHeader persistentInstance) {
		log.debug("removing BillingHeader instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public BillingHeader merge(BillingHeader detachedInstance) {
		log.debug("merging BillingHeader instance");
		try {
			BillingHeader result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public BillingHeader findById(int id) {
		log.debug("getting BillingHeader instance with id: " + id);
		try {
			BillingHeader instance = entityManager
					.find(BillingHeader.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
