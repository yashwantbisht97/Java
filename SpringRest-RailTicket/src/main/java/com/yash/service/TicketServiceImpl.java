package com.yash.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.yash.binding.Passanger;
import com.yash.binding.Ticket;
@Service
public class TicketServiceImpl implements TicketService {

	
	Map<Integer,Ticket> map=new HashMap<>();  // using in place of mysql db bcz mysl is in my local machine so we cant use it in cloud hosting

	@Override
	public Ticket bookTicket(Passanger p) {
		// TODO Auto-generated method stub
		Ticket t=new Ticket();
		Random r =new Random(100);
		int id =r.nextInt(500);
		t.setTicketNum(id);
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
