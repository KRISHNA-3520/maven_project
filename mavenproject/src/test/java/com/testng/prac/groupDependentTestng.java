package com.testng.prac;

import org.testng.annotations.Test;

public class groupDependentTestng {
  
	@Test(dependsOnGroups = {"SignIn"})
	public void viewAcc() {
		System.out.println("View your dashboard");
	}
	
	 @Test(groups = { "SignIn" })
	    public void OpenBrowser() {
	        System.out.println("Browser Opened Successfully");
	    }
	 
	    @Test(groups = { "SignIn" })
	    public void LogIn() {
	        System.out.println("Login Into The Account");
	    }
}
