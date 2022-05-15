package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class _01_Validate_Apple_Title {

    public static void main(String[] args) throws InterruptedException {

//1.Set up driver
        WebDriver driver = Driver.getDriver();


        //2.validation

        driver.get("https://www.apple.com/");

        String actualTitle = driver.getTitle(); // from application under development
        String expectedTitle = "Apple"; //from requirement


        if(actualTitle.equals(expectedTitle)) System.out.println("Title validation PASSED");
        else System.out.println("Title validation FAILED");




        // quit driver
        Driver.quitDriver();
        System.out.println("End of the program");

    }
}