package org.thoughtworks.temp;

public class Celcius extends Temperature {

	public Celcius(double degree) {
		super(degree);
	}

	@Override
	public double getCelcius() {
		// TODO Auto-generated method stub
		return getDegree();
	}
	public static Celcius parseCelcius(Temperature t)
	{
		double value=t.getCelcius();
		return new Celcius(value);
	}

}
