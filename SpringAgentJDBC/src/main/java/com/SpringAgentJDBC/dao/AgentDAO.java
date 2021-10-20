package com.SpringAgentJDBC.dao;

import java.util.List;

import com.SpringAgentJDBC.model.Agent;

public interface AgentDAO {
	
	List<Agent> list();
	void addAgent(Agent agent);
	void updateAgent(Agent agent);
	Agent get(int AgentID);
	void deleteAgent(int AgentID);
}
