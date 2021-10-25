package com.OyoRooms.dao;

import java.util.List;

import com.OyoRooms.model.Booking;
import com.OyoRooms.model.Room;



public interface BookingDAO {
	List<Room> list();
	void addBooking(Booking booking);
	void addRoom(Room room);
	Room get(int RoomID);
	Booking gett(int BookID);
	
	

}
