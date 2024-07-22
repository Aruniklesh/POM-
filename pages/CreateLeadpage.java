package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class CreateLeadpage extends ProjectSpecificMethod {
	public CreateLeadpage enterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		return this;
	}

	public CreateLeadpage enterFirstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		return this;
	}

	public CreateLeadpage enterLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		return this;
	}
	public ViewLeadPage clickSubmit() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage();

	}
}
