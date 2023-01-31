package com.cg.hbm.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.hbm.entity.BookingDetails;

@Repository
public interface BookingDetailsRepository extends JpaRepository<BookingDetails, Integer>{
      public List<BookingDetails> findByBookedFrom(Date date);
      public BookingDetails findByBookingId(int id);
}

