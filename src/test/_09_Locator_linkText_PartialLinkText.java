package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import static utilities.ValidationUtils.validateElementIsDisplayedAndEnabled;

public class _09_Locator_linkText_PartialLinkText {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.google.com/");

        WebElement aboutLink = driver.findElement(By.linkText("About"));
        validateElementIsDisplayedAndEnabled(aboutLink, "About link");

        WebElement storeLink = driver.findElement(By.linkText("Store"));
        validateElementIsDisplayedAndEnabled(aboutLink, "Store link");

        WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
        validateElementIsDisplayedAndEnabled(aboutLink, "Gmail link");

        WebElement imagesLink = driver.findElement(By.partialLinkText("Ima"));
        validateElementIsDisplayedAndEnabled(aboutLink, "Images link");

        driver.quit();
    }}
        /*
             /*
        Go to https://www.google.com
        Validate the Gmail, Images, About and Store links are displayed and enabled


        WebDriver driver = Driver.getDriver();
        driver.get("https://www.google.com");

        WebElement aboutLink = driver.findElement(By.linkText("About"));
        WebElement storeLink = driver.findElement(By.linkText("Store"));
        WebElement gmailLink = driver.findElement(By.partialLinkText("mail"));
        WebElement imagesLink = driver.findElement(By.partialLinkText("Ima"));

        System.out.println(aboutLink.getText()); // About
        System.out.println(storeLink.getText()); // Store
        System.out.println(gmailLink.getText()); // Gmail
        System.out.println(imagesLink.getText()); // Images

        System.out.println(aboutLink.isDisplayed() && aboutLink.isEnabled() ? "PASSED" : "FAILED");
        System.out.println(storeLink.isDisplayed() && storeLink.isEnabled() ? "PASSED" : "FAILED");
        System.out.println(gmailLink.isDisplayed() && gmailLink.isEnabled() ? "PASSED" : "FAILED");
        System.out.println(imagesLink.isDisplayed() && imagesLink.isEnabled() ? "PASSED" : "FAILED");

        Driver.quitDriver();

    */

