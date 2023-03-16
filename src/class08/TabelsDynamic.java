package class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TabelsDynamic {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx");
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
//        enter the password
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");

//        click on login button
        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

        List<WebElement> column = driver.findElements(By.xpath("//table[@class='SampleTable']/tbody/tr/td[3]"));
        //iterate trough each to see if it contains
        for (int i = 0; i < column.size(); i++) {
            //extract the text
            String text=column.get(i).getText();
            if(text.equalsIgnoreCase("ScreenSaver")){
                System.out.println(text);
                //i+2 because the table has a header and index in java starts with 0 in life 1
                System.out.println("the screen saver is located at rhe row :"+(i+2));
                System.out.println("check the check box");
                driver.findElement(By.xpath("//table[@class='SampleTable']/tbody/tr["+ (i+2) +"]/td[1] ")).click();
                ////table[@class='SampleTable']/tbody/tr/td[1]   xpath for all checkboxes
            }


        }
    }
}
