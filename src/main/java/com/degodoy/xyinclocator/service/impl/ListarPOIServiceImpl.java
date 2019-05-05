package com.degodoy.xyinclocator.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.degodoy.xyinclocator.GPSLocationRepository;
import com.degodoy.xyinclocator.model.GPSLocation;
import com.degodoy.xyinclocator.service.ListarPOIService;

public class ListarPOIServiceImpl implements ListarPOIService {

	@Autowired
	private GPSLocationRepository gpsLocationRepository;
	
	@Override
	public List<GPSLocation> getListaPOI() {
		return gpsLocationRepository.findAll();
	}

}
