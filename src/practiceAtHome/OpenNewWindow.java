package practiceAtHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class OpenNewWindow {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com");
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[text()='Customer Service']")).click();
        driver.findElement(By.xpath("//a[text()='Best Sellers'][1]")).click();
        driver.findElement(By.xpath("//a[text()='New Releases'and @class='nav-a  ']")).click();
    }
}
