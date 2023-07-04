package Lesson4;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Set;

public class ExampleTask {
    /*
    Открыть в браузере три различные вкладки. На каждой вкладке открыть отдельно различные любые страницы,
    вывести в консоль названия открытых страниц. Закрыть браузер.
    */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\selen\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://dan-it.com.ua/uk/");
        System.out.println(driver.getTitle());
        Set<String> windowHandles1 = driver.getWindowHandles();

        ((JavascriptExecutor) driver).executeScript("window.open()");
        Set<String> windowHandles2 = driver.getWindowHandles();
        windowHandles2.removeAll(windowHandles1);
        String newDescriptor = windowHandles2.iterator().next();
        driver.switchTo().window(newDescriptor);
        driver.get("https://rozetka.com.ua/computers-notebooks/c80253/");
        System.out.println(driver.getTitle());

        Set<String> windowHandles3 = driver.getWindowHandles();
        ((JavascriptExecutor) driver).executeScript("window.open()");
        Set<String> windowHandles4 = driver.getWindowHandles();
        windowHandles4.removeAll(windowHandles3);
        driver.switchTo().window(windowHandles4.iterator().next());
        driver.get("https://guinnessworldrecords.com/records/");
        System.out.println(driver.getTitle());
        driver.close();
        Thread.sleep(2000);
        driver.quit();
    }
}
