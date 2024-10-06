package com.yash.service;

import java.util.Collection;


import com.yash.binding.Passenger;
import com.yash.binding.Ticket;

public interface TicketService {
public Ticket bookTicket(Passenger p);
public Collection<Ticket> getAllTickets();
	
}
