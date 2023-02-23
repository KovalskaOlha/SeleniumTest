package HomeWork2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);



        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Snow");
        driver.findElement(By.name("reg_email__")).sendKeys("gameOfThrones@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("gameOfThrones@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("King1111");

        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@class = '_8idr img']")).click();
        Thread.sleep(2000);
        driver.quit();






    }
}
