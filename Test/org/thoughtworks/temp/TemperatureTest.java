package org.thoughtworks.temp;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class TemperatureTest {

	@Test
	public void whetherFarenEqualsCelci()
	{
		Farenheit f=new Farenheit(212);
		Celcius c=new Celcius(100);
		Assert.assertTrue(f.isEqualTo(c));
	}
	@Test
	public void whetherCelciusConvertsToFarenheit()
	{
		Celcius c=new Celcius(100);
		Farenheit f=Farenheit.parseFarenheit(c);
		Assert.assertEquals(212, f.getDegree(),2);
	}
}
