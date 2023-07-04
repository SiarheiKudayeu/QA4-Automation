package Lesson4;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Set;

public class WorkingWithHandle2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selen\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://dan-it.com.ua/uk/");
        Set<String> windowHandles1 = driver.getWindowHandles();
        //driver.getTitle()
        ((JavascriptExecutor) driver).executeScript("window.open()");
        Set<String> windowHandles2 = driver.getWindowHandles();
        windowHandles2.removeAll(windowHandles1);
        String newDescriptor = windowHandles2.iterator().next();
        driver.switchTo().window(newDescriptor);
        driver.get("https://rozetka.com.ua/computers-notebooks/c80253/");
        Thread.sleep(2000);
        driver.quit();
    }
}
