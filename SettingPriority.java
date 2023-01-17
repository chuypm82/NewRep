package TestNG;

import org.testng.annotations.Test;

public class SettingPriority {
	@Test(priority=1)
	public void method1() {
		System.out.println("Running TestNG method1 ");
	 }
	 
	@Test(priority=2)
	public void method2() {
		System.out.println("Running TestNG method2 ");
	 }
			 
	@Test(priority=0)
	public void method3() {
		System.out.println("Running TestNG method3 ");
	 }
}
