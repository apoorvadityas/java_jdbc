package com.complaint;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ComplaintDAO {

	Connection connection;
	PreparedStatement pst;
	public int generateComplaintNo() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select max(ComplaintID)+1 cno from Complaint";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int ComplaintID = rs.getInt("cno");
		return ComplaintID;
	}
	public Complaint[] showComplaint() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Complaint";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Complaint> compList = new ArrayList<Complaint>();
		Complaint comp = null;
		while(rs.next()) {
			comp = new Complaint();
			comp.setComplaintID(rs.getInt("ComplaintID"));
			comp.setComplaintType(rs.getString("ComplaintType"));
			comp.setCDescription(rs.getString("CDescription"));
			comp.setComplaintDate(rs.getDate("ComplaintDate"));
			comp.setSeverity(rs.getString("Severity"));
			comp.setStatus(Status.valueOf(rs.getString("Status")));
			compList.add(comp);
		}
		return compList.toArray(new Complaint[compList.size()]);
	}
	
	public Complaint searchComplaint(int complaintID ) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Complaint where complaintID=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, complaintID);
		ResultSet rs = pst.executeQuery();
		Complaint comp  = null;
		if (rs.next()) {
			comp = new Complaint();
			comp.setComplaintID(rs.getInt("ComplaintID"));
			comp.setComplaintType(rs.getString("ComplaintType"));
			comp.setCDescription(rs.getString("CDescription"));
			comp.setComplaintDate(rs.getDate("ComplaintDate"));
			comp.setSeverity(rs.getString("Severity"));
			comp.setStatus(Status.valueOf(rs.getString("Status")));
		}
		return comp;
	}
	public String addComplaint(Complaint comp) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "Insert into Complaint(ComplaintID,ComplaintType,CDescription,ComplaintDate,Severity,Status) "
				+ " values(?,?,?,?,?,?)";
		comp.setStatus(Status.Pending);
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, comp.getComplaintID());
		pst.setString(2, comp.getComplaintType());
		pst.setString(3, comp.getCDescription());
		pst.setDate(4, comp.getComplaintDate());
		pst.setString(5, comp.getSeverity());
		pst.setString(6, comp.getStatus().toString());
		pst.executeUpdate();
		return "Record Inserted...";
	}
}
