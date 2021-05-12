package TestNG_B_Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//@Author Sanjeev Kumar
public class TestNG_2 {

	@Test
	public void test1()
	{
		System.out.println("Test 1 should be executed");
	}
	@BeforeTest
	public void test2()
	{
		System.out.println("Test 2 should be executed");
	}
	@AfterTest
	public void test3()
	{
		System.out.println("Test 3 should be executed");
	}
	@Test
	public void test4()
	{
		System.out.println("Test 4 should be executed");
	}
}

