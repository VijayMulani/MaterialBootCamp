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

}
