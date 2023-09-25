package com.Facetify.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Table(name = "people")
public class People {
	@Id
	@ManyToOne
	@JoinColumn(name = "follower_id")
	private User follower;

	@Id
	@ManyToOne
	@JoinColumn(name = "followee_id")
	private User followee;
}
