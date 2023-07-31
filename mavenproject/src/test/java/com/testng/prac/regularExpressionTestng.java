package com.testng.prac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class regularExpressionTestng {
	WebDriver driver = new ChromeDriver();;
    // Saving the expected title of the Webpage
    String title = "ToolsQA - Demo Website For Automation";
    
   
    @Test
    public void starting_point(){
    	System.out.println("This is the starting point of the test");
    	//Initialize Chrome Driver
    	//driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
    	// driver = new ChromeDriver();
    //	 driver.get("https://demoqa.com/");
    }
    
    
    @Test(groups = { "demo1" })	
    public void checkTitle() {	
   	 driver.get("https://www.toolsqa.com/");
   	 String testTitle = "Tools QA";
       String originalTitle = driver.getTitle();
      Assert.assertEquals(originalTitle, testTitle);
    }	
    
    @Test(groups = { "demo2" })	
    public void click_element() {	
       driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[4]/div[2]/a")).click();
        System.out.println("Clicked on Read More");	
    }

}
