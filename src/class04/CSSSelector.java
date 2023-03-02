package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        //click on the button create account using CSS
       WebElement createNewBut= driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
       //click
        createNewBut.click();
        Thread.sleep(2000);
        //fill in the first name
        WebElement firstName=driver.findElement(By.cssSelector("input[name='firstname']"));

        firstName.sendKeys("abracadabra");

    }
}
