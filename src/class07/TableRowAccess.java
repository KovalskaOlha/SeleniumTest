package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableRowAccess {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));

        //print all rows
        for(WebElement row:allRows){
            //extract text from each row
            String rowText=row.getText();
            //if we want just one row with spec condition
            if(rowText.contains("Microsoft")){
              //  System.out.println(rowText);
            }
        }
        List<WebElement> justFirstColumn = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
         for(WebElement firstcol:justFirstColumn){
          System.out.println(firstcol.getText());
}


    }
}
