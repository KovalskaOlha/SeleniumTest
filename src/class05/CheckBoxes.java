package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");

        List<WebElement> options= driver.findElements(By.cssSelector("input[value^='Option'] "));

        for (int i = 0; i <options.size(); i++) {
            String value=options.get(i).getAttribute("value");
            if(value.equalsIgnoreCase("Option-2")){
                options.get(i).click();
            }
        }
    }
}
