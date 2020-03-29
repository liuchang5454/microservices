package com.springcloud.microservices.currencyexchangeservices;

import java.math.BigDecimal;

public class ExchangeValue {
	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionValue;
	private int port;
	
	public ExchangeValue() {
		
	}
	
	public ExchangeValue(Long id, String from, String to, BigDecimal conversionValue) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionValue = conversionValue;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConversionValue() {
		return conversionValue;
	}
	public void setConversionValue(BigDecimal conversionValue) {
		this.conversionValue = conversionValue;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

}
