
public class Inch extends Unit{

	@Override
	public String toString() {
		return "Inch [value=" + value + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Inch other = (Inch) obj;
		if (Double.doubleToLongBits(value) != Double
				.doubleToLongBits(other.value))
			return false;
		return true;
	}

	private static final double INCH_TO_CENTIMETER=2.54;
	private double value;
	@Override
	double getCentimeterLength() {
		
		return value*INCH_TO_CENTIMETER;
	}
	public Inch(double value) {
		super();
		this.value = value;
	}
	
	public static Inch getInchValue(Unit unit)
	{
		return new Inch(unit.getCentimeterLength()/INCH_TO_CENTIMETER);
	}
/*	public Inch add(Unit unit)
	{
		return new Inch(value+unit.getCentimeterLength()/INCH_TO_CENTIMETER);
	}*/
	@Override
	public double getConversionFactor() {
		// TODO Auto-generated method stub
		return INCH_TO_CENTIMETER;
	}
	@Override
	public Unit clone(double value) {
		// TODO Auto-generated method stub
		return new Inch(value);
	}
}
