import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity14 {
    public static void main(String[] args) {

        // Set up Firefox driver
        WebDriverManager.firefoxdriver().setup();
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the page
        driver.get("https://v1.training-support.net/selenium/tables");
        // Print the title of the page
        System.out.println("Home page title: " + driver.getTitle());

        // Print columns
        List<WebElement> cols = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr[1]/td"));
        ////*[@id="sortableTable"]/tbody/tr[1]/td
        System.out.println("Columns: " + cols.size());


        // Print rows
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
        System.out.println("Rows: " + rows.size());

        // Print the cell value of the second row and second column
        WebElement cellValue = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));

        System.out.println("Second row, second cell value: " + cellValue.getText());

        //sort name
        WebElement name = driver.findElement(By.xpath("//*[@id=\"sortableTable\"]/thead/tr/th[1]"));
        name.click();

        // Print the cell value of the second row and second column again
        cellValue = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));

        System.out.println("Second row, second cell value again : " + cellValue.getText());


        System.out.println();
        // Print the cells values of the table footer
        // List<WebElement> thirdRow = rows.get(2).findElement(By.xpath("./td"));
        List<WebElement> foot = driver.findElements(By.xpath("//*[@id=\"sortableTable\"]/tfoot/tr/th"));
        System.out.println("Footer cell values: ");

        int i =1;
        for (WebElement cell : foot) {
            System.out.println(i+". "+cell.getText());
            i++;
        }

        System.out.println();




        // Close the browser
        driver.close();

    }
}