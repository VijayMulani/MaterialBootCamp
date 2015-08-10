
public abstract class Unit {
	abstract double getCentimeterLength();
	public boolean unitEquals(Unit unit)
	{
		return this.getCentimeterLength()==unit.getCentimeterLength();
	}
}
