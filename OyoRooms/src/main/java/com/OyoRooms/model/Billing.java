package com.OyoRooms.model;

public class Billing {
	  private  int BookID; 
	   private int RoomID;
	   private int NoOfDays;
	   private int BillAmt;
	public int getBookID() {
		return BookID;
	}
	public void setBookID(int bookID) {
		BookID = bookID;
	}
	public int getRoomID() {
		return RoomID;
	}
	public void setRoomID(int roomID) {
		RoomID = roomID;
	}
	public int getNoOfDays() {
		return NoOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		NoOfDays = noOfDays;
	}
	public int getBillAmt() {
		return BillAmt;
	}
	public void setBillAmt(int billAmt) {
		BillAmt = billAmt;
	}
	@Override
	public String toString() {
		return "Billing [BookID=" + BookID + ", RoomID=" + RoomID + ", NoOfDays=" + NoOfDays + ", BillAmt=" + BillAmt
				+ "]";
	}
	   

}
