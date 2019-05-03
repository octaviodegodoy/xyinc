package com.degodoy.xyinclocator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.degodoy.xyinclocator.daoservice.GPSLocationDAOService;
import com.degodoy.xyinclocator.model.GPSLocation;

@Component
public class GPSLocationDAOServiceCommandLineRunner implements CommandLineRunner {
	
	private static final Logger log = LoggerFactory.getLogger(GPSLocationDAOServiceCommandLineRunner.class);
	@Autowired
	private GPSLocationDAOService gpsLocationDAOService;

	@Override
	public void run(String... args) throws Exception {
		
		GPSLocation gpsLocation = new GPSLocation(27, 38);
		long insert = gpsLocationDAOService.insert(gpsLocation);
		
		log.info("New GPS location is created : " + insert);
		
	}
	
	
	
	
	

}
