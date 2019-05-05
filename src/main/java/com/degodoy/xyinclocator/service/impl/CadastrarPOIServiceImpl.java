package com.degodoy.xyinclocator.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.degodoy.xyinclocator.GPSLocationRepository;
import com.degodoy.xyinclocator.model.GPSLocation;
import com.degodoy.xyinclocator.service.CadastrarPOIService;

public class CadastrarPOIServiceImpl implements CadastrarPOIService {
	
	@Autowired
	private GPSLocationRepository gpsLocationRepository;
	
	@Override
	public boolean insertPOI(String name,int xLocal,int yLocal) {
		GPSLocation entity = new GPSLocation(name, xLocal, yLocal);
		entity = gpsLocationRepository.save(entity);
		return (entity != null);
	}
	
}
