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


@Table(name = "people")
public class People {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "people_id")
	private Long peopleId;

	@ManyToOne
	@JoinColumn(name = "follower_id")
	@JsonIgnoreProperties("people")
	private Profile follower;

	@ManyToOne
	@JoinColumn(name = "followee_id")
	@JsonIgnoreProperties("people")
	private Profile followee;

}

