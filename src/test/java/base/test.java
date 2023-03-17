package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class test {


    public static void main(String[] args) throws Exception {
        ChromeDriver driver= new ChromeDriver();
        try {
            driver.navigate().to("https://qa.taltektc.com");

            WebElement element = driver.findElement(By.name("email"));
            element.sendKeys("arianshakib93@gmail.com");
            element.submit();

            WebElement element1 = driver.findElement(By.name("password"));
            element1.sendKeys("Tek@88");
            element1.submit();

//        EdgeDriver driver = new EdgeDriver();
//        try {
//            driver.navigate().to("https://qa.taltektc.com");
//
//            WebElement element = driver.findElement(By.name("email"));
//            element.sendKeys("mfariha1219@gmail.com");
//            element.submit();
//
//            WebElement element1 = driver.findElement(By.name("password"));
//            element1.sendKeys("Faaiza23");
//            element1.submit();


            String expectedTitle = "Welcome to TalentTek";
            String actualTitle = "";
            actualTitle = driver.getTitle();

            if (actualTitle.contentEquals(expectedTitle)) {
                System.out.println("Test Passed!");
            } else {
                System.out.println("Test Failed");
            }

            Thread.sleep(500);
        } finally {
            driver.quit();
        }
    }
}


//    public static void main(String[] args) {

//        WebDriverManager.chromedriver().setup();
//        System.setProperty("web driver.chrome.driver","G:\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();

//        WebDriverManager.edgedriver().setup();
//        System.setProperty("web driver.edge.driver","G:\\edgedriver.exe");
//        WebDriver driver = new ChromeDriver();
//
//        String baseUrl = "https://qa.taltektc.com";
//        String expectedTitle = "Welcome to TalentTek";
//        String actualTitle ="";
//        driver.get(baseUrl);
//        actualTitle = driver.getTitle();
//
//        if (actualTitle.contentEquals(expectedTitle)){
//            System.out.println("Test Passed!");
//        } else {
//            System.out.println("Test Failed");
//        }
//
//        driver.close();
//    }
