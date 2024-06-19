package com.onlineorder.entity;

import com.onlineorder.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders")
public class Order extends BaseEntity{

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@OneToMany
	private List<Product> products;

	private Double totalPrice;

	@Enumerated(EnumType.STRING)
	private OrderStatus orderStatus;
}
