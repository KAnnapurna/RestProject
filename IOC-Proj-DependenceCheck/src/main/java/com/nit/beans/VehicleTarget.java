package com.nit.beans;

public class VehicleTarget {
	
	private int id;
	private EngineDependent engine;
	public void setId(int id) {
		this.id = id;
	}
	public void setEngine(EngineDependent engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "VehicleTarget [id=" + id + ", engine=" + engine + "]";
	}
	

}
