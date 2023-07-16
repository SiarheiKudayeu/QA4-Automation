package lesson6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DoubleAndContext {
    public static void main(String[] args) throws InterruptedException {
        //https://demo.guru99.com/test/simple_context_menu.html
        System.setProperty("webdriver.chrome.driver", "/Users/kudayeusiarhei/Desktop/chromedriver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
       //.context-menu-one.btn.btn-neutral
        //button[@ondblclick='myFunction()']
        Actions actions = new Actions(driver);
        Thread.sleep(1000);
        WebElement iFramre = driver.findElement(By.id("gdpr-consent-notice"));
        driver.switchTo().frame(iFramre);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[text()='Accept All']")).click();
        WebElement rightClickButton = driver.findElement(By.cssSelector(".context-menu-one.btn.btn-neutral"));
        actions.contextClick(rightClickButton).perform();
        System.out.println(driver.findElement(By.xpath("//span[text()='Copy']")).getText());
        driver.findElement(By.xpath("//span[text()='Quit']")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        WebElement dblclick = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
        actions.doubleClick(dblclick).perform();
        Alert alert2 = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.alertIsPresent());
        System.out.println(alert2.getText());
        alert2.accept();
        driver.quit();

    }
}
