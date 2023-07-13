package lesson7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitersEx3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kudayeusiarhei/Desktop/chromedriver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        //elementToBeClickable, elementToBeSelected, elementSelectionStateToBe
        driver.get("https://www.guinnessworldrecords.com/Account/Login");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ez-accept-all"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn.btn-primary.blue")));
        //elementToBeClickable ожидает чтобы элемент был кликабельным
        wait.until(ExpectedConditions.elementToBeSelected(By.id("RememberMe")));
        //elementToBeSelected ожидает чтобы элемент был выбран
        wait.until(ExpectedConditions.elementSelectionStateToBe(By.id("RememberMe"), false));
        //elementSelectionStateToBe ожидает чтобы выбор был снят
        WebElement login = driver.findElement(By.xpath("//a[contains(text(),'account now')]"));
        login.click();
    }

}
