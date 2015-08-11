
public class Foot extends Unit {

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Foot other = (Foot) obj;
		if (Double.doubleToLongBits(value) != Double
				.doubleToLongBits(other.value))
			return false;
		return true;
	}
	private static final double FOOT_TO_CENTIMETER=30.48;
	public Foot(double value) {
		super();
		this.value = value;
	}
	private double value;
	@Override
	double getCentimeterLength() {
		return value*FOOT_TO_CENTIMETER;
	}

	public static Foot getFootValue(Unit unit)
	{
		return new Foot(unit.getCentimeterLength()/FOOT_TO_CENTIMETER);
	}

	@Override
	public String toString() {
		return "Foot [value=" + value + "]";
	}

	@Override
	public double getConversionFactor() {
		// TODO Auto-generated method stub
		return FOOT_TO_CENTIMETER;
	}

	@Override
	public Unit clone(double value) {
		// TODO Auto-generated method stub
		return new Foot(value);
	}
	
/*	public Foot add(Unit unit)
	{
		return new Foot(value+unit.getCentimeterLength()/FOOT_TO_CENTIMETER);
	}*/
}
