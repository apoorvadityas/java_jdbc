package com.complaint;

import java.sql.Date;

public class Resolve {
	 private int ComplaintID ;
	   private Date ComplaintDate;
	   private String ResolveDate ;
	   private String ResolvedBy; 
	   private String Comments;
	public int getComplaintID() {
		return ComplaintID;
	}
	public void setComplaintID(int complaintID) {
		ComplaintID = complaintID;
	}
	public Date getComplaintDate() {
		return ComplaintDate;
	}
	public void setComplaintDate(Date complaintDate) {
		ComplaintDate = complaintDate;
	}
	public String getResolveDate() {
		return ResolveDate;
	}
	public void setResolveDate(String resolveDate) {
		ResolveDate = resolveDate;
	}
	public String getResolvedBy() {
		return ResolvedBy;
	}
	public void setResolvedBy(String resolvedBy) {
		ResolvedBy = resolvedBy;
	}
	public String getComments() {
		return Comments;
	}
	public void setComments(String comments) {
		Comments = comments;
	}
	@Override
	public String toString() {
		return "Resolve [ComplaintID=" + ComplaintID + ", ComplaintDate=" + ComplaintDate + ", ResolveDate="
				+ ResolveDate + ", ResolvedBy=" + ResolvedBy + ", Comments=" + Comments + "]";
	}
	   
	   
}
