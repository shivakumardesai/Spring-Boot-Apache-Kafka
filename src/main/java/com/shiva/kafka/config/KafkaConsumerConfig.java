package com.shiva.kafka.config;

import com.shiva.kafka.event.TelemetryEvent;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.kafka.support.serializer.JsonSerializer;

import java.util.HashMap;
import java.util.Map;

//@EnableKafka
//@Configuration
public class KafkaConsumerConfig {
//
//	@Value(value = "${kafka.bootstrapAddress}")
//	private String bootstrapAddress;
//	@Bean
//	public ConsumerFactory<String, TelemetryEvent> consumerFactory(String groupId) {
//		Map<String, Object> props = new HashMap<>();
//		props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,bootstrapAddress);
//		props.put(ConsumerConfig.GROUP_ID_CONFIG,groupId);
//		props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,StringDeserializer.class);
//		props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,JsonSerializer.class);
//		return new DefaultKafkaConsumerFactory<>(props);
//	}
//
//	@Bean
//	public ConcurrentKafkaListenerContainerFactory<String, TelemetryEvent> kafkaListenerContainerFactory(String groupId) {
//		ConcurrentKafkaListenerContainerFactory<String, TelemetryEvent> factory =
//				new ConcurrentKafkaListenerContainerFactory<>();
//		factory.setConsumerFactory(consumerFactory(groupId));
//		return factory;
//	}
//
//	@Bean
//	public ConsumerFactory<String, TelemetryEvent> telemetryEventConsumerFactory(String groupId) {
//		Map<String, Object> props = new HashMap<>();
//		props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,bootstrapAddress);
//		props.put(ConsumerConfig.GROUP_ID_CONFIG,groupId);
//		props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,StringDeserializer.class);
//		return new DefaultKafkaConsumerFactory<>(
//				props,
//				new StringDeserializer(),
//				new JsonDeserializer<>(TelemetryEvent.class));
//	}
//
//	@Bean
//	public ConcurrentKafkaListenerContainerFactory<String, TelemetryEvent> telemetryEventListenerContainerFactory(String groupId) {
//		ConcurrentKafkaListenerContainerFactory<String, TelemetryEvent> factory =
//				new ConcurrentKafkaListenerContainerFactory<>();
//		factory.setConsumerFactory(telemetryEventConsumerFactory(groupId));
//		return factory;
//	}
}
