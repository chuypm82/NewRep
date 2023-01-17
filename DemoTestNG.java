package TestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTestNG {
	public WebDriver driver = new FirefoxDriver();
    String appUrl = "https://accounts.google.com";

@Test
public void gmailLogin() {
          // launch the firefox browser and open the application url
           driver.get("https://gmail.com");
           
//maximize the browser window
           driver.manage().window().maximize();
           
//declare and initialize the variable to store the expected title of the webpage.
           String expectedTitle = "Gmail";
           
//fetch the title of the web page and save it into a string variable
           String actualTitle = driver.getTitle();
           Assert.assertEquals(expectedTitle,actualTitle);
           
         //enter a valid username in the email textbox
           WebElement username = driver.findElement(By.id("identifierId"));
           username.clear();
           username.sendKeys("TestSelenium");
           
   //click on the Next button
           WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
           nextButton.click();    

           
//close the web browser
           driver.quit();
  }
}
