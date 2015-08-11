package org.thoughtworks.volume;

public class Tablespoon extends Volume {

	private double quantity;
	private static double TABLESPOON_TO_TEASPOON=3;
	@Override
	public double getVolumeInTeaspoon() {
		// TODO Auto-generated method stub
		return quantity*TABLESPOON_TO_TEASPOON;
	}
	public Tablespoon(double quantity) {
		super();
		this.quantity = quantity;
	}
	public static Tablespoon convertVolumeToTablespoon(Volume v)
	{
		return new Tablespoon(v.getVolumeInTeaspoon()/TABLESPOON_TO_TEASPOON);
	}
	@Override
	public String toString() {
		return "Tablespoon [quantity=" + quantity + "]";
	}
	public Tablespoon add(Volume v)
	{
		return new Tablespoon(quantity+v.getVolumeInTeaspoon()/TABLESPOON_TO_TEASPOON);
	}
}
