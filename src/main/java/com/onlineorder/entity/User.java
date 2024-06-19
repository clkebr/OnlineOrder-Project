package com.onlineorder.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.onlineorder.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Setter @Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User extends BaseEntity {

	@Column(unique = true)
	private String username;

	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private String password;

	private String firstname;
	private String lastname;
	private String phone;

	@Enumerated(EnumType.STRING)
	private Role role;

	private boolean enabled;
}
