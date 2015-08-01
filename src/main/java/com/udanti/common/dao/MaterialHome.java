// default package
// Generated 12 Jul, 2015 1:05:28 PM by Hibernate Tools 3.4.0.CR1

package com.udanti.common.dao;

//import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Material.
 * @see .Material
 * @author Hibernate Tools
 */
//@Stateless
public class MaterialHome {

	private static final Log log = LogFactory.getLog(MaterialHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Material transientInstance) {
		log.debug("persisting Material instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Material persistentInstance) {
		log.debug("removing Material instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Material merge(Material detachedInstance) {
		log.debug("merging Material instance");
		try {
			Material result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Material findById(int id) {
		log.debug("getting Material instance with id: " + id);
		try {
			Material instance = entityManager.find(Material.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
