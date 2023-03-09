package class05;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/javascript-alert-box-demo.php");
        driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
        // Switch focus on alert pop up
        Alert alert= driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
        driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']")).click();
        alert.sendKeys("asdfg");
        Thread.sleep(2000);
        alert.accept();




    }
}
