package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWailtDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/dynamic-elements-loading.php");
        driver.findElement(By.xpath("//button")).click();
        //explicit wait (wait until expected condition)
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Welcome Syntax Technologies']")));
        //once the webelement is visible then get the text
        WebElement text = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        System.out.println("The welcome text is "+text.getText());
    }
}
