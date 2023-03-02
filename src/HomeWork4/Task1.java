package HomeWork4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        WebElement clickOn =driver.findElement(By.cssSelector("input[id='isAgeSelected']"));
        if(!clickOn.isSelected()){
            clickOn.click();
        }
        boolean isSelected=clickOn.isSelected();
        System.out.println(isSelected);

    }
}
