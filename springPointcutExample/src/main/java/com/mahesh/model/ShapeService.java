package com.mahesh.model;

public class ShapeService {

	private Circle circle;
	private Traingle traingle;

	public ShapeService() {
		// TODO Auto-generated constructor stub
	}

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public Traingle getTraingle() {
		return traingle;
	}

	public void setTraingle(Traingle traingle) {
		this.traingle = traingle;
	}

	public ShapeService(Circle circle, Traingle traingle) {
		super();
		this.circle = circle;
		this.traingle = traingle;
	}

	@Override
	public String toString() {
		return "ShaepeService [circle=" + circle + ", traingle=" + traingle + "]";
	}
	
}
