package com.shiva.kafka.consumer;

import com.shiva.kafka.event.TelemetryEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaConsumer {
	private final String TOPIC = "telemetry-events";

	@KafkaListener(topics = TOPIC, groupId = "TelemetryEvent_cg")
	public void listen(TelemetryEvent event) {
		logger.info("Received User information : {}", event.toString());
	}


}
