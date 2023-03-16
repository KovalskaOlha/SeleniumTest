package homeWork8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.logging.SocketHandler;

public class DynamicTable {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.xpath("//input[@class='button']")).click();
        driver.findElement(By.xpath("//b[text()='PIM']")).click();
        List<WebElement> allId = driver.findElements(By.xpath("//table[@id]/tbody/tr/td[2]"));

        for (int i = 0; i < allId.size(); i++) {
           String id= allId.get(i).getText();
           if(id.equalsIgnoreCase("51870A")){
               System.out.println("52381A id is located at index : "+i);
               driver.findElement(By.xpath("//table[@id]/tbody/tr["+(i+1)+"]/td[1]")).click();
           }
        }
    }
}
