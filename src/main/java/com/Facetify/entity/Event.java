package com.Facetify.entity;

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
	@EmbeddedId
	private Long EventId;

	@ManyToOne
	@MapsId("publicationId")
	@JoinColumn(name = "publication_id")
	private Publication publication;

	@ManyToOne
	@JoinColumn(name = "profile_id")
	private Profile profile;

}
