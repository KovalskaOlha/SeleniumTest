package class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Calender {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.delta.com/");
        //       click on the calander
        WebElement calander = driver.findElement(By.xpath("//span[text()='Depart']"));
        calander.click();
        //get the month from the calendar
        ////span[@class='dl-datepicker-month-0'] month
        ////span[text()='Next']   next button
        WebElement month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']"));

        WebElement nextBut = driver.findElement(By.xpath("//span[text()='Next'] "));
        boolean isFound=false;

        while (!isFound){

            String month_=month.getText();
            if(month_.equalsIgnoreCase("August")){
//             select day
                List<WebElement> days = driver.findElements(By.xpath("//table[@class='dl-datepicker-calendar']/tbody/tr/td"));
                for(WebElement day:days){
                    String dayText = day.getText();
                    if(dayText.equalsIgnoreCase("20")){
                        day.click();
                        isFound=true;
                        break;
                    }
                }

            }else {
                nextBut.click();
            }
        }

    }
}
