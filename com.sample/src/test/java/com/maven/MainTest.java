package com.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class MainTest {

public static WebDriver driver;

    @Test
    public void verifylogin()
    {
    	
    	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"./Drivers/chromedriver.exe");
 	   driver = new ChromeDriver();	
 			 driver.get("http://demo.guru99.com/test/newtours/");
 			 System.out.println("Launched Browser successfully");
 			 driver.findElement(By.name("userName")).sendKeys("test");
 			 driver.findElement(By.name("password")).sendKeys("test1");
 			 
 			 
    }
 			 @AfterTest
 		    public void closingbrowser() {
 		    
 		   driver.close();
 		    	
    	
 		  System.out.println("Browser closed verified");
    	
    	
    	
    	
       
    }
}
