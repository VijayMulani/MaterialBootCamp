
public abstract class Unit {
	private final int CENTIMETER_TO_METER=100;
	private final float CENTIMETER_TO_INCH=2.54F;
	private final float CENTIMETER_TO_FOOT=0;
	abstract double getCentimeterLength();
	public boolean unitEquals(Unit unit)
	{
		return this.getCentimeterLength()==unit.getCentimeterLength();
	}
	
}
