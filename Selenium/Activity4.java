import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)

        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/target-practice");
        System.out.println("Title of the main page: " + driver.getTitle());
        WebElement element = driver.findElement(By.xpath("//*[@id=\"third-header\"]"));

        // Get the text of the element and print it to the console
        System.out.println("Text of the element: " + element.getText());
        WebElement fifthheader = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[1]/h5"));

        // Get the text of the element and print it to the console
        String color = fifthheader.getCssValue("color");

        // Print the color to the console
        System.out.println("Color of the element: " + color);
        WebElement violetButton = driver.findElement(By.xpath("//button[text()='Violet']"));

        System.out.println("Classes of the violet button: " + violetButton.getAttribute("class"));


        WebElement greyButton = driver.findElement(By.xpath("//button[contains(text(),'Grey')]"));

        System.out.println("Text of the grey button: " + greyButton.getText());


        driver.quit();
    }
}

