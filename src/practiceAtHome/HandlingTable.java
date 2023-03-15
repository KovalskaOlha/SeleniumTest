package practiceAtHome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandlingTable {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www2.asx.com.au/markets/trade-our-cash-market/equity-market-prices");
        driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
        //xpath for all rows in table
       //*[@id=\"home_top_twenty\"]/div/div[1]/div/div[1]/table/tr"
        //xpath for numbers of column
        //*[@id="home_top_twenty"]/div/div[1]/div/div[1]/table/tr[2]/td

        List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"home_top_twenty\"]/div/div[1]/div/div[1]/table/tr"));
        int totalNumberOfRow = rows.size();
        System.out.println(totalNumberOfRow);
        List<WebElement> column=driver.findElements(By.xpath("//*[@id=\"home_top_twenty\"]/div/div[1]/div/div[1]/table/tr[2]/td"));
        int totalNumberOfColumn=column.size();
        System.out.println(totalNumberOfColumn);

    }
}
