package com.degodoy.xyinclocator.service;

import java.util.List;

public interface GPSSearchService {
	
	List<String> getSearchAround(int xLocal, int yLocal); 

}
