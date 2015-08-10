
public class Meter extends Unit{

	@Override
	public String toString() {
		return "Meter [value=" + value + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Meter other = (Meter) obj;
		if (Double.doubleToLongBits(value) != Double
				.doubleToLongBits(other.value))
			return false;
		return true;
	}
	private double value;
	private static final double METER_TO_CENTIMETER=100;
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
	public static Meter getMeterValue(Unit unit)
	{
		return new Meter(unit.getCentimeterLength()/METER_TO_CENTIMETER);
	}
}
