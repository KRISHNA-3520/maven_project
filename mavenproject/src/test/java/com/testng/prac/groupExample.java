package com.testng.prac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class groupExample {
	WebDriver driver = new ChromeDriver();;
    // Saving the expected title of the Webpage
  //  String title = "ToolsQA";
    
   
    @Test
    public void starting_point(){
    	System.out.println("This is the starting point of the test");
    	
    	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }
    
    
    @Test(groups = {"demo"})	
    public void checkTitle() {	
    	driver.get("https://www.toolsqa.com/");
       String testTitle = "Tools QA";
       String originalTitle = driver.getTitle();
      Assert.assertEquals(originalTitle, testTitle);
    }	
    
    @Test(groups = {"demo"})	
    public void click_element() {	
       driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[4]/div[2]/a")).click();
        System.out.println("Clicked on Read More");	
        driver.quit();
    }
}
