package com.userservice.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.userservice.java.dto.RequestDto;
import com.userservice.java.feign.TicketClient;
import com.userservice.java.feign.TrainClient;

@RestController
public class UserController {

	@Autowired
	TrainClient trainClient;
	
	@Autowired
	TicketClient ticketClient;
	
	@GetMapping("/feign/trains")
	public ResponseEntity<String> getTrainDetails() {
		return trainClient.getTrains();
	}
	
	@PostMapping("/feign/tickets")
	public ResponseEntity<String> saveTicket(@RequestBody RequestDto dto) {
		return ticketClient.saveTicketDetails(dto);
	}
	
	@GetMapping("/apple/trains/{trainId}")
	public ResponseEntity<String> getTrainById(@PathVariable Integer trainId) {
		return trainClient.getTrainById(trainId);
	}
	
	@GetMapping("/feign/trains/display")
	public ResponseEntity<String> getTrainByname(@RequestParam String name) {
		return trainClient.getTrainByName(name);
	}
	
	@GetMapping("/feign/port")
	public ResponseEntity<Integer> getPort() {
		return trainClient.getPort();
	}
}
