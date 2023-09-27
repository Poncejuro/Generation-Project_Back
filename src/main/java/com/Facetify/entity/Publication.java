package com.Facetify.entity;

import com.Facetify.entity.limits.PublicationFieldLimits;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
	private String eventDetails;
	@Column(name = "img", nullable = false, length = IMG_DB_LENGTH)
	private String img;

	@ManyToOne
	@JsonIgnoreProperties("publications")
	@JoinColumn(name = "profile_id")
	private Profile profile;

//	@OneToMany(mappedBy = "publication")
//	private List<Event> events = new ArrayList<>();

}
