package HomeWork2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Jane");
        driver.findElement(By.id("customer.lastName")).sendKeys("Smith");
        driver.findElement(By.id("customer.address.street")).sendKeys("222 NE 1st Street");
        driver.findElement(By.id("customer.address.city")).sendKeys("Miami");
        driver.findElement(By.id("customer.address.state")).sendKeys("FL");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("33132");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("786-232-22-22");
        driver.findElement(By.id("customer.ssn")).sendKeys("111223");
        driver.findElement(By.id("customer.username")).sendKeys("Janny");
        driver.findElement(By.id("customer.password")).sendKeys("123456qwerty");
        driver.findElement(By.id("repeatedPassword")).sendKeys("123456qwerty");
        Thread.sleep(5000);

        driver.findElement(By.className("button")).click();

        driver.quit();
    }
}
