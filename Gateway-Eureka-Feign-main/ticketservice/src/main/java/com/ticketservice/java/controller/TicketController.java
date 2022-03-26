package com.ticketservice.java.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ticketservice.java.dto.RequestDto;

@RestController
public class TicketController {

	@PostMapping("/tickets")
	public ResponseEntity<String> saveTicketDetails(@RequestBody RequestDto requestDto) {
		return new ResponseEntity<String>("Ticket Saved " + requestDto.getTicketId(), HttpStatus.OK);
	}
	
	@GetMapping("/tickets")
	public ResponseEntity<String> getDetails() {
		return new ResponseEntity<String>("Ticket Details ", HttpStatus.OK);
	}
}


