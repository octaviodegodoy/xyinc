package com.degodoy.xyinclocator.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.degodoy.xyinclocator.GPSLocationRepository;
import com.degodoy.xyinclocator.model.GPSLocation;
import com.degodoy.xyinclocator.service.CadastrarPOIService;
import com.degodoy.xyinclocator.service.GPSSearchService;


@RestController
public class GPSLocationController {
	
	@Autowired
	private GPSLocationRepository gpsLocationRepository;
	
	@Autowired
	private GPSSearchService gpsSearchService;
	
	@Autowired
	private CadastrarPOIService cadastrarPOIService;
	
	@GetMapping("/gpslocation")
	public List<GPSLocation> getAllLocations(){
		return gpsLocationRepository.findAll();
	}
	
	@GetMapping("/searchAround")
	public ResponseEntity<List<String>> searchAround(@RequestBody Location loc){
		
		if (loc != null) {
			if ((loc.x >= 0 ) && (loc.y >= 0)) {
				
				return ResponseEntity.status(HttpStatus.BAD_REQUEST)
				.body(gpsSearchService.getSearchAround(loc.x,loc.y,loc.dMax));
				 
			}
		}
		
		return 	ResponseEntity.status(HttpStatus.BAD_REQUEST)
				.body(null);
	
	}
	
	@PostMapping("/insertLocation")
	public ResponseEntity<Boolean> insertLocation(@RequestBody GPSLocation gpsLoc){
		
		if (gpsLoc != null) {
			if ((gpsLoc.getCoord_x() >= 0 ) && (gpsLoc.getCoord_y() >= 0)) {
				
				ResponseEntity.status(HttpStatus.BAD_REQUEST)
				.body(cadastrarPOIService.insertPOI(gpsLoc.getName(), gpsLoc.getCoord_x(), gpsLoc.getCoord_y()));
			}
		}
		
		return 	ResponseEntity.status(HttpStatus.BAD_REQUEST)
				.body(false);
	
	}
	

}
