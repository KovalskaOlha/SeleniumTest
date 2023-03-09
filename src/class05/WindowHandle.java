package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/");
        //open 3 new taps but focus in on a parent window gmail
        driver.findElement(By.xpath("//a[text()='Help']")).click();
        driver.findElement(By.xpath("//a[text()='Privacy']")).click();
        driver.findElement(By.xpath("//a[text()='Terms']")).click();
        //return the window where the current focus is (parent window)
        //unique and will change every time when we open the website
        String parentWindow=driver.getWindowHandle();
        System.out.println(parentWindow);
        //get window handle of all the window that opened up
        Set<String> windowHandles = driver.getWindowHandles();
        //print all handles
        for(String wh:windowHandles){
            //switch the focus of the driver to help window
            driver.switchTo().window(wh);
            //check the title of the driver to which our focus on
            String title=driver.getTitle();
            if(title.equalsIgnoreCase("Privacy Policy – Privacy & Terms – Google")){
                break;
            }
        }
        //to verify we switched to the right window
        System.out.println(driver.getTitle());
        driver.switchTo().window(parentWindow);



    }
}
