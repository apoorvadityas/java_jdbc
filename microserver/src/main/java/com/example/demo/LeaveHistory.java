package com.example.demo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="leave_history")
public class LeaveHistory {
	private int leaveId;
	private int leaveNoOfDays;
	private String leaveMngrComments;
	private int empId;
	private Date leaveStartDate; 
	private Date leaveEndDate;
	private String leaveType;
	private String leaveStatus;
	private String leaveReason;
	
	@Id
	public int getLeaveId() {
		return leaveId;
	}
	public String getLeaveReason() {
		return leaveReason;
	}
	public void setLeaveReason(String leaveReason) {
		this.leaveReason = leaveReason;
	}
	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}
	public int getLeaveNoOfDays() {
		return leaveNoOfDays;
	}
	public void setLeaveNoOfDays(int leaveNoOfDays) {
		this.leaveNoOfDays = leaveNoOfDays;
	}
	public String getLeaveMngrComments() {
		return leaveMngrComments;
	}
	public void setLeaveMngrComments(String leaveMngrComments) {
		this.leaveMngrComments = leaveMngrComments;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public Date getLeaveStartDate() {
		return leaveStartDate;
	}
	public void setLeaveStartDate(Date leaveStartDate) {
		this.leaveStartDate = leaveStartDate;
	}
	public Date getLeaveEndDate() {
		return leaveEndDate;
	}
	public void setLeaveEndDate(Date leaveEndDate) {
		this.leaveEndDate = leaveEndDate;
	}
	public String getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}
	public String getLeaveStatus() {
		return leaveStatus;
	}
	public void setLeaveStatus(String leaveStatus) {
		this.leaveStatus = leaveStatus;
	}
	
	
	
	

}
