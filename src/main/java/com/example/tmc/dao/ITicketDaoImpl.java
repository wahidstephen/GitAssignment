package com.example.tmc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.example.tmc.model.Ticket;

@Repository
public class ITicketDaoImpl implements ITicketDao {

	@Autowired
	MongoTemplate mt;
	
	@Override
	public List<Ticket> getAllTkt() {
		
		return mt.findAll(Ticket.class);
	}

	@Override
	public Ticket getTktbyId(int id) {
		
		return mt.findById(id, Ticket.class);
	}

	@Override
	public Ticket createTkt(Ticket tkt) {
		
		mt.save(tkt);
		return tkt;
	}

	@Override
	public void deleteTkt(Ticket tkt) {
		mt.remove(tkt);

	}

	@Override
	public void updateTkt(Ticket tkt) {
		mt.save(tkt);
		
	}

}
