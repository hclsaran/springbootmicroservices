package com.userservice.java.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("TRAINSERVICE")
public interface TrainClient {

	@GetMapping("/trains")
	public ResponseEntity<String> getTrains();
	
	@GetMapping("/trains/{trainId}")
	public ResponseEntity<String> getTrainById(@PathVariable Integer trainId);
	
	@GetMapping("/trains/details")
	public ResponseEntity<String> getTrainByName(@RequestParam String name);
	
	@GetMapping("/trains/port")
	public ResponseEntity<Integer> getPort();
}
