package Lesson4;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.Set;

public class DriverMethods {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kudayeusiarhei/Desktop/chromedriver/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(options);

        //manage
        /*driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua/");

        Set<Cookie> set = driver.manage().getCookies();
        System.out.println(set);
        for (Cookie cookie: set){
            System.out.println(cookie);
        }
        System.out.println("Общее кол-во ccokies равно " + set.size());
        System.out.println("Отдельная кука " + set.toArray()[2]);*/


       /* driver.get("https://rozetka.com.ua/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        //getCurrentUrl
        System.out.println(driver.getCurrentUrl());
        //getTitle
        System.out.println("==========================");
        System.out.println(driver.getTitle());
        System.out.println("==========================");
        System.out.println(driver.getPageSource());*/

        //navigate
        driver.get("https://rozetka.com.ua/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@class='fat-wrap']//a[text()='Ноутбуки и компьютеры']")).click();
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        driver.navigate().back();
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        driver.navigate().to("https://dan-it.com.ua/");
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
