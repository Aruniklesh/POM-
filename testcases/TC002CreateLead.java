package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;
import pages.WelcomePage;

public class TC002CreateLead extends ProjectSpecificMethod {
	@Test
	public void runLogin() {
		LoginPage lp = new LoginPage();
		lp.enterUserName().enterPassword().ClickLogin().crmsfa().clickLead().clickCreateLead().enterCompanyName().enterFirstName().enterLastName()
		.clickSubmit().verifyLeads();

	}
}
