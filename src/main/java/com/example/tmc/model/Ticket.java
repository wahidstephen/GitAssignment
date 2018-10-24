package com.example.tmc.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Ticket {
	
	@Id
	private int tktID;
	private String raisedBy;
	private String createdDate;
	private String assignedTo;
	private String subject;
	private String description;
	private currentStatus cs;
	
	private enum currentStatus{
		ASSIGNED, OPEN, CLOSED;
	}
	
	
	public Ticket(int tktID, String raisedBy, String createdDate, String assignedTo, String subject, String description,
			currentStatus cs) {
		super();
		this.tktID = tktID;
		this.raisedBy = raisedBy;
		this.createdDate = createdDate;
		this.assignedTo = assignedTo;
		this.subject = subject;
		this.description = description;
		this.cs = cs;
	}
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public currentStatus getCs() {
		return cs;
	}
	public void setCs(currentStatus cs) {
		this.cs = cs;
	}
	public int getTktID() {
		return tktID;
	}
	public void setTktID(int tktID) {
		this.tktID = tktID;
	}
	public String getRaisedBy() {
		return raisedBy;
	}
	public void setRaisedBy(String raisedBy) {
		this.raisedBy = raisedBy;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getAssignedTo() {
		return assignedTo;
	}
	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
		
	
}
