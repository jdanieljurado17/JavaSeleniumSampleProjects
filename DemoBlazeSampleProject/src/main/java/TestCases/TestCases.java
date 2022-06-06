package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCases {

    @Test
    public void thisTest(){

        System.out.println("Hello World");
    }

    public void logIn(){
        System.setProperty("webdriver.chrome.driver",".\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().window().maximize();


    }
}
