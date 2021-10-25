package com.OyoRooms.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.OyoRooms.model.Room;
import com.OyoRooms.dao.BookingDAO;


@Controller
public class HomeController {
	@Autowired
	 private BookingDAO bookingDAO;
	@RequestMapping(value="/")
	public ModelAndView test(ModelAndView model) throws IOException{
	     List<Room> listroom = bookingDAO.list();
	     model.addObject("listroom", listroom);
	     model.setViewName("home");
	     return model;
	}
	
	 @RequestMapping(value = "/newroom", method = RequestMethod.GET)
	 public ModelAndView addemploy(ModelAndView model) {
	     Room room = new Room();
	     model.addObject("Room", room);
	     model.setViewName("roomform");
	     return model;
}
	}

