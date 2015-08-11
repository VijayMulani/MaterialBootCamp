
public class Yard extends Unit{

	@Override
	public String toString() {
		return "Yard [value=" + value + "]";
	}

	private static final double YARD_TO_CENTIMETER=91.44;
	private double value;
	public Yard(double value) {
		super();
		this.value = value;
	}
	@Override
	double getCentimeterLength() {
		return value*YARD_TO_CENTIMETER;
	}
	public static Yard getYardValue(Unit unit)
	{
		return new Yard(unit.getCentimeterLength()/YARD_TO_CENTIMETER);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Yard other = (Yard) obj;
		if (Double.doubleToLongBits(value) != Double
				.doubleToLongBits(other.value))
			return false;
		return true;
	}
	@Override
	public double getConversionFactor() {
		
		return YARD_TO_CENTIMETER;
	}
	@Override
	public Unit clone(double value) {
		// TODO Auto-generated method stub
		return new Yard(value);
	}
	
/*	public Yard add(Unit unit)
	{
		return new Yard(value+unit.getCentimeterLength()/YARD_TO_CENTIMETER);
	}*/
	
}
