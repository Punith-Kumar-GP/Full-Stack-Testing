import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity12{

    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the page
        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        // textfield
        WebElement textField = driver.findElement(By.xpath("//*[@id=\"input-text\"]"));
        //enable button
        WebElement enableButton = driver.findElement(By.id("toggleInput"));

        //check if textfield is enabled
        System.out.println("Checkbox selected: " + textField.isEnabled());

        //click enable button
        enableButton.click();

        //check if textfield is enabled
        System.out.println("Checkbox selected: " + textField.isEnabled());


        // Close the browser
        driver.close();
    }
}