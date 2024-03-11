import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class ExtraActivity {
    public static void main(String[] args) {
        //APjFqb
        WebDriverManager.firefoxdriver().setup();
        // Driver object reference
        WebDriver driver = new FirefoxDriver();


        // Open the browser
        driver.get("https://www.google.com/");
        WebElement sb= driver.findElement(By.id("APjFqb"));
        sb.sendKeys("cheese"+Keys.ENTER);


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result-stats")));

        String s = driver.findElement(By.id("result-stats")).getText();
        System.out.println("The results is");
        System.out.println(s);





        driver.quit();
    }
}









