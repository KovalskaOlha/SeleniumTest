package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");
        WebElement maleBut=driver.findElement(By.cssSelector("input[value='Male']"));
        //check if an radio button isenabled
         boolean isEnabled=maleBut.isEnabled();
        System.out.println("The radio button male is enabled? "+isEnabled);
        boolean isDisplayed=maleBut.isDisplayed();
        System.out.println(isDisplayed);

        //check if the radio button is selected
        boolean isSelected=maleBut.isSelected();
        System.out.println(isSelected);
        if(!isSelected){
            maleBut.click();
        }
        isSelected=maleBut.isSelected();
        System.out.println("If the button is selected?--> "+isSelected);





    }
}
