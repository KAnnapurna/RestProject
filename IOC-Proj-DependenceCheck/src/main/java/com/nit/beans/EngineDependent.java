package com.nit.beans;

public class EngineDependent {

	private String type;

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "EngineDependent [type=" + type + "]";
	}
	
}
