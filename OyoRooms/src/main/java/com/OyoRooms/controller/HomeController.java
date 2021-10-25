package com.OyoRooms.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.OyoRooms.model.Booking;
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
	 public ModelAndView addroom(ModelAndView model) {
	     Room room = new Room();
	     model.addObject("Room", room);
	     model.setViewName("roomform");
	     return model;
}

	 @RequestMapping(value = "/saveroom", method = RequestMethod.POST)
	 public ModelAndView saveroom(@ModelAttribute Room room) {
	     bookingDAO.addRoom(room);
	     return new ModelAndView("redirect:/");

}
	 @RequestMapping(value = "/newbook", method = RequestMethod.GET)
	 public ModelAndView addbbooking(ModelAndView model) {
	    Booking book = new Booking();
	     model.addObject("Book", book);
	     model.setViewName("newbook");
	     return model;
}
	 @RequestMapping(value = "/savebook", method = RequestMethod.POST)
	 public ModelAndView savebook(@ModelAttribute Booking book) {
	     bookingDAO.addBooking(book);
	     return new ModelAndView("redirect:/roombook");
	 }
	 @RequestMapping(value="/roombook")
		public ModelAndView booking(ModelAndView model) throws IOException{
		     List<Booking> listbook = bookingDAO.list1();
		     model.addObject("listbook", listbook);
		     model.setViewName("roombook");
		     return model;
}
}
