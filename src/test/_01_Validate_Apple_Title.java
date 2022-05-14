package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _01_Validate_Apple_Title {

    public static void main(String[] args) throws InterruptedException {

//1.Set up driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\datab\\IdeaProjects\\selenium_intro\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        //2.validation

        driver.get("https://www.apple.com/");

        String actualTitle = driver.getTitle(); // from application under development
        String expectedTitle = "Apple"; //from requirement


        if(actualTitle.equals(expectedTitle)) System.out.println("Title validation PASSED");
        else System.out.println("Title validation FAILED");




        // quit driver
        Thread.sleep(3000);
        driver.quit();

        System.out.println("End of the program");

    }
}