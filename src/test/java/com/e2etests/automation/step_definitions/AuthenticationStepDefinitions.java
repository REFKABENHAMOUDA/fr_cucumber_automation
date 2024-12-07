package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.e2etests.automation.page_objects.AuthenticationPage;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthenticationStepDefinitions {


	private AuthenticationPage authenticationPage;

	public AuthenticationStepDefinitions() {
		this.authenticationPage = new AuthenticationPage();
	}

	@Given("Je me connecte sur l application Mercury")
	public void jeMeConnecteSurLApplicationMercury() {
		authenticationPage.goToURL();
		}

	@When("Je saisie le username {string}")
	public void jeSaisieLeUsername(String name) {
		authenticationPage.fillUserName(name);
	}

	@When("Je saisie password {string}")
	public void jeSaisiePassword(String password) {
		authenticationPage.fillPassword(password);
	}

	@When("Je clique sur le boutton submit")
	public void jeCliqueSurLeBouttonSubmit() {
		authenticationPage.clickOnSubmitButton();
	}

	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String text) {
		
		String message = authenticationPage.welcomeMessage.getText();
				Assert.assertEquals(message, text);

	}
	
	

}