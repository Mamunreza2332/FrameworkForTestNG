package class_01_execution;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Lec_01_M01_Execuation {
	
	/*
	 * What, When, where
	 * Question 1: Frist 
	 * Question 2:
	 * 
	 */
	
	@BeforeClass
	public void test1() {
		System.out.println("Frist");
	}
	
	@Test
	public void test2() {
		System.out.println("Second");
	}
	
	@AfterClass
	public void test3() {
		System.out.println("Thrird");
	}
	
	
	
}
