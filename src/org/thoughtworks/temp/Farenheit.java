package org.thoughtworks.temp;

public class Farenheit extends Temperature {

	@Override
	public double getCelcius() {
		return (getDegree()-32)*5/9;
	}
	public Farenheit(double degree)
	{
		super(degree);
	}
	public static Farenheit parseFarenheit(Temperature t)
	{
		double value=t.getCelcius();
		return new Farenheit((value*(9.0/5))+32);
	}
}
