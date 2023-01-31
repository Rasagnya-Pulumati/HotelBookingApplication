package com.cg.hbm.service;

import java.util.List;

import com.cg.hbm.entity.RoomDetails;

public interface RoomDetailsService {

	
	 RoomDetails addRoomDetails(RoomDetails roomDetails);
	 RoomDetails updateRoomDetails(RoomDetails roomDetails);
	 String removeRoomDetailsById(int room_id);
	 List<RoomDetails> showAllRoomDetails();
	 RoomDetails showRoomDetailsById(int room_id);
}


