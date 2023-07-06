package lesson5.select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectEx {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/kudayeusiarhei/Desktop/chromedriver/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("http://ktokuda.net/");
       /* WebElement countries = driver.findElement(By.id("itt_country"));
        Select countriesSelect = new Select(countries);

        //select
        countriesSelect.selectByValue("372");
        Thread.sleep(2000);
        countriesSelect.selectByVisibleText("Мальдивы");
        Thread.sleep(2000);
        countriesSelect.selectByIndex(3);

        //isMultiple()
        System.out.println(countriesSelect.isMultiple());
        driver.quit();*/


        //getOptions();
        driver.findElement(By.xpath("//a[text()='Экскурсионные']")).click();
        Select countryList = new Select(driver.findElement(By.id("country_list")));

        List<WebElement> countries = countryList.getOptions();
/*        for (WebElement country : countries) {
            System.out.println(country.getText());
        }*/
        countryList.selectByVisibleText("Албания");
        countryList.selectByVisibleText("Андорра");
        countryList.selectByVisibleText("Бельгия");

        countryList.deselectByVisibleText("Андорра");
        Thread.sleep(2000);
        countryList.deselectByIndex(0);
        Thread.sleep(3000);

        List<WebElement> selectedOptions = countryList.getAllSelectedOptions();


        Thread.sleep(2000);
        countryList.deselectAll();
        for (WebElement country : selectedOptions) {
            System.out.println(country.getText());
        }

    }
}
