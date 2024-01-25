package Test;

import ListOfElement.SignIn;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Signin {
        WebDriver driver;
        SignIn login;

        @BeforeTest
        public void  beforeTest(){
            WebDriverManager.edgedriver().setup();
            driver= new EdgeDriver();

            driver.manage().window().maximize();
            driver.get("http://www.automationpractice.pl/index.php");
            System.out.println("hello hhy");
            login = new SignIn(driver);
        }
        @Test
        public void signInUp(){
            login.SignInUp();
            login.Enteremail();
            login.EnterPassword();
            login.ClickButoon();
    }
@AfterTest
    public void close(){
            driver.quit();
}
}
