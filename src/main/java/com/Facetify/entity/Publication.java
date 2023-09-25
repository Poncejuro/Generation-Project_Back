package com.Facetify.entity;

import java.util.*;

import com.Facetify.entity.limits.PublicationFieldLimits;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.*;

@Entity

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Table(name = "publications")
public class Publication implements PublicationFieldLimits {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "publicationId")
	private Long publicationId;
	@Column(name = "title", nullable = false, length = TITLE_DB_LENGTH)
	private String title;
	@Column(name = "footer", nullable = false, length = FOOTER_DB_LENGTH)
	private String footer;
	@Column(name = "event_details", nullable = false, length = EVENTDETAILS_DB_LENGTH)
	private String event_details;
	@Column(name = "img", nullable = false, length = IMG_DB_LENGTH)
	private String img;

	@ManyToOne(fetch = FetchType.EAGER)
	@MapsId("profileId")
	@JoinColumn(name = "profile_id")
	@JsonIgnore
	private Profile profile;

	@OneToMany(mappedBy = "publication", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Event> events = new ArrayList();

	@OneToMany(mappedBy = "followee", fetch = FetchType.EAGER)
	private List<People> followers;

	@OneToMany(mappedBy = "follower", fetch = FetchType.EAGER)
	private List<People> followees;
}
