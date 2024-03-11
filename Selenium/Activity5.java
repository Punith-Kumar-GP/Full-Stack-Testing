import java.util.Random;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Activity5 {
//    https://v1.training-support.net/selenium/input-events

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();

        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/input-events");
        System.out.println("Home page title : " + driver.getTitle());
        System.out.println();
        WebElement frontSide;
        frontSide = driver.findElement(By.className("active"));
        System.out.println("Value of the side in the front before left click: " + frontSide.getText());
        frontSide.click();
        frontSide = driver.findElement(By.className("active"));
        System.out.println("Value of the side in the front after left click: " + frontSide.getText());
        System.out.println();
        // Perform double click to show a random side and print the number
        Actions action = new Actions(driver);
        WebElement randomSide = driver.findElement(By.className("active"));
        System.out.println("Number shown before double click: " + randomSide.getText());
        action.doubleClick(randomSide).perform();
        randomSide = driver.findElement(By.className("active"));
        System.out.println("Number shown after double click: " + randomSide.getText());


        WebElement r = driver.findElement(By.className("active"));
        System.out.println("Number shown before right click: " + r.getText());

        action.contextClick(r).perform();
        r = driver.findElement(By.className("active"));
        System.out.println("Number shown after right click: " + r.getText());

        driver.quit();
    }
}