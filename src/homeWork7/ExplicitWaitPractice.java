package homeWork7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitPractice {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        driver.findElement(By.xpath("//button[@id='populate-text']")).click();
        WebDriverWait wait=new WebDriverWait(driver,20);
        WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Selenium Webdriver']")));
        System.out.println("Changed text is "+text.getText());
        //display button after 10 seconds

        driver.findElement(By.xpath("//button[@id='display-other-button']")).click();
        WebDriverWait wait1=new WebDriverWait(driver,15);
        WebElement button = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='hidden']")));
        System.out.println("Button is enable : "+button.isEnabled());

        //enable button
        driver.findElement(By.xpath("//button[@id='enable-button']")).click();
        WebDriverWait wait2=new WebDriverWait(driver,15);
        WebElement disableButton = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='disable']")));
        if(disableButton.isDisplayed()){
            disableButton.click();
            System.out.println("Button is displayed");
        }else{
            System.out.println("Button is not displayed");
        }

        //ckeckbox in 10 sec
        driver.findElement(By.xpath("//button[@id='checkbox']")).click();
        WebDriverWait wait3=new WebDriverWait(driver,15);
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        wait3.until(ExpectedConditions.elementToBeSelected(checkBox));
        System.out.println("Checkbox is selected "+checkBox.isSelected());


        driver.close();







    }
}
