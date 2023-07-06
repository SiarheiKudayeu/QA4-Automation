package lesson5.action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ActionEx {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kudayeusiarhei/Desktop/chromedriver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);

        //moveTo
        driver.get("https://dan-it.com.ua/uk/");
        /*WebElement adult = driver.findElements(By.xpath("//a[contains(@href, 'adults/')]")).get(0);
        actions.moveToElement(adult).perform();

        actions.moveToElement(driver.findElement(By.xpath("//a[text()='Програмування']"))).perform();*/

/*        actions.moveToElement(driver.findElements(By.xpath("//a[contains(@href, 'adults/')]")).get(0))
                .pause(Duration.ofSeconds(1))
                .moveToElement(driver.findElement(By.xpath("//a[text()='Програмування']")))
                .pause(Duration.ofSeconds(1))
                .moveToElement(driver.findElement(By.xpath("//a[text()='Java']")))
                .pause(Duration.ofSeconds(1)).click().build().perform();*/

      /*  actions.moveToElement(driver.findElements(By.xpath("//a[contains(@href, 'adults/')]")).get(0))
                .pause(Duration.ofSeconds(1))
                .moveToElement(driver.findElement(By.xpath("//a[text()='Програмування']")))
                .pause(Duration.ofSeconds(1))
                .moveToElement(driver.findElement(By.xpath("//a[text()='Java']")), 0, -40)
                .pause(Duration.ofSeconds(1)).click().build().perform();*/

   /*     actions.moveToElement(driver.findElements(By.xpath("//a[contains(@href, 'adults/')]")).get(0))
                .pause(Duration.ofSeconds(1))
                .moveToElement(driver.findElement(By.xpath("//a[text()='Програмування']")))
                .pause(Duration.ofSeconds(1))
                .click((driver.findElement(By.xpath("//a[text()='Java']")))).build().perform();*/

        WebElement element = driver.findElements(By.xpath("//a[contains(@href, 'adults/')]")).get(0);
        int centreX = element.getLocation().x + (element.getSize().width)/2;
        int centreY = element.getLocation().y + (element.getSize().height)/2;

        actions.moveByOffset(centreX, centreY).perform();

        actions.keyDown(Keys.COMMAND)
                .click(driver.findElement(By.xpath("//a[text()='Про нас']")))
                .keyUp(Keys.COMMAND)
                .build().perform();
    }
}
