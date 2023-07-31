package com.testng.prac;

import org.testng.annotations.Test;

public class dependsOnExample {
	/* @Test (dependsOnMethods = { "OpenBrowser" })
	  public void SignIn() {
		  System.out.println("User has signed in successfully");
	  }

	  @Test
	  public void OpenBrowser() {
		  System.out.println("The browser is opened");
	  }

	  @Test (dependsOnMethods = { "SignIn" })
	  public void LogOut() {
		  System.out.println("The user logged out successfully");
	  } */
	
	 @Test
	    public void OpenBrowser() {
	        System.out.println("Opening The Browser");
	    }

	    @Test(dependsOnMethods = { "SignIn", "OpenBrowser" })
	    public void LogOut() {
	        System.out.println("Logging Out");
	    }
	    
	    @Test
	    public void SignIn() {
	        System.out.println("Signing In");
	    }
}
