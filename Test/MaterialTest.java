import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;


public class MaterialTest {

/*	@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	
	@Test
	public void testWhetherCentimeterEqualsMeter()
	{
		Centimeter cm=new Centimeter(100);
		Meter meter=new Meter(1);
		Assert.assertTrue(Material.isCentimeterEqualToMeter(cm, meter));
	}
	@Test
	public void testWhetherCentimeterNotEqualsMeter()
	{
		Centimeter cm=new Centimeter(100);
		Meter meter=new Meter(2);
		Assert.assertFalse(cm.unitEquals(meter));
	}
	@Test
	public void testWhetherCentimeterConvertsToInch()
	{
		Centimeter cm=new Centimeter(2.54);
		
		Assert.assertTrue(cm.unitEquals(Inch.getInchValue(cm)));
	}
	@Test
	public void testWhetherFootConvertsToYard()
	{
		Foot foot=new Foot(4);
		
		Assert.assertEquals(121.92, Yard.getYardValue(foot).getCentimeterLength(), 2);
		
	}
	@Test
	public void testWhetherMeterConvertsToInch()
	{
		Meter meter=new Meter(125);
		
		Assert.assertEquals(12500, Inch.getInchValue(meter).getCentimeterLength(),2);
	}
	@Test
	public void testWhetherUnitsAreEqual()
	{
		Inch inch=new Inch(100);
		Meter meter=new Meter(2.54);
		Assert.assertTrue(inch.unitEquals(meter));
	}

}
