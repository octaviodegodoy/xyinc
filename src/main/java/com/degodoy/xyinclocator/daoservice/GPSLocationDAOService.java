package com.degodoy.xyinclocator.daoservice;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.degodoy.xyinclocator.model.GPSLocation;



@Repository
@Transactional
public class GPSLocationDAOService {

	@PersistenceContext
	private EntityManager entityManager;
	
	public long insert(GPSLocation gpsLocation) {
		entityManager.persist(gpsLocation);
		
		return gpsLocation.getId();
	}
}
