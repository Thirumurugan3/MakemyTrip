package pom;

import actionDriver.actionClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productPage extends actionClass {


    public productPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }


    @FindBy(xpath = "//button[text()='Add to cart']")
    WebElement addcart;

    @FindBy(name = "q")
    WebElement srchprdct2;

    @FindBy(xpath = "//img[@title='Flipkart']")
    WebElement home;

    @FindBy(xpath = "//span[@role='button']")
    WebElement popup;

    @FindBy(xpath = "(//img[@class='UCc1lI']|//div[@class='p0C73x'])[1]")
    WebElement product2;

    @FindBy(xpath = "(//div[@class='iCspr8 AF1m2F'])[1]")
    WebElement filter1;

    @FindBy(xpath = "(//label[@class='BMOCJ3 StZidb'])[1]")
    WebElement brand;


    public void addproduct(String prodct2) throws InterruptedException {
        windowhandle();
        jsScroll(1000);
        Click(addcart);
        Thread.sleep(2000);
        Click(home);
        Thread.sleep(2000);
        try {
            Click(popup);
        } catch (Exception e) {
            System.out.println("Popup missing");
        }
        srchprdct2.sendKeys(prodct2, Keys.ENTER);
        Thread.sleep(2000);
        Click(filter1);
        Thread.sleep(2000);
//        Click(brand);
//        Thread.sleep(2000);
        Click(product2);
        windowhandle();
        jsScroll(1000);
        Thread.sleep(2000);
        Click(addcart);

    }


}
