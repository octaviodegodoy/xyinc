package com.degodoy.xyinclocator.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.degodoy.xyinclocator.GPSLocationRepository;
import com.degodoy.xyinclocator.model.GPSLocation;
import com.degodoy.xyinclocator.service.GPSSearchService;

@Service
public class GPSSearchServiceImpl implements GPSSearchService {
	
	@Autowired
	private GPSLocationRepository gpsRepository;
	
	public List<String> getSearchAround(int xLocal, int yLocal) {
		
		final double maxDistance = Math.hypot(xLocal, yLocal);
    	   	
      	List<GPSLocation> gpsLocations = gpsRepository.findAll();
    	
    	List<String> filteredLocations	 = new ArrayList<>();
    	
    	for(GPSLocation loc : gpsLocations) {
    		double distance = Math.hypot(loc.getCoord_x(), loc.getCoord_y());
    		if (distance <= maxDistance) {
    			filteredLocations.add(loc.getName());
    		}
    	}
		
    	return filteredLocations;
	}

}
