package com.degodoy.xyinclocator;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.degodoy.xyinclocator.model.GPSLocation;

@Component
public class GPSLocationRepositoryCommandLineRunner implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(GPSLocationRepositoryCommandLineRunner.class);
	
	@Autowired
	private GPSLocationRepository gpsLocationRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		GPSLocation gpsLocation1 = new GPSLocation("Lanchonete",27, 12);
		gpsLocationRepository.save(gpsLocation1);
		log.info("New GPS location is created : " + gpsLocation1);
		GPSLocation gpsLocation2 = new GPSLocation("Posto",31, 18);
		gpsLocationRepository.save(gpsLocation2);
		log.info("New GPS location is created : " + gpsLocation2);
		GPSLocation gpsLocation3 = new GPSLocation("Joalheria",15, 12);
		gpsLocationRepository.save(gpsLocation3);
		log.info("New GPS location is created : " + gpsLocation3);
		GPSLocation gpsLocation4 = new GPSLocation("Floricultura",19, 21);
		gpsLocationRepository.save(gpsLocation4);
		log.info("New GPS location is created : " + gpsLocation4);
		GPSLocation gpsLocation5 = new GPSLocation("Pub",12, 8);
		gpsLocationRepository.save(gpsLocation5);
		log.info("New GPS location is created : " + gpsLocation5);
		GPSLocation gpsLocation6 = new GPSLocation("Supermercado",23, 6);
		gpsLocationRepository.save(gpsLocation6);
		log.info("New GPS location is created : " + gpsLocation6);
		GPSLocation gpsLocation7 = new GPSLocation("Churrascaria",28, 2);
		gpsLocationRepository.save(gpsLocation7);
		log.info("New GPS location is created : " + gpsLocation7);

	
		
	}
	
	

}
