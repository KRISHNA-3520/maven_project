package com.practice.practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;


/* TESTNG sequence
This will execute before the Test Suite - beforeSuite()
This will execute before the Test - beforeTest()
This will execute before the Class - beforeClass()
This will execute before every Method - beforeMethod()
This is the A Normal Test Case - normal test method
This will execute after every Method - afterMethod
This will execute after the Class - afterClass()
This will execute after the Test - afterTest()
PASSED: testCase1
 */

public class Testng1 {
	WebDriver driver = new ChromeDriver();
    // Saving the expected title of the Webpage
    String title = "ToolsQA - Demo Website For Automation";
    
   
    @Test(groups = { "demo" })
    public void a(){
    	System.out.println("This is the starting point of the test");
    	//Initialize Chrome Driver
    	//driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
    
    	 driver.get("https://www.google.com/");
    }
    
    
    @Test(groups = { "demo" })	
    public void b() {	
       String testTitle = "Google";
       String originalTitle = driver.getTitle();
      Assert.assertEquals(originalTitle, testTitle);
    }	
    
    @Test(groups = { "demo" })	
    public void c() {	
       driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")).click();
        System.out.println("Clicked on Gmail");	
    }

}
