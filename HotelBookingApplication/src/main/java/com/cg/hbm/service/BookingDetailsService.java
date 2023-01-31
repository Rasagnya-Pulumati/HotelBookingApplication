package com.cg.hbm.service;

import java.util.List;
import com.cg.hbm.entity.BookingDetails;
import com.cg.hbm.exception.RoomNotAvailableException;

public interface BookingDetailsService {
	BookingDetails addBookingDetails(BookingDetails bookingDetails) throws RoomNotAvailableException;
	BookingDetails updateBookingDetails(BookingDetails bookingDetails);
	String removeBookingDetailsByBookingId(int bookingID );
	List<BookingDetails> showAllBookingDetails();
	BookingDetails showBookingDetailsByBookingId(int bookingID);
}

