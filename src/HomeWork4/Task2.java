package HomeWork4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
       List<WebElement> options= driver.findElements(By.cssSelector("input[value^='Option'] "));
        for(WebElement opt:options){
            String value=opt.getAttribute("value");
            System.out.println(value);
            if(value.equalsIgnoreCase("Option-2")){
                opt.click();
            }
        }


    }
}
