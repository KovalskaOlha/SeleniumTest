package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jsexecutor {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");
        //using js Executor to highlight the username box
        JavascriptExecutor js=(JavascriptExecutor) driver;//declaring instance of JSE

        js.executeScript("arguments[0].style.border='10px solid pink'",userName);//script means just a code

        //todo a click
        WebElement logBut = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        js.executeScript("arguments[0]. click();",logBut);

        js.executeScript("window.scrollBy(0,350)","");

    }
}
