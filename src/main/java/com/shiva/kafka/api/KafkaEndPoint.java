package com.shiva.kafka.api;

import com.shiva.kafka.event.TelemetryEvent;
import com.shiva.kafka.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.sql.Timestamp;

@RestController
@RequestMapping("event")
public class KafkaEndPoint {
	@Autowired
	KafkaProducer producer;

	@GetMapping("/send")
	public void sendEvent() {

		for (int i = 0; i < 500000; i++) {
			TelemetryEvent te = new TelemetryEvent(
					"1"+i,
					"Event"+i,
					"Telemtry Event"+i,
					(long) i,
					(double) i,
					(double) i,
					(double) i,
					(double) i,
					i%2==1 ? true : false ,
					new Timestamp(System.currentTimeMillis()));

			producer.sendMessage(te);
		}

	}

}
