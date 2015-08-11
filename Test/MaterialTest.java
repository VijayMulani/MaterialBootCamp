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
		Assert.assertTrue(cm.unitEquals(meter));
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
	@Test
	public void addInchToCentimeter()
	{
		Inch inch=new Inch(10.9);
		Centimeter cm=new Centimeter(109);
		//Centimeter addition=new Centimeter(353);
		Centimeter addition=(Centimeter)cm.add(inch);
		Assert.assertEquals(136.686,addition.getCentimeterLength());
	}
	@Test
	public void addCentimeterToMeter()
	{
		Centimeter cm=new Centimeter(10);
		Meter meter=new Meter(100);
		Meter addition=(Meter)meter.add(cm);
		Assert.assertEquals(100.1, addition.getValue());
	}

}
