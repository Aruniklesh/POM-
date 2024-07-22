package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class ViewLeadPage extends ProjectSpecificMethod{
public void verifyLeads() {
	String leadfirstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
	if(leadfirstName.contains("Hari")) {
		System.out.println("Lead is Created");
	}
	else {
		System.out.println("Lead is not created");
	}
	
}
}
