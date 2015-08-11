package org.thoughtworks.volume;

public class Teaspoon extends Volume{

	private double quantity;
	@Override
	public double getVolumeInTeaspoon() {
		// TODO Auto-generated method stub
		return quantity;
	}
	public Teaspoon(double d) {
		super();
		this.quantity = d;
	}
	public static Teaspoon convertVolumeToTeaspoon(Volume v)
	{
		return new Teaspoon(v.getVolumeInTeaspoon());
	}
	@Override
	public String toString() {
		return "Teaspoon [quantity=" + quantity + "]";
	}
	public Teaspoon add(Volume v)
	{
		return new Teaspoon(quantity+v.getVolumeInTeaspoon());
	}
}
