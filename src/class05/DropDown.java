package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        //locate the webelement
        WebElement dropDown=driver.findElement(By.xpath("//select[@id='select-demo']"));
// use select class because this drop down has a select tag
        Select select =new Select(dropDown);
//  using select class we have different
          select.selectByIndex(1);
          Thread.sleep(2000);
          //    select by Value
        select.selectByValue("Tuesday");
        Thread.sleep(2000);
        //  select by visible text
        select.selectByVisibleText("Friday");


    }
}
