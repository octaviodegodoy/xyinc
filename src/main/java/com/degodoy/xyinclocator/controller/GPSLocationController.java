package com.degodoy.xyinclocator.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.degodoy.xyinclocator.GPSLocationRepository;
import com.degodoy.xyinclocator.model.GPSLocation;
import com.degodoy.xyinclocator.service.GPSSearchService;


@RestController
public class GPSLocationController {
	
	@Autowired
	private GPSLocationRepository gpsLocationRepository;
	
	@Autowired
	private GPSSearchService gpsSearchService;
	
	@GetMapping("/gpslocation")
	public List<GPSLocation> getAllLocations(){
		return gpsLocationRepository.findAll();
	}
	
	@PostMapping("/searchAround")
	public List<String> searchAround(@RequestBody Location loc){
		
		if (loc != null) {
			if ((loc.x >= 0 ) && (loc.y >= 0)) {
				return gpsSearchService.getSearchAround(loc.x,loc.y);
			}
		}
		
		return null;
	
	}
	

}
