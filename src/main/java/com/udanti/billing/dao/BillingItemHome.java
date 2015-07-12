// default package
// Generated 12 Jul, 2015 1:05:28 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class BillingItem.
 * @see .BillingItem
 * @author Hibernate Tools
 */
@Stateless
public class BillingItemHome {

	private static final Log log = LogFactory.getLog(BillingItemHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(BillingItem transientInstance) {
		log.debug("persisting BillingItem instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(BillingItem persistentInstance) {
		log.debug("removing BillingItem instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public BillingItem merge(BillingItem detachedInstance) {
		log.debug("merging BillingItem instance");
		try {
			BillingItem result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public BillingItem findById(int id) {
		log.debug("getting BillingItem instance with id: " + id);
		try {
			BillingItem instance = entityManager.find(BillingItem.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
