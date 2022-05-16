package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _06_Locator_name {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.google.com");
        if(driver.findElement(By.name("q")).isDisplayed()) System.out.println("The input box validation PASSED");
        else System.out.println("Input box validation FAILED!!!");
        Driver.quitDriver();

    }
}
