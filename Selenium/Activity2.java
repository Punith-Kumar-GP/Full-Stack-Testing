import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

    public static void main(String[] args) {
        // Setup the Firefox driver(GeckoDriver)

        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://v1.training-support.net/selenium/login-form");
        System.out.println("Title of the main page: " + driver.getTitle());
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");

          driver.findElement(By.xpath("//button[text()='Log in']")).click();
//         or    driver.findElement(By.xpath("//button[@class=\"ui button\"]")).click();
        // Click on the button

        driver.quit();

//        or
//        public class Activity4 {
//            public static void main(String[] args) {
//                // Set up Firefox driver
//                WebDriverManager.firefoxdriver().setup();
//                // Create a new instance of the Firefox driver
//                WebDriver driver = new FirefoxDriver();
//
//                // Open the page
//                driver.get("https://v1.training-support.net/selenium/target-practice");
//                // Print the title of the page
//                System.out.println("Home page title: " + driver.getTitle());
//
//                // Find the 3rd header and print its text
//                String thirdHeaderText = driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
//                System.out.println(thirdHeaderText);
//                // Find the 5th header and print its colour
//                String fifthHeaderColor = driver.findElement(By.xpath("//h5[text()='Fifth header']")).getCssValue("color");
//                System.out.println(fifthHeaderColor);
//
//                // Find the violet button and print its classes
//                String violetButtonClass = driver.findElement(By.xpath("//button[text()='Violet']")).getAttribute("class");
//                System.out.println(violetButtonClass);
//                // Find the grey button and print its text
//                String greyButtonText = driver.findElement(By.xpath("//button[text()='Grey']")).getText();
//                System.out.println(greyButtonText);
//
//                // Close the browser
                driver.close();
            }
        }

