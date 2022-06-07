package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryProductsPage {
    WebDriver driver;
    public CategoryProductsPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    //Category Locators
    @FindBy(linkText = "Phones")
    WebElement phoneCategory;
    @FindBy(linkText = "Laptops")
    WebElement laptopsCategory;
    @FindBy(linkText = "Monitors")
    WebElement monitorsCategory;


    //Phone Products
    @FindBy(linkText = "Samsung galaxy s7")
    WebElement galaxyS7;

    //Laptops Products
    @FindBy(linkText = "MacBook Pro")
    WebElement macBook;

    //Monitors Products
    @FindBy(linkText = "Apple monitor 24")
    WebElement appleMonitor;


    // Category Methods
    public WebElement phoneCategory(){
        return phoneCategory;
    }
    public WebElement laptopsCategory(){
        return laptopsCategory;
    }
    public WebElement monitorsCategory(){
        return monitorsCategory;
    }


    // Phone Products methods
    public WebElement galaxyS7(){
        return galaxyS7;
    }


    // Laptops Products methods
    public WebElement macBook(){
        return macBook;
    }

    //Monitor methods
    public WebElement appleMonitor(){
        return appleMonitor;
    }
}
