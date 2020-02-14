package com.amazon.test.util;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.amazon.test.base.TestBase;

public class TestUtil extends TestBase{
	public static int IMPLICIT_WAIT_TIME=10;
	public static int PAGE_LOAD_TIME_OUT=30;
	
	public void TakePageScreenshot(String Pagename){
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("C:\\Users\\425627\\Documents\\workspace-sts-3.8.3.RELEASE\\Amazon\\Screenshots\\"+Pagename+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
