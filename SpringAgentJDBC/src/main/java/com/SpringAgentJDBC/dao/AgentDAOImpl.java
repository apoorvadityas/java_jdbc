package com.SpringAgentJDBC.dao;

import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.SpringAgentJDBC.model.Gender;
import com.SpringAgentJDBC.model.Agent;

public class AgentDAOImpl implements AgentDAO {
  private JdbcTemplate jdbcTemplate;
	
  public AgentDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Agent> list() {
		String sql = "SELECT * FROM Agent";
	    List<Agent> listContact = jdbcTemplate.query(sql, new RowMapper<Agent>() {
	        @Override
	        public Agent mapRow(ResultSet rs, int rowNum) throws SQLException {
	            Agent agent = new Agent();
				agent.setAgentID(rs.getInt("AgentID"));
				agent.setFirstName(rs.getString("Firstname"));
				agent.setMI(rs.getString("MI"));
				agent.setLastName(rs.getString("Lastname"));
				agent.setGender(Gender.valueOf(rs.getString("gender")));
				agent.setDOB(rs.getDate("DOB"));
				agent.setSSN(rs.getString("SSN"));
				agent.setMaritalStatus(rs.getInt("MaritalStatus"));
				agent.setAddress1(rs.getString("Address1"));
				agent.setAddress2(rs.getString("Address2"));
				agent.setCity(rs.getString("City"));
				agent.setSTATE(rs.getString("STATE"));
				agent.setZipCode(rs.getInt("ZipCode"));
				agent.setCountry(rs.getString("Country"));
				return agent;
	 
	}
	    });
	    return listContact;

	}


	@Override
	public void addAgent(Agent agent) {
		String cmd = "insert into Agent(AgentID,FirstName,MI,LastName,Gender,DOB,SSN,MaritalStatus,Address1,Address2,City,STATE,ZipCode,Country) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		 jdbcTemplate.update(cmd, agent.getAgentID(),agent.getFirstName(),agent.getMI(),agent.getLastName(),
				 agent.getGender().toString(), agent.getDOB(),agent.getSSN(),agent.getMaritalStatus(),agent.getAddress1(),agent.getAddress2(),
				 agent.getCity(),agent.getSTATE(),agent.getZipCode(),agent.getCountry());
				 
		
	}

	@Override
	public void updateAgent(Agent agent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Agent get(int AgentID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAgent(int AgentID) {
		// TODO Auto-generated method stub
		
	}
	
}
