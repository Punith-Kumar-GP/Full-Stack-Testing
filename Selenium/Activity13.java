import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;

public class Activity13 {
    public static void main(String[] args) {
        // Setup the Firefox driver (GeckoDriver)
        WebDriverManager.firefoxdriver().setup();

        // Initialize a new FirefoxDriver instance
        WebDriver driver = new FirefoxDriver();

        // Open the specified URL
        driver.get("https://v1.training-support.net/selenium/tables");

        String pageTitle = driver.getTitle();
        System.out.println("Title of the page: " + pageTitle);

        WebElement table = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div[2]/table"));

        List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));

        int rowCount = rows.size();
        System.out.println("Number of rows in the table: " + rowCount);

        List<WebElement> columns = rows.get(0).findElements(By.xpath("./td"));
        int columnCount = columns.size();
        System.out.println("Number of columns in the table: " + columnCount);

        List<WebElement> cellsInThirdRow = rows.get(2).findElements(By.xpath("./td"));
        System.out.println("Cell values in the third row:");
        for (WebElement cell : cellsInThirdRow) {
            System.out.println(cell.getText());
        }

        WebElement cellSecondRowSecondColumn = rows.get(1).findElement(By.xpath("./td[2]"));
        System.out.println("Cell value at the second row, second column: " + cellSecondRowSecondColumn.getText());

        driver.quit();
    }
}


//or
//
//public class Activity13 {
//    public static void main(String[] args) {
//        // Set up Firefox driver
//        WebDriverManager.firefoxdriver().setup();
//        // Create a new instance of the Firefox driver
//        WebDriver driver = new FirefoxDriver();
//        // Create the Wait object
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        // Open the page
//        driver.get("https://v1.training-support.net/selenium/tables");
//        // Print the title of the page
//        System.out.println("Home page title: " + driver.getTitle());
//
//        // Print the number of columns
//        List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));
//        System.out.println("Number of columns: " + cols.size());
//        // Print the number of rows
//        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr"));
//        System.out.println("Number of rows: " + rows.size());
//
//        // Print the cells values of the third row
//        List<WebElement> thirdRow = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[3]/td"));
//        System.out.println("Third row cell values: ");
//        for(WebElement cell : thirdRow) {
//            System.out.println(cell.getText());
//        }
//
//        // Print the cell value of the second row and second column
//        WebElement cellValue = driver.findElement(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[2]/td[2]"));
//        System.out.println("Second row, second cell value: " + cellValue.getText());
//
//        // Close the browser
//        driver.close();
//    }
//}