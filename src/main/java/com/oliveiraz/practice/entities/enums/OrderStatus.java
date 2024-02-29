package com.oliveiraz.practice.entities.enums;

public enum OrderStatus {
	
	WAITING_PAYMENTE(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	//construtor privado pois o tipo enum tem sua regra especial//
	private OrderStatus(int code) {
		this.code = code;
	}
	
	//método de acesso//
	public int getCode() {
		return code;
	}
	
	//tratamento de excessão para códigos inexistentes//
	public static OrderStatus valueOf(int code) {
		for(OrderStatus value : OrderStatus.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		
		throw new IllegalArgumentException("Invalid OrderStatus code");
		
	}

}
