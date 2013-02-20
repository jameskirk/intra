package com.uni.dao.util;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Query;

public class UniJpaUtil {
	
//	public T findOneBy(Specification<T> spec, String fieldValue, String fieldName) {
//		String stringQuery = "SELECT u FROM " + spec.getClass().getCanonicalName() + " u " +
//                "WHERE u." + fieldName + " = ?1";
//		TypedQuery<T> query = em.createQuery(stringQuery, getDomainClass());
//		query.setParameter(1, fieldValue);
//		try {
//        	return query.getSingleResult();
//        } catch (NoResultException e) {
//        	return null;
//        } catch (NonUniqueResultException e) {
//        	return null;
//        }
//	}

	@SuppressWarnings("unchecked")
	public static <T> Object findOne(String stringQuery, EntityManager em, T ... params) {
		Query query = em.createQuery(stringQuery);
		if (params != null) {
			for (int i = 0; i < params.length ; i++) {
				query.setParameter(i + 1, params[i]);
			}
		}
        try {
        	return query.getSingleResult();
        } catch (NoResultException e) {
        	return null;
        } catch (NonUniqueResultException e) {
        	return null;
        }
	}

}
