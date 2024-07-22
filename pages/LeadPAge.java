package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class LeadPAge extends ProjectSpecificMethod{
public CreateLeadpage clickCreateLead() {
	driver.findElement(By.linkText("Create Lead")).click();
	return new CreateLeadpage();

}
}
