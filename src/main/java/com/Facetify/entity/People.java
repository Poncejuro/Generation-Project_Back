package com.Facetify.entity;

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

//	@Id
	@ManyToOne
	@JoinColumn(name = "follower_id")
	private Profile follower;

//	@Id
	@ManyToOne
	@JoinColumn(name = "followee_id")
	private Profile followee;

}
//	public People(Profile follower, Profile followee) {
//		this.follower = follower;
//		this.followee = followee;
//	}
