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
			String cmd = "Insert into Room(RoomID,Type,Status,CostPerDay) values(?,?,?,?)";
			 jdbcTemplate.update(cmd,room.getRoomID(),room.getType(),room.getStatus(),room.getCostPerDay());
					 
			
		}

		@Override
		public void addBooking(Booking booking) {
			// TODO Auto-generated method stub
			
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
		}
	
