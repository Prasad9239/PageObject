package com.test.amazon.TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.amazon.test.base.TestBase;
import com.amazon.test.pages.NaviagtionPage;
import com.amazon.test.util.TestUtil;

public class NavigationTest extends TestBase {
	NaviagtionPage naviagtionPage;
	TestUtil testUtil;
	
	
	public NavigationTest() {
		initialization();
		naviagtionPage=new NaviagtionPage();
		testUtil=new TestUtil();
	}
	
	@Test
	public void Navigate(){
		System.out.println(this.getClass().getName());
		//testUtil.TakePageScreenshot(this.getClass().getName());
		naviagtionPage.NavigateToSearchScreen();
		
		
	}
	
	@AfterClass
	public void teardown(){
		driver.close();
	}
}
