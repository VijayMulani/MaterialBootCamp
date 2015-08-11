package org.thoughtworks.volume;

import junit.framework.Assert;

import org.junit.Test;

public class VolumeTest {

	
	@Test
	public void whetherTeaspoonEqualsTablespoon()
	{
		Teaspoon tsp=new Teaspoon(3);
		Tablespoon tbsp=new Tablespoon(1);
		Assert.assertTrue(tsp.isEqual(tbsp));
	}
	@Test
	public void whetherTeaspoonEqualsOunce()
	{
		Teaspoon tsp=new Teaspoon(6);
		Ounce oz=new Ounce(1);
		Assert.assertTrue(tsp.isEqual(oz));
	}
	@Test
	public void whetherTeaspoonEqualsCup()
	{
		Teaspoon tsp=new Teaspoon(48);
		Cup cup=new Cup(1);
		Assert.assertTrue(tsp.isEqual(cup));
	}
	@Test
	public void whetherTablespoonEqualsCup()
	{
		Tablespoon tbsp=new Tablespoon(16);
		Cup cup=new Cup(1);
		Assert.assertTrue(tbsp.isEqual(cup));
	}
	@Test
	public void whetherTeaspoonConvertsToOunce()
	{
		Teaspoon tsp=new Teaspoon(7.544);
		Ounce oz=Ounce.convertVolumeToOunce(tsp);
		System.out.println(oz.getVolumeInTeaspoon());
		System.out.println(tsp);
		Assert.assertEquals(7.544, oz.getVolumeInTeaspoon(),3);
	}
	@Test
	public void whetherCupConvertsToTablespoon()
	{
		Cup cup=new Cup(1);
		Tablespoon tbsp=Tablespoon.convertVolumeToTablespoon(cup);
		System.out.println(tbsp.getVolumeInTeaspoon());
		System.out.println(cup.getVolumeInTeaspoon());
		Assert.assertEquals(48.0,tbsp.getVolumeInTeaspoon());
	}
	@Test
	public void whetherCupAddsOunce(){
		Cup cup=new Cup(10);
		Ounce oz=new Ounce(8);
		Cup newCup=cup.add(oz);
		System.out.println(newCup);
		System.out.println(newCup.getVolumeInTeaspoon());
		Assert.assertEquals(528.0, newCup.getVolumeInTeaspoon());
	}
}
