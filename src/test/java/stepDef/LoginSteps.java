package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import pageObject.login_page;

public class LoginSteps extends Config {
    login_page lp = new login_page(driver);
    @Given("user in TalentTEK Homepage")
    public void userInTalentTEKHomepage() {
        // verify page title
        String act = driver.getTitle();
        String exp = "Sign In";
        Assert.assertEquals(act, exp);

    }

    @And("user enter valid email address")
    public void userEnterValidEmailAddress() {
        lp.enterEmailAddress(Email_Address);
    }

    @And("user enter valid password")
    public void userEnterValidPassword() {
        lp.enterPassword(Password);
    }

    @When("user clicks on Log In button")
    public void userClicksOnLogInButton() {
        lp.clickOnLoginButton();
    }

    @Then("user should be able to successfully login")
    public void userShouldBeAbleToSuccessfullyLogin() {
        lp.verifyIfStudentLoggedInSuccessfully();
    }

    @And("user enter invalid password")
    public void userEnterInvalidPassword() {
        lp.enterPassword("fakeInvalidPass1");
    }

    @Then("user should be able see error message")
    public void userShouldBeAbleSee(String errorMessage) {
        lp.verifyErrorMessageForInvalidEmailOrPassword(errorMessage);
    }

    @Then("user should be able see {string} message")
    public void userShouldBeAbleSeeMessage(String errorMsg) {
        lp.verifyErrorMessageForInvalidEmailOrPassword(errorMsg);
    }

    @And("user enter invalid email address")
    public void userEnterInvalidEmailAddress() {
        lp.enterEmailAddress("fakeemail5783@gmail.com");
    }

    @And("login")
    public void login() {
        lp.enterEmailAddress(Email_Address);
        lp.enterPassword(Password);
        lp.clickOnLoginButton();
    }
    @And("user click on {string} button")
    public void userClickOnButton(String buttonText) {
        driver.findElement(By.xpath("//a[contains(text(),'"+buttonText+"')]")).click();
        //lp.clickOnButton(buttonText);
    }


}


