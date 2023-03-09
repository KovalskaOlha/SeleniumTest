package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframePractice {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.uitestpractice.com/Students/Switchto");
        // 1 method switch to iframe
        //by index
        driver.switchTo().frame(0);
        WebElement textBox=driver.findElement(By.xpath("//input[@id='name']"));
        textBox.sendKeys("lalaland");
        //get the text click on from parent window
        driver.switchTo().defaultContent();
        //find the text
      WebElement  text=driver.findElement(By.xpath("//h3"));
        System.out.println("The text is : "+text.getText());
        //get the text inside the iframe and we switch by the name or id

        //2 method to switch using name or id of iframe
        driver.switchTo().frame("iframe_a");
        WebElement getLabel=driver.findElement(By.xpath("//label"));
        System.out.println("The label is : "+getLabel.getText());
        //switch focus on the main page
        driver.switchTo().defaultContent();
        //clear what is written in the text box and switch to iframe by web element
        WebElement frame1=driver.findElement(By.xpath("//iframe[@name='iframe_a']"));

        //3 method to switch by webElement or locator
        driver.switchTo().frame(frame1);
        textBox.clear();

    }
}
