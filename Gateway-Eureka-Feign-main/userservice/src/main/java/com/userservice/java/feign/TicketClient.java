package com.userservice.java.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.userservice.java.dto.RequestDto;

//@FeignClient(name = "ticketclient", url = "http://localhost:9092")
@FeignClient("TICKETSERVICE")
public interface TicketClient {

	@PostMapping("/tickets")
	public ResponseEntity<String> saveTicketDetails(@RequestBody RequestDto requestDto);
}
