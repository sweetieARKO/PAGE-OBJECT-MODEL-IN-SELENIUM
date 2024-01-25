package ListOfElement;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class signup {
    WebDriver driver;
public signup(WebDriver driver){
    this.driver = driver;
}

    By SigninButton = By.xpath("//a[contains(text(),'Sign in')]");
    By EmailAddress = By.xpath("//input[@id='email_create']");
    By First_button = By.xpath("//span[normalize-space()='Create an account']");
    By gender = By.xpath("//input[@type='radio' and @id='id_gender2']");
    By First_name = By.xpath("//input[@id='customer_firstname']");
    By Last_name =By.xpath("//input[@id='customer_lastname']");
    By password = By.xpath("//input[@id='passwd']");
    By button = By.xpath("//button[@id='submitAccount']");


 public void signIn(){

         driver.findElement(SigninButton).click();
     }
     public void EnterEmail() {
     String username = RandomStringUtils.randomAlphanumeric(8).toLowerCase();
         WebElement Email =  driver.findElement(EmailAddress);
         Email.sendKeys(username+"@gmail.com");
     }

public void Click_onButton(){
     driver.findElement(First_button).click();
}

public void Gender(){
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust the timeout as needed
    wait.until(ExpectedConditions.visibilityOfElementLocated(gender));

    // Now, click the gender element
    driver.findElement(gender).click();

}

public void firstName(){
     driver.findElement(First_name).sendKeys("Abigail");
}
public void lastName(){
     driver.findElement(Last_name).sendKeys("Arko");
}
public void setPassword(){
    String Password = RandomStringUtils.randomAlphanumeric(10).toLowerCase();
     driver.findElement(password).sendKeys(Password);
}




public void clickbutton(){
     driver.findElement(button).click();
}
 }


