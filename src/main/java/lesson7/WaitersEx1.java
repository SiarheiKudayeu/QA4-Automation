package lesson7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class WaitersEx1 {
    public static void main(String[] args) {
        //неявные ожидания
        System.setProperty("webdriver.chrome.driver", "/Users/kudayeusiarhei/Desktop/chromedriver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        //неявные ожидания
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        //неявные ожидания загрузки страницы
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        //неявные ожидания отработки скриптов
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
    }
}
