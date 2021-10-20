package com.SpringAgentJDBC.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.SpringAgentJDBC.dao.AgentDAO;
import com.SpringAgentJDBC.model.Agent;

@Controller
public class HomeController {
	 @Autowired
	 private AgentDAO agentDAO;
	@RequestMapping(value="/")
	public ModelAndView listAgent(ModelAndView model) throws IOException{
	     List<Agent> listAgent = agentDAO.list();
	     model.addObject("listAgent", listAgent);
	     model.setViewName("home");
	     return model;
	}
	
	 @RequestMapping(value = "/newagent", method = RequestMethod.GET)
	 public ModelAndView addemploy(ModelAndView model) {
	     Agent agent = new Agent();
	     model.addObject("agent", agent);
	     model.setViewName("agentform");
	     return model;
}
	 @RequestMapping(value = "/saveagent", method = RequestMethod.POST)
	 public ModelAndView saveemploy(@ModelAttribute Agent agent) {
	     agentDAO.addAgent(agent);
	     return new ModelAndView("redirect:/");
	 }
}
