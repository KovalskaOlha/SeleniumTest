package homeWork6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame(0);
       WebElement textBox=driver.findElement(By.xpath("//p"));
       textBox.clear();
       textBox.sendKeys("Hello World!");
       driver.switchTo().defaultContent();
    }
}
