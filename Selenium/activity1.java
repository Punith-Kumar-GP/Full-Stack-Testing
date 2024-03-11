import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity1 {
    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)

        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net");
        System.out.println("Title of the main page: " + driver.getTitle());
        WebElement aboutUsButton = driver.findElement(By.id("about-link "));

        // Click on the "About Us" button
        aboutUsButton.click();
        System.out.println("Title of the new page: " + driver.getTitle());
        driver.quit();
    }
}
