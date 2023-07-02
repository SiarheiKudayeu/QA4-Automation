package lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsCss {
    private static class Data {
        private static final String validLogin = "Login";
        private static final String validPass = "Password";
    }

    private static class Url {
        private static final String records = "https://www.guinnessworldrecords.com/records/";
        private static final String applySetRecord = "https://www.guinnessworldrecords.com/records/apply-to-set-or-break-a-record/";
        private static final String login = "https://www.guinnessworldrecords.com/Account/Login";
        private static final String search = "https://www.guinnessworldrecords.com/search";
    }

    private static class Locators {
        private static final By acceptCookies = By.cssSelector(".ez-switch-view-btn.ez_twentytwentytwo_corners");
    }

    public static void acceptCookies(WebDriver driver) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.findElements(Locators.acceptCookies).get(1).click();
    }

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selen\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

    /*    // поиск по тегу
        driver.get(Url.search);
        driver.findElements(By.cssSelector("input")).get(1).sendKeys("Text");
        Thread.sleep(1000);

        //поиск по id #
        System.out.println(driver.findElement(By.cssSelector("#search-button")).getText());
        driver.quit();*/

        // По классу .class_name  пробелы заменяем точками
       /* driver.get(Url.login);
        acceptCookies(driver);
        System.out.println(driver.findElement(By.cssSelector(".btn.btn-primary.blue")).getText());*/

        // поиск по атрибуту
    /*    driver.get(Url.search);
        driver.findElement(By.cssSelector("[title='Search']")).click();
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        //по части значения атрибута
        driver.findElement(By.cssSelector("[title*='earc']")).click();
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        //по начальным символам значения атрибута
        driver.findElement(By.cssSelector("[title^='Sear']")).click();
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        //по конечным символам значения атрибута
        driver.findElement(By.cssSelector("[title$='arch']")).click();
        Thread.sleep(2000);
        driver.quit()*/;

        //движение вниз по дереву
        driver.get(Url.records);
        acceptCookies(driver);
        driver.findElement(By.cssSelector(".secondary_menu_wrapper [href*='-process']")).click();

        // ключевое слово not
        // .btn:not(.blue)



    }
}
