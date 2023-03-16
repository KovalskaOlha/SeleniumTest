package practiceAtHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TablePractice {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/table-data-download-demo.php");
        WebElement table = driver.findElement(By.xpath("//table[@id='example']"));
       // System.out.println(table.getText());
        List<WebElement> fourRow = driver.findElements(By.xpath("//table[@id='example']//tbody/tr[4]"));
        for (WebElement data:fourRow) {
         //   System.out.println(data.getText());
        }

        List<WebElement> exactcolumn = driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td[4]"));
        for (WebElement dataFromCol:exactcolumn) {
          //  System.out.println(dataFromCol.getText());
        }

    }
}
