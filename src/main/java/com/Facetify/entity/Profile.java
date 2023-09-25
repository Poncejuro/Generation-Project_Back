package com.Facetify.entity;

import java.util.*;

import com.Facetify.entity.limits.ProfileFieldLimits;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
import lombok.*;

@Entity

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Table(name = "profiles")
public class Profile implements ProfileFieldLimits {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "profileId")
	private Long profileId;
	@Column(name = "role", nullable = false, length = ROLE_DB_LENGTH)
	private String role;
	@Column(name = "biography", nullable = false, length = BIOGRAPHY_DB_LENGTH)
	private String biography;
	@Column(name = "photo", nullable = false, length = PHOTO_DB_LENGTH)
	private String photo;

	@OneToOne
	@MapsId("userId")
	@JoinColumn(name = "user_id")
	private User user;

	@OneToMany(mappedBy = "profile")
	@JsonIgnoreProperties
	private List<Publication> publications = new ArrayList();

	@OneToMany(mappedBy = "followee", fetch = FetchType.EAGER)
	private List<People> followers;

	@OneToMany(mappedBy = "follower", fetch = FetchType.EAGER)
	private List<People> followees;

}
