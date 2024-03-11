import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity16 {
    public static void main(String[] args) {

        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the page
        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        // username and password
        WebElement username = driver.findElement(By.xpath("//input[contains(@class, '-username')]"));
        WebElement password = driver.findElement(By.xpath("//input[contains(@class, '-password')]"));
        WebElement cp = driver.findElement(By.xpath("//input[starts-with(@name, 'name-')]"));
        WebElement email = driver.findElement(By.xpath("//input[starts-with(@class, 'email-')]"));
        // Enter the values
        username.sendKeys("admiwwwwwwwn");
        password.sendKeys("password");
        cp.sendKeys("password");
        email.sendKeys("e@email.com");

        // click the submit button
        WebElement sub = driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]"));
        sub.click();

        // login message
        String message = driver.findElement(By.xpath("//*[@id=\"action-confirmation\"]")).getText();
        System.out.println("Login message: " + message);

        // Close the browser
        driver.quit();

    }
}
