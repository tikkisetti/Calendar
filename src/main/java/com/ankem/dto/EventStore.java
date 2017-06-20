package com.ankem.dto;

public class EventStore {
	
	Proxy proxy;

	public Proxy getProxy() {
		return proxy;
	}

	public void setProxy(Proxy proxy) {
		this.proxy = proxy;
	}

	public EventStore(Proxy proxy) {
	
		this.proxy = proxy;
	}
	
	

}
