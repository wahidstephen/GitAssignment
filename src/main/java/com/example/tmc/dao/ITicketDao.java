package com.example.tmc.dao;

import java.util.List;

import com.example.tmc.model.Ticket;

public interface ITicketDao {

	public List<Ticket> getAllTkt();
	public Ticket getTktbyId(int id);
	public Ticket createTkt(Ticket tkt);
	public void deleteTkt(Ticket tkt);
	public void updateTkt( Ticket tkt);
}
