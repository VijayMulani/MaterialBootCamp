package org.thoughtworks.volume;

public class Ounce extends Volume {
	private double quantity;
	public Ounce(double quantity) {
		super();
		this.quantity = quantity;
	}
	private static double OUNCE_TO_TEASPOON=6;
	@Override
	public double getVolumeInTeaspoon() {
		// TODO Auto-generated method stub
		return quantity*OUNCE_TO_TEASPOON;
	}
	public static Ounce convertVolumeToOunce(Volume v)
	{
		return new Ounce(v.getVolumeInTeaspoon()/OUNCE_TO_TEASPOON);
	}
	@Override
	public String toString() {
		return "Ounce [quantity=" + quantity + "]";
	}
	public Ounce add(Volume v)
	{
		return new Ounce(quantity+v.getVolumeInTeaspoon()/OUNCE_TO_TEASPOON);
	}
}
