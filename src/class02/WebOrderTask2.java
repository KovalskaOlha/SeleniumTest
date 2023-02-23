package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebOrderTask2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        driver.manage().window().maximize();

        //send o the username

        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");

        //send to the password
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");

        //click on login button
        driver.findElement(By.className("button")).click();

        String title= driver.getTitle();
           // Web Orders--->> dom >command F-->title--->copy

        if(title.equalsIgnoreCase("Web Orders")){
            System.out.println("the title is correct");
        }
        else{
            System.out.println("the title is incorrect");
        }
        driver.findElement(By.linkText("Logout")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
