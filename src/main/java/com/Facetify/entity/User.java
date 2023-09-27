package com.Facetify.entity;

import java.sql.Timestamp;

import com.Facetify.entity.limits.UserFieldLimits;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
import lombok.*;

@Entity

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Table(name = "users")
public class User implements UserFieldLimits {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userId")
	private Long userId;
	@Column(name = "fullname", nullable = false, length = FULLNAME_DB_LENGTH)
	private String fullName;
	@Column(name = "email", nullable = false, unique = true, length = EMAIL_DB_LENGTH)
	private String email;
	@Column(name = "cellphone", nullable = false, length = CELLPHONE_DB_LENGTH)
	private String cellphone;
	@Column(name = "password", nullable = false, length = CELLPHONE_DB_LENGTH)
	private String password;
	@Column(name = "created_at", insertable = false, updatable = false, columnDefinition = "timestamp default CURRENT_TIMESTAMP")
	private Timestamp createdAt;
	@Column(name = "active")
	private Boolean active;

	@OneToOne(mappedBy = "user")
	@JsonIgnoreProperties("user")
	private Profile profile;
}
