package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableColumnAccess {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

        //we change the xpath table>tbody>tr>td   td is columns    tr is a rows (hierarchy)
        List<WebElement> columns = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        for(WebElement column:columns){
            System.out.println(column.getText());
        }





    }
}
