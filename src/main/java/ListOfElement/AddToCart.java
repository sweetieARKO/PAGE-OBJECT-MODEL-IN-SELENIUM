package ListOfElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddToCart {
    WebDriver driver;

    public AddToCart(WebDriver driver) {
        this.driver = driver;
    }

    By searchBox = By.xpath("//input[@id='search_query_top']");
    By searchButton = By.xpath("//button[@name='submit_search']");
    By image = By.xpath("//img[@title='Blouse']");
    By secondImage = By.xpath("(//img[@title='Printed Summer Dress'])[2]");

    By seccondAddTocart = By.xpath("(//span[contains(text(),'Add to cart')])[3]");
    By addTocart = By.xpath("//span[normalize-space()='Add to cart'] ");
    By Continue = By.xpath("//span[@title='Continue shopping']//span[1]");

    public void setSearchBox(String searchTerm) {

        WebElement searchBoxElements = driver.findElement(searchBox);
        searchBoxElements.clear();
        searchBoxElements.sendKeys(searchTerm);
    }


    public void setSearchButton() {
        driver.findElement(searchButton).click();
    }

    public void setSecondImage() {
        Actions builder = new Actions(driver);
        builder.moveToElement(driver.findElement(secondImage)).perform();
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
        e.printStackTrace();
    }
      builder.moveToElement(driver.findElement(seccondAddTocart)).click().perform();
}

  public void setImage() {
      Actions builder = new Actions(driver);
      builder.moveToElement(driver.findElement(image)).perform();
      try {
          Thread.sleep(1000);
      }catch (InterruptedException e){
          e.printStackTrace();
      }
      builder.moveToElement(driver.findElement(addTocart)).click().perform();
    }
    public void setContinue(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust the timeout as needed
        WebElement continueButton = driver.findElement(Continue);
        wait.until(ExpectedConditions.elementToBeClickable(continueButton)).click();
    }
        }

