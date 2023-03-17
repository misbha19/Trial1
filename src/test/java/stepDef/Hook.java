package stepDef;

import base.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import java.time.Duration;

public class Hook extends Config {
    // init Driver
    public static WebDriver driver;

    // Setup browser type
    public static WebDriver setupBrowser (String driverType){
        if (driverType.equalsIgnoreCase("Ch")){
            ChromeOptions ops = new ChromeOptions();
            ops.addArguments("--remote-allow-origins=*");
            ops.addArguments("--incognito");
            driver = new ChromeDriver(ops);
        } else if (driverType.equalsIgnoreCase("ff")){
            driver = new FirefoxDriver();
        } else if (driverType.equalsIgnoreCase("Safari")){
            driver = new SafariDriver();
        } else if (driverType.equalsIgnoreCase("edge")){
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
        return driver;
    }
}