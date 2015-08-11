package org.thoughtworks.volume;

public class Cup extends Volume {

	private double quantity;
	private static double CUP_TO_TEASPOON=48;
	@Override
	public double getVolumeInTeaspoon() {
		// TODO Auto-generated method stub
		return quantity*CUP_TO_TEASPOON;
	}
	public Cup(double quantity) {
		super();
		this.quantity = quantity;
	}
	public static Cup convertVolumeToCup(Volume v)
	{
		return new Cup(v.getVolumeInTeaspoon()/CUP_TO_TEASPOON);
	}
	@Override
	public String toString() {
		return "Cup [quantity=" + quantity + "]";
	}
	public Cup add(Volume v)
	{
		return new Cup(quantity+v.getVolumeInTeaspoon()/CUP_TO_TEASPOON);
	}
}
