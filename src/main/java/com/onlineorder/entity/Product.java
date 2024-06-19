package com.onlineorder.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product extends BaseEntity {

	@Column(nullable = false)
	private String name;


	private String description;

	@Column(nullable = false)
	private Double price;

	@Column(nullable = false)
	private Integer quantity;
}
