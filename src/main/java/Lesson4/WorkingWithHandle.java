package Lesson4;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Set;

public class WorkingWithHandle {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selen\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://dan-it.com.ua/uk/");
        System.out.println(driver.getWindowHandle());

        ((JavascriptExecutor)driver).executeScript("window.open()");
        driver.get("https://guinnessworldrecords.com/records/");
        System.out.println(driver.getWindowHandles());

        Set<String> windowHanles = driver.getWindowHandles();
        String decriprot2 = (String) windowHanles.toArray()[1];
        System.out.println(decriprot2);
        driver.switchTo().window(decriprot2);
        driver.get("https://rozetka.com.ua/computers-notebooks/c80253/");
        driver.quit();
    }
}
