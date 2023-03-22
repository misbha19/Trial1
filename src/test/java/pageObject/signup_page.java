package pageObject;

import base.Config;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class signup_page extends Config {
    public signup_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        Config.driver=driver;
    }

    Faker faker = new Faker();

    // Locators
    @FindBy(how= How.NAME, using = "firstName")
    public WebElement fnLocator;
    @FindBy(how= How.NAME, using = "lastName")
    public WebElement lnLocator;
    @FindBy(how= How.NAME, using = "email")
    public WebElement emailLocator;
    @FindBy(how= How.NAME, using = "month")
    public WebElement monthDropDownLoc;


    // functions
    public void enterFirstName(){
        String fnName = faker.name().firstName();
        fnLocator.sendKeys(fnName);
    }
    public void enterFirstName_DD(String fnName){
        fnLocator.sendKeys(fnName);
    }
    public void enterLastName_DD(String lnName){
        lnLocator.sendKeys(lnName);
    }
    public void enterLastName(){
        lnLocator.sendKeys(faker.name().lastName());
    }
    public void enterEmail(){
        //emailLocator.sendKeys(faker.internet().emailAddress());
        String tt_domain = "@taltektc.com";
        String firstName = faker.name().firstName().toLowerCase();
        String lastName = faker.name().lastName().toLowerCase();
        String randomNum = faker.number().digits(6);
        String fullEmail = firstName+lastName+randomNum+tt_domain;
        System.out.println(fullEmail);
        emailLocator.sendKeys(fullEmail);
    }

    public void dropDownMonth (String month){
        Select mm = new Select (monthDropDownLoc);
        mm.selectByVisibleText(month);
    }

    public void chooseGender (String gender){

    }



}