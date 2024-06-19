package com.onlineorder.enums;

public enum OrderStatus {

	NEW("New"),
	READY("Ready"),
	DISPATCHED("Dispatched");

	private final String value;

	OrderStatus(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
