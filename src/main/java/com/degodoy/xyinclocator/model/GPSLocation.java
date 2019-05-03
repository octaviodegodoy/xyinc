package com.degodoy.xyinclocator.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// Table - GPSLocation

@Entity
public class GPSLocation {
	
	@Id
	@GeneratedValue
	private long id;
	private int coord_x;
	private int coord_y;
	
	protected GPSLocation() {
		
	}
	
	public GPSLocation(int coord_x, int coord_y) {
		super();
		this.coord_x = coord_x;
		this.coord_y = coord_y;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getCoord_x() {
		return coord_x;
	}
	public void setCoord_x(int coord_x) {
		this.coord_x = coord_x;
	}
	public int getCoord_y() {
		return coord_y;
	}
	public void setCoord_y(int coord_y) {
		this.coord_y = coord_y;
	}
	
	

}
