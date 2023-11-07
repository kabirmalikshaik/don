package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import uservalidation.Validations;


public class Testcases {
	Validations uv=new Validations();
	@Test
	public void testcase1()
	{
		Assert.assertEquals(true,uv.check("sameer","123"));
	}
	@Test
	public void testcase2()
	{
		Assert.assertEquals(true,uv.check("sameer","123"));
	}
	@Test
	public void testcase3()
	{
		Assert.assertEquals(false,uv.check("rocky","189"));
	}
	@Test
	public void testcase4()
	{
		Assert.assertEquals(false,uv.check("john","894"));
	}
}


