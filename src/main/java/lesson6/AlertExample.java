package lesson6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/kudayeusiarhei/Desktop/chromedriver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        //button[@onclick= 'jsAlert()']
        //button[@onclick= 'jsConfirm()']
        //button[@onclick= 'jsPrompt()']
        //id = result
        String alert1Resylt1 = "You successfully clicked an alert";
        String alert1Resylt2 = "You clicked: Cancel";
        String alert1Resylt3 = "You entered: ";
        String text = "Hello QA";
        System.out.println("Test1");
        driver.findElement(By.xpath("//button[@onclick= 'jsAlert()']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        boolean result1 = (driver.findElement(By.id("result")).getText()).equals(alert1Resylt1);
        if (result1) {
            System.out.println("Результат совпадает");
        } else {
            System.out.println("Результат не совпадает");
        }
        System.out.println("");
        System.out.println("Test2");
        driver.findElement(By.xpath("//button[@onclick= 'jsConfirm()']")).click();
        Alert alert2 = driver.switchTo().alert();
        System.out.println(alert2.getText());
        alert.dismiss();
        boolean result2 = (driver.findElement(By.id("result")).getText()).equals(alert1Resylt2);
        if (result2) {
            System.out.println("Результат совпадает");
        } else {
            System.out.println("Результат не совпадает");
        }
        System.out.println("");
        System.out.println("Test3");
        driver.findElement(By.xpath("//button[@onclick= 'jsPrompt()']")).click();
        Alert alert3 = driver.switchTo().alert();
        System.out.println(alert3.getText());
        alert.sendKeys(text);
        alert3.accept();
        boolean result3 = (driver.findElement(By.id("result")).getText()).equals(alert1Resylt3 + text);
        if (result3) {
            System.out.println("Результат совпадает");
        } else {
            System.out.println("Результат не совпадает");
        }
        driver.quit();
    }
}
