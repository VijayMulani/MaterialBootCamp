
public class Meter extends Unit{
	private double value;
	private final int METER_TO_CENTIMETER=100;
	public Meter(double value) {
		super();
		this.value = value;
	}
	public double getCentimeterValue()
	{
		return value*METER_TO_CENTIMETER;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public double getCentimeterLength() {
		return getCentimeterValue();
	}
}
