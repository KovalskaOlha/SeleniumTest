package DriverSetupTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSetupTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
