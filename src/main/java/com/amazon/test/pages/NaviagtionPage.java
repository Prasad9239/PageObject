package com.amazon.test.pages;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazon.test.base.TestBase;

public class NaviagtionPage extends TestBase {
	
	@FindBy(id="nav-hamburger-menu")
	WebElement MenuNavigator;
	
	@FindBy(xpath="//a[@data-menu-id='7']")
	WebElement ComputersAndMobilelink;
	
	@FindBy(xpath="//div[contains(text(),'Laptops')]")
	WebElement LaptopsLink;
	
	public NaviagtionPage() {
		PageFactory.initElements(driver, this);
	}
	
	public SearchProductsPage NavigateToSearchScreen(){
		MenuNavigator.click();
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ComputersAndMobilelink);
		ComputersAndMobilelink.click();
		
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", LaptopsLink);
		LaptopsLink.click();
		
//		Alert alert=driver.switchTo().alert();
//		alert.accept();
//		
//		driver.switchTo().frame(1);
//		driver.switchTo().parentFrame();
//		
//		Set<String> windows=driver.getWindowHandles();
//		
//		driver.switchTo().window(windows.iterator().next());
//		
//		Select select=new Select(ComputersAndMobilelink);
//		select.selectByIndex(1);
//		
//		MenuNavigator.isSelected();
//		MenuNavigator.click();
//		
//		driver.switchTo().frame(1);
//		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		WebDriverWait wait=new WebDriverWait(driver, 10);
//		
//		wait.until(ExpectedConditions.elementToBeClickable(LaptopsLink));
//		
//		
//		Actions actions=new Actions(driver);
//		
//		actions.contextClick(MenuNavigator).build().perform();
//		
//		actions.dragAndDrop(LaptopsLink, ComputersAndMobilelink).build().perform();
//		
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		
//		MenuNavigator.getText();
//		MenuNavigator.getAttribute("name");
//		
//		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		try {
//			FileUtils.copyDirectory(src, new File("D:\\testng\\screenshot.png"));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		return new SearchProductsPage();
		
		
		
	}
}
