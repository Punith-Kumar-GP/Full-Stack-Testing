import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.interactions.Actions;

public class Activity6 {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/input-events");
        System.out.println("Title of the page: " + driver.getTitle());

        WebElement keyPressed = driver.findElement(By.id("keyPressed"));

        Actions actions = new Actions(driver);

        actions.click(keyPressed).perform();

        actions.sendKeys("P").perform();

        actions.keyDown(Keys.CONTROL).sendKeys("a").perform();

        actions.keyDown(Keys.CONTROL).sendKeys("c").perform();
        driver.quit();
    }
}
