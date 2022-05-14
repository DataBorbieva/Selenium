package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _02_Validate_Apple_URL {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\datab\\IdeaProjects\\selenium_intro\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);




        driver.get("https://www.apple.com/");

        String actualURL = driver.getCurrentUrl(); // from application under development
        String expectedURL = "https://www.apple.com/"; //from requirement


        if(actualURL.equals(expectedURL)) System.out.println("URL validation PASSED");
        else System.out.println("URL validation FAILED");





        Thread.sleep(3000);
        driver.quit();

        System.out.println("End of the program");

    }
}

