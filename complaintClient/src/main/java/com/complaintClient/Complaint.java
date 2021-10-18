package com.complaintClient;

import java.sql.Date;



public class Complaint {
	private int ComplaintID ;
	   private String ComplaintType ;
	   private String CDescription ;
	   private Date ComplaintDate;
	   private String Severity;
	  private Status Status;
	public int getComplaintID() {
		return ComplaintID;
	}
	public void setComplaintID(int complaintID) {
		ComplaintID = complaintID;
	}
	public String getComplaintType() {
		return ComplaintType;
	}
	public void setComplaintType(String complaintType) {
		ComplaintType = complaintType;
	}
	public String getCDescription() {
		return CDescription;
	}
	public void setCDescription(String CDescription) {
		this.CDescription = CDescription;
	}
	public Date getComplaintDate() {
		return ComplaintDate;
	}
	public void setComplaintDate(Date complaintDate) {
		ComplaintDate = complaintDate;
	}
	public String getSeverity() {
		return Severity;
	}
	public void setSeverity(String severity) {
		Severity = severity;
	}

	
	public Status getStatus() {
		return Status;
	}
	public void setStatus(Status status) {
		this.Status = status;
	}
	@Override
	public String toString() {
		return "Complaint [ComplaintID=" + ComplaintID + ", ComplaintType=" + ComplaintType + ", CDescription="
				+ CDescription + ", ComplaintDate=" + ComplaintDate + ", Severity=" + Severity + ", varchar=" + Status
				+ "]";
	}

}
