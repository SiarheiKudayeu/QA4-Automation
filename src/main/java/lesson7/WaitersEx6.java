package lesson7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitersEx6 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kudayeusiarhei/Desktop/chromedriver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.guinnessworldrecords.com/Account/Login");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ez-accept-all"))).click();
        // .presenceOfElementLocated ожидание появления элемента в ДОМ дереве
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("globe")));

        //textToBePresentInElementValue ожидает появления текста в элементе
        wait.until(ExpectedConditions.textToBePresentInElementValue(By.id("Username"), "Хомяк"));
        driver.findElement(By.id("Password")).sendKeys("Password");
        WebElement element = driver.findElement(By.id("Password"));

        driver.get("https://dan-it.com.ua/uk");
        //.invisibilityOf ожидает исчезновения элемента
        wait.until(ExpectedConditions.invisibilityOf(element));

        //.titleIs ожидает определенного названия страницы
        wait.until(ExpectedConditions.titleIs("Курси програмування в Україні (онлайн та офлайн)☑️ IT курси з працевлаштуванням"));
        driver.findElement(By.xpath("//a[text()='Про нас']")).click();
        //.titleContains ожидает что страница содержит какой-то текст
        wait.until(ExpectedConditions.titleContains("авчальний центр"));
        driver.findElement(By.xpath("//a[text()='Для компаній']")).click();
        driver.quit();
    }
}
