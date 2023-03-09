package homeWork6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement startButn = driver.findElement(By.xpath("//button"));
        startButn.click();
        WebElement finishButn=driver.findElement(By.xpath("//div[@id='finish']"));
        finishButn.click();
        WebElement getText=driver.findElement(By.xpath("//h4[text()='Hello World!']"));
        System.out.println("The hidden text is : "+getText.getText());

    }
}
