package practiceAtHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Practice1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://facebook.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement createButton = driver.findElement(By.xpath("//a[text()='Create new account']"));
        createButton.click();
        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Snow");
        driver.findElement(By.name("reg_email__")).sendKeys("johnsnow@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("johnsnow@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("qwerty123456");

        WebElement dropdown = driver.findElement(By.cssSelector("select[name='birthday_month'] "));
        Select select=new Select(dropdown);
        select.selectByVisibleText("Jun");

        WebElement birthDay = driver.findElement(By.xpath("//select[@id='day']"));
        Select select2=new Select(birthDay);
        select2.selectByValue("22");

        WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
        Select select3=new Select(year);
        select3.selectByValue("1990");


        }


    }

