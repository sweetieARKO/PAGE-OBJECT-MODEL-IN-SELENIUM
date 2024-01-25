package ListOfElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn {
    private final WebDriver driver;

    public SignIn(WebDriver driver) {
        this.driver = driver;
    }

        By signup = By.xpath("//a[contains(text(),'Sign in')]");
        By email = By.xpath("//input[@id='email']");
        By password = By.xpath("//input[@id='passwd']");
        By button = By.xpath("//span[normalize-space()='Sign in']");
        public void SignInUp(){
                driver.findElement(signup).click();
        }
        public void Enteremail(){

                driver.findElement(email).sendKeys("arkoabigail027@gmail.com");

        }
        public void EnterPassword(){

                driver.findElement(password).sendKeys("Abigail&0276488602");

        }
        public void ClickButoon(){

                driver.findElement(button).click();

        }
    }


