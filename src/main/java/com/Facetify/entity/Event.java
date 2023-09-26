package com.Facetify.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
import lombok.*;

@Entity

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString


@Table(name = "events")
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "event_id")
	private Long eventId;

	@ManyToOne
//	@MapsId("publicationId")
	@JsonIgnoreProperties("events")
	@JoinColumn(name = "publication_id")
	private Publication publication;

	@ManyToOne
//	@MapsId("profileId")
	@JsonIgnoreProperties("publications")
	@JoinColumn(name = "profile_id")
	private Profile profile;

}
