package com.onlineorder.enums;

public enum Role {
	ADMIN("Admin"),
	USER("User");

	private final String value;
	Role(String value) {
		this.value = value;
	}
	public String getValue() {
		return value;
	}
}
