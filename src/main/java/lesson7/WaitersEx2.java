package lesson7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitersEx2 {
    public static void main(String[] args) {
        //неявные ожидания
        System.setProperty("webdriver.chrome.driver", "/Users/kudayeusiarhei/Desktop/chromedriver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        //Явные ожидания
        //WebDriverWait
        //ExpectedConditions

/*      WebElement element = driver.findElement(By.xpath(""));
        Select select = new Select(element);
        select.deselectAll();*/

        //new Select(driver.findElement(By.xpath(""))).deselectAll();

        //visibilityOfElementLocated
/*        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("accept-choices")));
        driver.findElement(By.id("accept-choices")).click();

        WebElement acceptCoockies = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("accept-choices")));
        acceptCoockies.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("accept-choices"))).click();

        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("accept-choices"))).click();*/


        //frameToBeAvailableAndSwitchToIt
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(By.id("accept-choices"))).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //gdpr-consent-notice
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("iframeResult")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@onclick= 'myFunction()']"))).click();

        //alertIsPresent()
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        System.out.println(alert.getText());
        alert.accept();

        driver.quit();





    }
}
