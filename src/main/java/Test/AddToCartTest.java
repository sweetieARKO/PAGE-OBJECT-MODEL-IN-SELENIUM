package Test;

import ListOfElement.AddToCart;

import ListOfElement.SignIn;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddToCartTest {
    WebDriver driver;
    SignIn login;

    @BeforeTest
    public void beforeTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://www.automationpractice.pl/index.php");
        driver.getTitle();
        System.out.println("Successfully opened the webpage");
        login = new SignIn(driver);
    }

    @Test
    public void shop()  {
        AddToCart cart = new AddToCart(driver);
        cart.setSearchBox("blouses");
        System.out.println("Successfully entered the search term");
        cart.setSearchButton();
        System.out.println("Successfully clicked the search button");
        cart.setImage();
        System.out.println("Successfully clicked on the first image");
        cart.setContinue();
        System.out.println("Continue");

        // Return to the homepage
        driver.navigate().to("http://www.automationpractice.pl/index.php");


        cart.setSearchBox("Printed dresses");
        System.out.println("Successfully entered the search term");
        cart.setSearchButton();
        System.out.println("Successfully clicked the search button");

        cart.setSecondImage();
        System.out.println("Successfully clicked on the second image");
        cart.setContinue();
        System.out.println("Continue");
        driver.navigate().to("http://www.automationpractice.pl/index.php");

    }

            }

