package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import pageObject.signup_page;

public class SignupSteps extends Config {

    signup_page su = new signup_page(driver);

    @And("user enter First and Last Name")
    public void userEnterFirstAndLastName() {
        su.enterFirstName();
        su.enterLastName();
    }

    @And("user enter their valid email address")
    public void userEnterTheirValidEmailAddress() {
        su.enterEmail();
    }


    @And("user enter month under Birth Date")
    public void userEnterMonthUnderDOB() {
        su.dropDownMonth("Nov");
    }

    @And("user enter {string} under Birth Date")
    public void userEnterUnderBirthDate(String month) {
        su.dropDownMonth(month);
    }

    @And("user enter {string} and {string} Name")
    public void userEnterAndName(String firstName, String lastName) {
        su.enterFirstName_DD(firstName);
        su.enterLastName_DD(lastName);
    }
}