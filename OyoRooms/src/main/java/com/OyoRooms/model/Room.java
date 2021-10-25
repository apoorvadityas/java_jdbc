package com.OyoRooms.model;

public class Room {
	private int RoomID ;
	   private String Type ;
	   private Status Status ;
	   private int CostPerDay;
	public int getRoomID() {
		return RoomID;
	}
	public void setRoomID(int roomID) {
		RoomID = roomID;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public Status getStatus() {
		return Status;
	}
	public void setStatus(Status status) {
		Status = status;
	}
	public int getCostPerDay() {
		return CostPerDay;
	}
	public void setCostPerDay(int costPerDay) {
		CostPerDay = costPerDay;
	}
	@Override
	public String toString() {
		return "Room [RoomID=" + RoomID + ", Type=" + Type + ", Status=" + Status + ", CostPerDay=" + CostPerDay + "]";
	} 

}
