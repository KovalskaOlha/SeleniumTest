package HomeWork3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@placeholder='Please enter your Message']")).sendKeys("I'm typing the message");
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Enter value'][1]")).sendKeys("365");
        driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("100");
        driver.findElement(By.xpath("//button[text()='Get Total']")).click();
        WebElement value=driver.findElement(By.xpath("//span[@id='displayvalue']"));
        System.out.println(value.getText());


    }
}
