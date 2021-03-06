package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _07_Text_Attribute_CssValues_of_Web_Elements {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        driver.get("https://www.google.com/");

        WebElement googleSearchButton = driver.findElement(By.cssSelector("input[value='Google Search']"));

        System.out.println(googleSearchButton.getText()); //empty
        System.out.println(googleSearchButton.getAttribute("class")); // gNO89b
        System.out.println(googleSearchButton.getAttribute("name")); // btnK
        System.out.println(googleSearchButton.getAttribute("role")); // button

        System.out.println(googleSearchButton.getCssValue("color")); //rgba code
        System.out.println(googleSearchButton.getCssValue("font-family"));//Roboto, arial,sans-serif
        System.out.println(googleSearchButton.getCssValue("font-size")); //14px
        System.out.println(googleSearchButton.getCssValue("text-align")); //center

        System.out.println(driver.findElement(By.tagName("body")).getText());

        Driver.quitDriver();
    }
}