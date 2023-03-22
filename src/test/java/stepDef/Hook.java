package stepDef;


import base.Config;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook extends Config {
    public static String url;
    public static String driverType = System.getProperty("browser");
    public static String envType = System.getProperty("env");

    @Before
    public void beforeEachTest(){
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver = setupBrowser (driverType);
        switch (envType){
            case "qa":
                url = "https://qa.taltektc.com";
                Email_Address = "arianshakib93@gmail.com";
                Password = "Tek@88";
                break;
            case "stg":
                url = "http://www.stage.taltektc.com";
                Email_Address="stage.env1@gmail.com";
                Password = "Password";
                break;
            case "prod":
                url = "http://www.prod.taltektc.com";
                Email_Address="prod.env1@gmail.com";
                Password = "Test1234";
                break;
        }
        driver.get(url);
    }

    @After
    public void afterEachTest(Scenario scenario){
        try{
            if(scenario.isFailed()){
                final byte[] screenshot = ((TakesScreenshot) driver)
                        .getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", scenario.getName()); //stick it in the report
            }

        } finally {
            //driver.quit();
        }
    }
}