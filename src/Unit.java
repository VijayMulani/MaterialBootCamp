
public abstract class Unit{
	public abstract double getConversionFactor();
	public double getValue()
	{
		return this.getValue();
	}
	abstract double getCentimeterLength();
	public abstract Unit clone(double value);
	public boolean unitEquals(Unit unit)
	{
		return this.getCentimeterLength()==unit.getCentimeterLength();
		
	}
	public Unit add(Unit unit)
	{
		double v=getValue()+unit.getCentimeterLength()/this.getConversionFactor();
		return this.clone(v);
	}
}
