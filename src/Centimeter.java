
public class Centimeter extends Unit{
	private final double CENTIMETER_TO_METER=0.01;
	public Centimeter(double value) {
		super();
		this.value = value;
	}
	private double value;
	public double getMeterValue()
	{
		System.out.println(value*CENTIMETER_TO_METER);
		return value*CENTIMETER_TO_METER;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public double getCentimeterLength() {
		return value;
	}
}
