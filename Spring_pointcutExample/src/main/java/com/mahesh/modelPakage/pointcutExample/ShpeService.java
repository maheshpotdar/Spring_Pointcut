package com.mahesh.modelPakage.pointcutExample;

public class ShpeService {

	private Traingle trainegle;
	private Circle circle;

	public ShpeService() {
		// TODO Auto-generated constructor stub
	}

	public Traingle getTrainegle() {
		return trainegle;
	}

	public void setTrainegle(Traingle trainegle) {
		this.trainegle = trainegle;
	}

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	@Override
	public String toString() {
		return "Employee [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
