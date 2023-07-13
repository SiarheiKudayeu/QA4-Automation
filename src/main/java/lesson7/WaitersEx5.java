package lesson7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitersEx5 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kudayeusiarhei/Desktop/chromedriver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/modal-dialogs");
        //showSmallModal
        //showLargeModal
        //closeSmallModal
        //closeLargeModal
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        driver.findElement(By.id("showSmallModal")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("closeSmallModal"))).click();

        driver.findElement(By.id("showLargeModal")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("closeLargeModal"))).click();
        driver.quit();
    }
}
