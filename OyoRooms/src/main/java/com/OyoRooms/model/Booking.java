package com.OyoRooms.model;
import java.sql.Date;
import com.OyoRooms.model.RoomID;

public class Booking {
	private int BookId ;
	  private RoomID RoomID ;
	  private String CustName ;
	  private String City ;
	  private Date BookDate;
	  private Date ChkInDate;
	  private Date ChkOutDate;
	public int getBookId() {
		return BookId;
	}
	public void setBookId(int bookId) {
		this.BookId = bookId;
	}

	public RoomID getRoomID() {
		return RoomID;
	}
	public void setRoomID(RoomID roomID) {
		RoomID = roomID;
	}
	public String getCustName() {
		return CustName;
	}
	public void setCustName(String custName) {
		CustName = custName;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public Date getBookDate() {
		return BookDate;
	}
	public void setBookDate(Date bookDate) {
		BookDate = bookDate;
	}
	public Date getChkInDate() {
		return ChkInDate;
	}
	public void setChkInDate(Date chkInDate) {
		ChkInDate = chkInDate;
	}
	public Date getChkOutDate() {
		return ChkOutDate;
	}
	public void setChkOutDate(Date chkOutDate) {
		ChkOutDate = chkOutDate;
	}
	@Override
	public String toString() {
		return "Booking [bookId=" + BookId + ", RoomID=" + RoomID + ", CustName=" + CustName + ", City=" + City
				+ ", BookDate=" + BookDate + ", ChkInDate=" + ChkInDate + ", ChkOutDate=" + ChkOutDate + "]";
	}
	  
	
	
}
