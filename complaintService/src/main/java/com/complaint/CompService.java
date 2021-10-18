package com.complaint;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/complaint")
public class CompService {

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/addComplaint")
	public String addComplaint(Complaint comp) throws ClassNotFoundException, SQLException {
		return new ComplaintDAO().addComplaint(comp);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Complaint[] showComplaint() throws ClassNotFoundException, SQLException {
		ComplaintDAO dao = new ComplaintDAO();
		return dao.showComplaint();
	}
	
	@GET
	@Path("{ComplaintID}")
	@Produces(MediaType.APPLICATION_JSON)
	public Complaint showComplaint(@PathParam("ComplaintID") int ComplaintID) throws ClassNotFoundException, SQLException {
		ComplaintDAO dao = new ComplaintDAO();
		return dao.searchComplaint(ComplaintID);
	}
}
