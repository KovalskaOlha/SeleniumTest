package homeWork9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CalendarHandling {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement name = driver.findElement(By.xpath("//*[@name='txtUsername']"));
        name.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//*[@name='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement logB = driver.findElement(By.xpath("//*[@name='Submit']"));
        logB.click();
        driver.findElement(By.xpath("//b[text()='Recruitment']")).click();
        driver.findElement(By.xpath("//*[@class='ui-datepicker-trigger']")).click();
        WebElement dropMonth = driver.findElement(By.xpath("//*[@class='ui-datepicker-month']"));
        Select select=new Select(dropMonth);
        select.selectByIndex(11);
        WebElement dropYear = driver.findElement(By.xpath("//*[@class='ui-datepicker-year']"));
        Select select1=new Select(dropYear);
        select1.selectByVisibleText("1990");
        List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for(WebElement day:days){
            String dayDate = day.getText();
            if(dayDate.equalsIgnoreCase("26")){
                day.click();
            }
        }
        driver.close();

    }
}
