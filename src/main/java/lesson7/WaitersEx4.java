package lesson7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitersEx4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kudayeusiarhei/Desktop/chromedriver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/nestedframes");
        WebDriverWait wmyBestWaiters = new WebDriverWait(driver, Duration.ofSeconds(10));
        wmyBestWaiters.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("frame1")));
        System.out.println(driver.findElement(By.tagName("body")).getText());

        wmyBestWaiters.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
        System.out.println(driver.findElement(By.tagName("p")).getText());
        driver.quit();
    }

}
