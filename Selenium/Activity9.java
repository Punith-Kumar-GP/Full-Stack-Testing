import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity9 {
    public static void main(String[] args) {


        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://v1.training-support.net/selenium/ajax");

        System.out.println("Home page title: " + driver.getTitle());
        WebElement changeContentButton = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/button"));
        changeContentButton.click();


        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "HELLO!"));


        WebElement messageElement = driver.findElement(By.id("ajax-content"));
        String helloMessage = messageElement.getText();
        System.out.println("Message after clicking 'Change content': " + helloMessage);

        // Wait for the text to change to contain "I'm late!"
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"), "I'm late!"));

        // Print the new message on the page
        String late = driver.findElement(By.tagName("h3")).getText();
        System.out.println("The late message is : " + late);



        driver.close();

    }

}
