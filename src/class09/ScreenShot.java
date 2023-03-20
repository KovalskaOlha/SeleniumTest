package class09;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ScreenShot {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        WebElement userName = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userName.sendKeys("Tester");

//        password field
        WebElement pass = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        pass.sendKeys("test");
        //interface take screenshot
        TakesScreenshot ss=(TakesScreenshot) driver;
        //take the sceen shot as a file
       File sourceFile =ss.getScreenshotAs(OutputType.FILE);//interface from selenium
        System.out.println(sourceFile);
        //save the file in computer
        //Fileutils is a library
        FileUtils.copyFile(sourceFile,new File("/Users/kovalska/IdeaProjects/SeleniumTest/src/screen/iou.png"));




    }
}
