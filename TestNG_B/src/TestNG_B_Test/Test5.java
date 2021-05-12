package TestNG_B_Test;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class Test5 {
	@Test
	public void Test6() {
		System.out.println("Test 6 should be executed");

	}
	@BeforeTest
	public void Beforeest() {
		System.out.println("Test  should be executed before test");

	}
	@Test
	public void Test7() {
		System.out.println("Test 7 should be executed");

	}
	@AfterTest
	public void aftertest() {
		System.out.println("Test should be execueted after Test");

	}
	@Test
	public void test8() {
		System.out.println("Test8 should be executed");

	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("Test should be executed after Suite");

	}
	@AfterClass
	public void afterclass() {
		System.out.println("Test should be executed after class");

	}
	

}
