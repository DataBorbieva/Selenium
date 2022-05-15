package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _06_Locator_name {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.google.com");
        WebElement name = driver.findElement(By.name("q"));
        if(name.isDisplayed()) System.out.println("The name validation PASSED");
        else System.out.println("Name validation FAILED!!!");
        Driver.quitDriver();

    }
}
