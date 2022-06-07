package TestCases;

import PageObjects.CategoryProductsPage;
import PageObjects.LogInPage;
import PageObjects.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

import java.time.Duration;

public class TestCasesDemoBlaze {
    //Declaring variables

    public String baseUrl = "https://www.demoblaze.com/index.html";
    public WebDriver driver;
    //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    String username = "thisTest4";
    String password = "thisTest1";
    String email = "thisemail@example.com";
    String name = "Joe Smith";
    String message = "This is a message hehehe";



    @BeforeTest
    public void setBaseUrl(){
        System.setProperty("webdriver.chrome.driver",".\\src\\main\\resources\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseUrl);

    }

    @Test(priority = 1)
    public void signUp(){
        /*System.setProperty("webdriver.chrome.driver",".\\src\\main\\resources\\Drivers\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.demoblaze.com/index.html");*/
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        //Step to step
        MainPage mP = new MainPage(driver);
        mP.signUpButton().click();
        mP.usernameSignUp().sendKeys(username);
        mP.passwordSignUp().sendKeys(password);
        mP.confirmSignUpButton().click();
        wait.until(ExpectedConditions.alertIsPresent());
        String alertText = driver.switchTo().alert().getText();
        System.out.println(alertText);
        //Assert.assertEquals(alertText, "Sign up successful.");
        driver.switchTo().alert().accept();
    }

    @Test(priority = 2)
    public void logIn (){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        //Step to step
        LogInPage lP = new LogInPage(driver);
        lP.loginButton().click();
        lP.usernameLogIn().sendKeys(username);
        lP.passwordLogIn().sendKeys(password);
        lP.confirmLogInButton().click();
        wait.until(ExpectedConditions.visibilityOf(lP.nameOfUser()));
        System.out.println(lP.nameOfUser().getText());
        Assert.assertEquals(lP.nameOfUser().getText(), "Welcome " +username);

    }

    @Test(priority = 3)
    public void contactForm()  {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        MainPage mP = new MainPage(driver);
        mP.contactButton().click();
        mP.emailContact().sendKeys(email);
        mP.nameContact().sendKeys(name);
        mP.messageContact().sendKeys(message);
        mP.contactButtonConfirmation().click();
        wait.until(ExpectedConditions.alertIsPresent());
        String alertText = driver.switchTo().alert().getText();
        System.out.println(alertText);
        Assert.assertEquals(alertText, "Thanks for the message!!");
        driver.switchTo().alert().accept();

    }

    @Test(priority = 4)
    public void categoryPhone(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        CategoryProductsPage cP = new CategoryProductsPage(driver);
        cP.phoneCategory().click();
        System.out.println(cP.galaxyS7().getText());
        Assert.assertEquals(cP.galaxyS7().getText(), "Samsung galaxy s7");
    }

    @Test(priority = 5)
    public void categoryLaptop(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        CategoryProductsPage cP = new CategoryProductsPage(driver);
        cP.laptopsCategory().click();
        System.out.println(cP.macBook().getText());
        Assert.assertEquals(cP.macBook().getText(), "MacBook Pro");
    }

    @Test(priority = 6)
    public void categoryMonitor(){
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        CategoryProductsPage cP = new CategoryProductsPage(driver);
        cP.monitorsCategory().click();
        System.out.println(cP.appleMonitor().getText());
        Assert.assertEquals(cP.appleMonitor().getText(), "Apple monitor 24");
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

    /*public void logInFunction (){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        LogInPage lP = new LogInPage(driver);
        lP.loginButton().click();
        lP.usernameLogIn().sendKeys(username);
        lP.passwordLogIn().sendKeys(password);
        lP.confirmLogInButton().click();
        wait.until(ExpectedConditions.visibilityOf(lP.nameOfUser()));
        System.out.println(lP.nameOfUser().getText());
        Assert.assertEquals(lP.nameOfUser().getText(), "Welcome " +username);
    }*/
}









