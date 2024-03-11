import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity18 {

    public static void main(String[] args) {
        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the page
        driver.get("https://v1.training-support.net/selenium/selects");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        // dropdown
        WebElement dropdown = driver.findElement(By.id("multi-select"));


        Select mulSel = new Select(dropdown);

        // Select the javascript option using visible text
        mulSel.selectByVisibleText("Javascript");
        System.out.println("Selected option through visible text: " + mulSel.getFirstSelectedOption().getText());

        // Select 4,5,6 th index option
        for(int i=4;i<=6;i++){
            mulSel.selectByIndex(i);
        }
        System.out.println("Third option through index: " + mulSel.getFirstSelectedOption().getText());

        // Select NodeJs using value attribute
        mulSel.selectByValue("node");
        // Print the selected option
        System.out.println("Fourth option through value: " + mulSel.getFirstSelectedOption().getText());

        // Print all the options
        List<WebElement> options = mulSel.getAllSelectedOptions();
        System.out.println("Options selected are: ");
        int i =1;
        for(WebElement option : options) {
            System.out.println(i+". "+option.getText());
            i++;
        }

        // Deselect the 5th index option
        mulSel.deselectByIndex(5);

        options = mulSel.getAllSelectedOptions();
        i =1;
        System.out.println("Selected options are: ");
        for(WebElement option : options) {
            System.out.println(i+". "+option.getText());
            i++;
        }



        // Close the browser
        driver.quit();
    }

}