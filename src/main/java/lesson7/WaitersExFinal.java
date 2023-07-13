package lesson7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Waiters;

import java.time.Duration;

public class WaitersExFinal {
    public static void main(String[] args) {
        //неявные ожидания
        System.setProperty("webdriver.chrome.driver", "/Users/kudayeusiarhei/Desktop/chromedriver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        Waiters waiters = new Waiters(driver);

        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        waiters.waitForVisabilityOfWebElementReturn(By.id("accept-choices")).click();
        waiters.switchToFrame(By.id("iframeResult"));
        waiters.waitForVisabilityOfWebElementReturn(By.xpath("//button[@onclick= 'myFunction()']")).click();
        Alert alert = waiters.switchToAlert();
        System.out.println(alert.getText());
        alert.accept();
        driver.quit();





    }
}
