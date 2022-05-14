package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main(String[] args) throws InterruptedException {

        //1. Set up driver
    System.setProperty("webdriver.chrome.driver","C:\\Users\\datab\\IdeaProjects\\selenium_intro\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver(); // Instantiate a Chrome Browser or we can instantiate SafariDriver, OperaDriver

        //2. Maximize driver
        driver.manage().window().maximize(); //showing big web-page, we need to maximize and keep all info. Maximize the driver


        //3. Define implicit wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        //4. Navigate to Google web site
        driver.get("https://www.google.com/");


        //5. Validate the title is Google
        System.out.println("The title of the page is = " + driver.getTitle()); //Google

        if(driver.getTitle().equals("Google")) System.out.println("Google title validation is PASSED");
        else System.out.println("Googe title validation is FAILED!!!");

        System.out.println("End of the program");

        //6. Quit driver
        Thread.sleep(3000); //Wait for demo purpose
        driver.quit();





    }
}
