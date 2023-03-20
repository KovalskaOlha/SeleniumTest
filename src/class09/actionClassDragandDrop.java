package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionClassDragandDrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://jqueryui.com/droppable");
        //what i want to drop
        driver.switchTo().frame(0);
        WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
        //find elemennt where i want to drop
        WebElement droppable = driver.findElement(By.id("droppable"));

        Actions action=new Actions(driver);
        action.dragAndDrop(draggable,droppable).perform();


    }
}
