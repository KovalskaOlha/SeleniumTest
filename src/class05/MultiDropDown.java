package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='multi-select']"));
        Select sel=new Select(dropDown);
        //select by value
        sel.selectByValue("New Jersey");
        //select by visible text
        sel.selectByVisibleText("Ohio");
        Thread.sleep(2000);

        //we can also deselect in multi drop down
        sel.deselectByValue("New Jersey");
        sel.deselectByValue("Ohio");

        //check what is select
        System.out.println("The drop down is multiple "+sel.isMultiple());


    }
}
