package practise;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class TestNGDemo {

	@BeforeSuite
	public void BeforeSuit() {
		System.out.println("Before Suit");
	}
	@BeforeTest
	public void BeforTest() {
		System.out.println("Before Test");
	}
	@BeforeClass
	public void BeforClass() {
		System.out.println("Before Class");
	}
	@BeforeGroups
	public void BeforGroup() {
		System.out.println("Before Group");
	}
	@BeforeMethod
	public void BeforMethod() {
		System.out.println("Before Method");
	}
	@Test
	public void  test1() {
		System.out.println("Test 1");
	}
	@Test
	public void  test2() {
		
		System.out.println("Test 2");	
	}
	@AfterSuite
	public void AfterSuit() {
		System.out.println("After Suit");
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("After Test");
	}
	@AfterClass
	public void AfterClass() {
		System.out.println("After Class");
	}
	@AfterGroups
	public void AfterGroup() {
		System.out.println("After Group");
	}
	@AfterMethod
	public void AfterMethod() {
		System.out.println("After Method");
	}
	
}
