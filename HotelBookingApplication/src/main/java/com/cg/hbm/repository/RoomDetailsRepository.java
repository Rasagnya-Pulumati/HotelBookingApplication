package com.cg.hbm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.hbm.entity.RoomDetails;
@Repository
public interface RoomDetailsRepository extends JpaRepository<RoomDetails, Integer> {
	public List<RoomDetails> findByIsAvailableTrue();
	public List<RoomDetails> findByHotelHotelIdAndIsAvailableTrue(int hotel_id);
}
