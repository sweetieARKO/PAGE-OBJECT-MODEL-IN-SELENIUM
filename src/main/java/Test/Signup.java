package Test;

import ListOfElement.SignIn;
import ListOfElement.signup;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Signup {
    WebDriver driver;
    SignIn login;

    @BeforeTest
    public void beforeTest() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();

        driver.manage().window().maximize();
        driver.get("http://www.automationpractice.pl/index.php");

    }
@Test
    public void SignUp() throws InterruptedException {
    signup Register = new signup(driver);
    Register.signIn();
    Register.EnterEmail();
    Register.Click_onButton();
    Register.Gender();
    Register.firstName();
    Register.lastName();
    Register.setPassword();
    Register.clickbutton();
    driver.navigate().to("http://www.automationpractice.pl/index.php");
}
    @AfterTest
    public void close(){
        driver.quit();
    }
}
