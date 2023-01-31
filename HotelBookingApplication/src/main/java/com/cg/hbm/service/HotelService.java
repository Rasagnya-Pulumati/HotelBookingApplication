
package com.cg.hbm.service;



import java.util.List;



import org.springframework.stereotype.Service;

import com.cg.hbm.entity.Hotel;

@Service

public interface HotelService {
	
	public Hotel addHotel(Hotel hotel);
	
	public Hotel updateHotel(Hotel hotel);

	public String removeHotelById(int hotelId);
	
	public List<Hotel> showAllHotels(); 
	
	public Hotel showHotelById(int hotelId);

	

	


	
}
