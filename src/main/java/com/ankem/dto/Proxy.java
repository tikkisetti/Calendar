package com.ankem.dto;

public class Proxy {
	
	String url;
	String type;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Proxy(String type, String url) {
	
		this.type = type;
		this.url = url;
	}
	
	

}
