package com.example.tmc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.tmc.dao.ITicketDao;
import com.example.tmc.model.Ticket;

// Added a new comment to make commit no. 2

@RestController
@RequestMapping(value="/")
@CrossOrigin
public class TicketController {

	@Autowired
	ITicketDao tkd;

	Ticket tk;
	@RequestMapping(value="/getall", method=RequestMethod.GET)
	public List<Ticket> getAllTkt(){
		return tkd.getAllTkt();
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public Ticket createTkt(@RequestBody Ticket tkt) {
		return tkd.createTkt(tkt);
	}
	
	@RequestMapping(value="/getkt/{id}", method=RequestMethod.GET)
		public Ticket getTkt(@PathVariable("id") int id) {
			return tkd.getTktbyId(id);
		}
	
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void deleteTkt(@PathVariable("id") int id) {
		tk=tkd.getTktbyId(id);
		tkd.deleteTkt(tk);
	}
	
	@RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
	public Ticket updateTkt(@PathVariable("id") int id, @RequestBody Ticket up_tkt) {
		tk=tkd.getTktbyId(id);
		
		if(up_tkt.getDescription()!=null)
			tk.setDescription(up_tkt.getDescription());
		if(up_tkt.getCs()!=null)
			tk.setCs(up_tkt.getCs());
		
		tkd.updateTkt(tk);
		
		return tk;
	}
}
