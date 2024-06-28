package com.onlineorder.dto;

import com.onlineorder.entity.Product;
import com.onlineorder.entity.User;
import com.onlineorder.enums.OrderStatus;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

public class OrderDto {

	@NotBlank
	private User user;

	private List<Product> products;

	private Double totalPrice;

	private OrderStatus orderStatus;
}
