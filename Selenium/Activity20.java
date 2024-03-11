import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity20 {

    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        //prompt button
        WebElement prompt =driver.findElement(By.id("prompt"));
        prompt.click();

        // Switch focus to the alert
        Alert promptAlert = driver.switchTo().alert();

        // Print the text in the alert
        String alertText = promptAlert.getText();
        System.out.println("Text in prompt alert: " + alertText);

        //type Awesome
        promptAlert.sendKeys("Awesome");

        // Close the alert
        promptAlert.accept();

        // Can also close the alert by clicking Cancel
        // promptAlert.dismiss();
        // Close the browser
        driver.quit();
    }

}