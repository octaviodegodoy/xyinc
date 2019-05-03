package com.degodoy.xyinclocator;

import org.springframework.data.jpa.repository.JpaRepository;

import com.degodoy.xyinclocator.model.GPSLocation;

public interface GPSLocationRepository extends JpaRepository<GPSLocation, Long>{

}
