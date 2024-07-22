package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class WelcomePage extends ProjectSpecificMethod {
	public void verifyLogin() {
		String welcomeName = driver.findElement(By.xpath("//h2[text()='Welcome ']")).getText();
		if(welcomeName.contains("Welcome")) {
			System.out.println("Login Successful");
			
		}else {
			System.out.println("Login UnSuccessfull");

		}
	}
	public MyHomePage crmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();

	}

}
