package org.thoughtworks.temp;

public abstract class Temperature {
	private double degree;
	public double getDegree()
	{
		return degree;
	}
	public Temperature(double degree) {
		super();
		this.degree = degree;
	}
	public boolean isEqualTo(Temperature t)
	{
		return getCelcius()==t.getCelcius();
	}
	public abstract double getCelcius();

}
