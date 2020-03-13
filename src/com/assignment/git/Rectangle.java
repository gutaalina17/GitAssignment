package com.assignment.git;

public class Rectangle implements Drawable {
	private float length;
	private float height;
	
	public Rectangle(float length, float height) {
		this.length = length;
		this.height = height;
	}

	@Override
	public float getSize() {
		return length * height;
	}
	
	

}
