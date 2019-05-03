package com.degodoy.xyinclocator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.degodoy.xyinclocator.model.GPSLocation;

public class GPSLocationRepositoryCommandLineRunner implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(GPSLocationRepositoryCommandLineRunner.class);
	@Autowired
	private GPSLocationRepository gpsLocationRepository;
	
	
	@Override
	public void run(String... args) throws Exception {

		GPSLocation gpsLocation = new GPSLocation(27, 38);
		gpsLocationRepository.save(gpsLocation);
		
		log.info("New GPS location is created : " + gpsLocation);
		
		
	}
	
	

}
