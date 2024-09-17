package com.yash.service;

import java.util.Collection;


import com.yash.binding.Passanger;
import com.yash.binding.Ticket;

public interface TicketService {
public Ticket bookTicket(Passanger p);
public Collection<Ticket> getAllTickets();
	
}
