package com.shiva.kafka.event;

import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;
import java.sql.Timestamp;

@Getter
@Builder
public class TelemetryEvent implements Serializable {

	private String id;

	private String name;

	private String description;

	private Long versionId;

	private Double latitude;

	private Double longitude;

	private Double altitude;

	private Double speed;

	private boolean direction;

	private Timestamp timestamp;
}
