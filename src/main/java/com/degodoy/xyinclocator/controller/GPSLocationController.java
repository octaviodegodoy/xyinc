package com.degodoy.xyinclocator.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.degodoy.xyinclocator.GPSLocationRepository;
import com.degodoy.xyinclocator.model.GPSLocation;


@RestController
public class GPSLocationController {
	
	@Autowired
	private GPSLocationRepository gpsLocationRepository;
	
	@GetMapping("/gpslocation")
	public List<GPSLocation> getAllLocations(){
		return gpsLocationRepository.findAll();
	}
}
