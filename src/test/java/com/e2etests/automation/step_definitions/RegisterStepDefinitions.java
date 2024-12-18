package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.RegisterPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefinitions {
	
	private RegisterPage registerPage;
	
	public RegisterStepDefinitions() {
		this.registerPage = new RegisterPage();
	}

	@Given("Je me connecte à l application Mercury")
	public void jeMeConnectÀLApplicationMercury() {
	    registerPage.goToURL();
	}
	
	@When("Je clique sur le bouton REGISTER")
	public void jeCliqueSurLeBoutonREGISTER() {
	    registerPage.registerBtn();
	}
	
	@Then("Je me redirige vers le fomulaire d enregistrement {string}")
	public void jeMeRedirigeVersLeFomulaireDEnregistrement(String text) {
	   String srcImageText = registerPage.registerImage.getAttribute("src");
	   Assert.assertEquals(srcImageText, text);
	}
	
	@Then("Je saisis le First Name {string}")
	public void jeSaisisLeFirstName(String fName) {
	    registerPage.fillFirstName(fName);
	}
	
	@Then("Je saisis le Last Name {string}")
	public void jeSaisisLeLastName(String lName) {
	    registerPage.fillLastName(lName);
	}
	
	@Then("Je saisis le Phone {string}")
	public void jeSaisisLePhone(String phone) {
	    registerPage.fillPhone(phone)
;
	}
	
	@Then("Je saisis l email {string}")
	public void jeSaisisLEmail(String email) {
	    registerPage.fillUserName(email)
;
	}
	
	@Then("Je saisis l adresse {string}")
	public void jeSaisisLAdresse(String adress) {
	    registerPage.fillAddress(adress);
	}
	
	@Then("Je saisis City {string}")
	public void jeSaisisCity(String city) {
	    registerPage.fillCity(city);
	}
	@Then("Je saisis State\\/Province {string}")
	public void jeSaisisStateProvince(String state) {
	    registerPage.fillState(state);
	}
	
	@Then("Je saisis Postal Code {string}")
	public void jeSaisisPostalCode(String pCode) {
	   registerPage.fillPostalCode(pCode);
	}
	
	@Then("Je selectionne Country {string}")
	public void jeSelectionneCountry(String country) {
	    registerPage.selectCountry(country);
	}
	
	@Then("Je saisis User Name {string}")
	public void jeSaisisUserName(String userName) {
	   registerPage.fillEmail(userName);
	}
	
	@Then("Je saisis Password {string}")
	public void jeSaisisPassword(String password) {
	    registerPage.fillPassword(password);
	}
	
	@Then("Je confirme Password {string}")
	public void jeConfirmePassword(String confPwd) {
	    registerPage.fillConfirmPassword(confPwd);
	}
	
	@Then("Je clique sur le bouton Envoyer")
	public void jeCliqueSurLeBoutonEnvoyer() {
	    registerPage.clickOnEnvoyerBtn();
	}
	
	@Then("Je me redirige vers la page de confirmation {string}")
	public void jeMeRedirigeVersLaPageDeConfirmation(String text) {
		String ConfRegisterMsg = registerPage.confirmationRegisterMessage();
		Assert.assertTrue(ConfRegisterMsg.contains(text));
	}

}