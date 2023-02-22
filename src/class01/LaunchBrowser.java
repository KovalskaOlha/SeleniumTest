package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        //to tell your project where the webdriver is located

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

        //we have to create an instance of webdriver
        WebDriver driver=new ChromeDriver();
        //open the website
        driver.get("https://www.facebook.com/");
        //get the current url
        String URL=driver.getCurrentUrl(); //.getCurrentURL a method and return the String
        System.out.println(URL);

        //get the title of webpage
        String title =driver.getTitle();
        //print the title of the page
        System.out.println("The title of the page is "+title);
        // output The title of the page is Facebook - log in or sign up
        // to slow down for 3 seconds and then slow it down
        Thread.sleep(3000);
         //close the browser
        driver.quit();
    }
}
