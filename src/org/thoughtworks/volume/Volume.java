package org.thoughtworks.volume;

public abstract class Volume {

	public boolean isEqual(Volume v)
	{
		return this.getVolumeInTeaspoon()==v.getVolumeInTeaspoon();
	}
	public abstract double getVolumeInTeaspoon(); 
}
