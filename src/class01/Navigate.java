package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
    public static void main(String[] args) throws InterruptedException {
        //connect with a webdriver
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        //initiate the instance of webdriver
        WebDriver driver=new ChromeDriver();
        //open google

        driver.get("https://www.google.com/");
        //slow down
        Thread.sleep(2000);
        //now navigate to facebook
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(2000);
        //go back
        driver.navigate().back();
        Thread.sleep(2000);
        //go again to google
        driver.navigate().forward();
        Thread.sleep(2000);
        //refresh the page
        driver.navigate().refresh();
        driver.close();
    }
}
