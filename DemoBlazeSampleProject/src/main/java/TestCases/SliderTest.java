package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class SliderTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",".\\src\\main\\resources\\Drivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/index.html");

        String selector = "carousel-inner";
        List<WebElement> items = driver.findElements(By.className(selector));
        ArrayList list1 = new ArrayList();
        String name;
        for (int i = 0; i < items.size(); i++) {
            int index = i + 1;
            //This will get the name of each item in carousel
            name = driver.findElement(By.className(selector + "[" + index + "]")).getText();
            list1.add(name);
        }

        System.out.println(list1);

    }
}
