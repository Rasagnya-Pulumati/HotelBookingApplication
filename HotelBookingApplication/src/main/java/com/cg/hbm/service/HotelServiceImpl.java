package com.cg.hbm.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.hbm.entity.Hotel;
import com.cg.hbm.entity.RoomDetails;
import com.cg.hbm.repository.HotelRepository;
import com.cg.hbm.repository.RoomDetailsRepository;
@Service
public class HotelServiceImpl implements HotelService {
	@Autowired
	private HotelRepository hotelRepository;
	@Autowired
	private RoomDetailsRepository roomDetailsRepository;

	@Override
	public Hotel addHotel(Hotel hotel) {	
		List<RoomDetails> r = hotel.getRooms();
		r.forEach(i -> { i.setHotel(hotel);
			  roomDetailsRepository.save(i);
		});
		return hotelRepository.save(hotel);
	}

	@Override
	public Hotel updateHotel(Hotel hotel) {
		List<RoomDetails> r = hotel.getRooms();
		r.forEach(i -> { i.setHotel(hotel);
			  roomDetailsRepository.save(i);
		});
		return hotelRepository.save(hotel);
	}

	@Override
	public String removeHotelById(int hotel_id) { 
		hotelRepository.deleteById(hotel_id);
		 return "Hotel deleted";
	}

	@Override
	public List<Hotel> showAllHotels() {
		return hotelRepository.findAll();
	}

	@Override
	public Hotel showHotelById(int hotel_id) {
		
		return hotelRepository.findById(hotel_id).get();
	}

	

}