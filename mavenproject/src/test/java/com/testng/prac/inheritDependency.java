package com.testng.prac;

import org.testng.annotations.Test;

class SuperClass{
	@Test
	public void OpenBrowser() {
		System.out.println("Browser Opened");
	}
}

public class inheritDependency extends SuperClass{
  
	@Test(dependsOnMethods = {"OpenBrowser"})
	public void Login() {
		System.out.println("Logged In");
	}
}
