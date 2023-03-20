package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TablesDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@class='button']")).click();
        driver.findElement(By.xpath("//b[text()='PIM']")).click();

        boolean idFound=false;
         while (!idFound) {
             List<WebElement> ids = driver.findElements(By.xpath("//table[@class]/tbody/tr/td[2]"));
             for (int i = 0; i < ids.size(); i++) {
                 String id = ids.get(i).getText();
                 if (id.equalsIgnoreCase("52100A")) {
                     driver.findElement(By.xpath("//table[@class]/tbody/tr[" + (i + 1) + "]/td[1]")).click();
                     idFound = true;
                     break;
                 }
             }
             //   click on the next page
             if (!idFound) {
                 WebElement nextBut = driver.findElement(By.xpath("//a[text()='Next']"));
                 nextBut.click();
             }
         }

    }
}
