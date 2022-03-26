package com.trainservice.java.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trains")
public class TrainController {
	
	@Value("${server.port}")
	int port;

	@GetMapping
	public ResponseEntity<String> getTrains() {
		return new ResponseEntity<String>("train1, train2, train3", HttpStatus.OK);
	}
	
	@GetMapping("/{trainId}")
	public ResponseEntity<String> getTrainsById(@PathVariable Integer trainId) {
		return new ResponseEntity<String>("trainDetail for Id : " + trainId, HttpStatus.OK);
	}
	
	@GetMapping("/details")
	public ResponseEntity<String> getTrainsByName(@RequestParam(name = "name") String name) {
		return new ResponseEntity<String>("trainDetail for train : " + name, HttpStatus.OK);
	}
	
	@GetMapping("/port")
	public ResponseEntity<Integer> getPort() {
		return new ResponseEntity<Integer>(port, HttpStatus.OK);
	}
}
