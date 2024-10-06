package com.yash.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.yash.binding.Passenger;
import com.yash.binding.Ticket;
@Service
public class TicketServiceImpl implements TicketService {
    
	
	 Map<UUID,Ticket> map=new HashMap<>();  // using in place of mysql db bcz mysl is in my local machine so we cant use it in cloud hosting

	@Override
	public Ticket bookTicket(Passenger p) {
		// TODO Auto-generated method stub
		Ticket t=new Ticket();
		//Random r =new Random(100);
		UUID id =UUID.randomUUID();
		t.setTicketId(id);
		BeanUtils.copyProperties(p, t);  //whatever data is coming from p obj copying it to t obj
		t.setStatus("CONFIRMED");
		map.put(id, t);
		
		return t;
	}

	@Override
	public Collection<Ticket> getAllTickets() {
		// TODO Auto-generated method stub
		return map.values();
	}

}
