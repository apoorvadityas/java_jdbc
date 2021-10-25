package com.OyoRooms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.OyoRooms.model.Booking;
import com.OyoRooms.model.Room;
import com.OyoRooms.model.RoomID;
import com.OyoRooms.model.Status;




public class BookingDAOImpl implements BookingDAO {
	 private JdbcTemplate jdbcTemplate;
		
	  public BookingDAOImpl(DataSource dataSource) {
			this.jdbcTemplate = new JdbcTemplate(dataSource);
		}

		@Override
		public List<Room> list() {
			String sql = "SELECT * FROM Room";
		    List<Room> listContact = jdbcTemplate.query(sql, new RowMapper<Room>() {
		        @Override
		        public Room mapRow(ResultSet rs, int rowNum) throws SQLException {
		            Room room = new Room();
		     	  room.setRoomID(rs.getInt("RoomID"));
				  room.setType(rs.getString("Type"));
			      room.setStatus(Status.valueOf(rs.getString("Status")));
					room.setCostPerDay(rs.getInt("CostPerDay"));
					return room;
		    	}
		    	    });
		    	    return listContact;

		    	}
		

	    
	    @Override
		public void addRoom(Room room) {
			String cmd = "Insert into Room( BookId,,Status,CostPerDay) values(?,?,?,?)";
			 jdbcTemplate.update(cmd,room.getRoomID(),room.getType(),room.getStatus().toString(),room.getCostPerDay());
			 
			
		}

		@Override
		public void addBooking(Booking booking) {
			String cmd = "Insert into Booking(BookId,RoomID,CustName,City,BookDate,ChkInDate,ChkOutDate) values(?,?,?,?,?,?,?)";
			 jdbcTemplate.update(cmd,booking.getBookId(),booking.getRoomID().toString(),booking.getCustName(),booking.getCity(),booking.getBookDate(),booking.getChkInDate(),booking.getChkOutDate());
					 
			
		
			
		}

		@Override
		public Booking gett(int BookID) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Room get(int RoomID) {
			String sql = "select * from Room where RoomID=?";
		    return jdbcTemplate.query(sql,new Object[] {RoomID}, new ResultSetExtractor<Room>() {
		 
		        @Override
		        public Room extractData(ResultSet rs) throws SQLException,
		                DataAccessException {
		            if (rs.next()) {
		                Room room = new Room();
		                room.setRoomID(rs.getInt("RoomID"));
						  room.setType(rs.getString("Type"));
					      room.setStatus(Status.valueOf(rs.getString("Status")));
							room.setCostPerDay(rs.getInt("CostPerDay"));
						return room;
		                
		                
		}
	    return null;
		        }
		        });
		    }

		@Override
		public List<Booking> list1() {
			
			String sql = "SELECT * FROM Booking";
		    List<Booking> listContacts = jdbcTemplate.query(sql, new RowMapper<Booking>() {
		        @Override
		        public Booking mapRow(ResultSet rs, int rowNum) throws SQLException {
		            Booking book = new Booking();
		            book.setBookId(rs.getInt("BooKID"));
		     	  book.setRoomID(RoomID.valueOf(rs.getString("RoomID")));
				  book.setCustName(rs.getString("CustName"));
				  book.setCity(rs.getString("City"));
				  book.setBookDate(rs.getDate("BookDate"));
				  book.setChkInDate(rs.getDate("ChkInDate"));
				  book.setChkOutDate(rs.getDate("ChkOutDate"));
			
					return book;
		    	}
		    	    });
		    	    return listContacts;

		    	}
}
