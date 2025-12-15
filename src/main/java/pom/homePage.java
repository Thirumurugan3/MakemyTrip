package pom;

import base.baseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class homePage extends baseClass {

    public static WebDriver driver;

    public homePage(WebDriver dr){
        this.driver=dr;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//li[@data-cy='menu_Buses']")
    WebElement bus;

    @FindBy(xpath = "//img[@alt='minimize']")
    WebElement popup;

    @FindBy(xpath = "//label[@for='fromCity']")
    WebElement from;

    @FindBy(xpath = "//input[@title='From']")
    WebElement source;

    @FindBy(xpath = "(//li[@role='option'])[1]")
    WebElement sourceLocation;

    @FindBy(id = "toCity")
    WebElement To;

    @FindBy(xpath = "//input[@placeholder='To']")
    WebElement destination;

    @FindBy(xpath = "//span[@class='sr_city blackText']")
    WebElement destLocation;

    @FindBy(xpath = "(//div[@role='gridcell'])[30]")
    WebElement date;

    @FindBy(id = "travelDate")
    WebElement travelDate;

    @FindBy(xpath = "//button[@data-cy='submit']")
    WebElement searchButton;



    public void transportType() throws InterruptedException {
        wait(10);
        singleClick();
        wait(10);
        Click(popup);
        wait(10);
        Thread.sleep(2000);
        Click(bus);
        Thread.sleep(2000);

    }
    public void Source(String string) throws InterruptedException {
        jsClick(from);
        Thread.sleep(3000);
        sendValues(source,string);
        Thread.sleep(3000);
        jsClick(sourceLocation);

    }
    public void Destinaton(String string1) throws InterruptedException {

        Thread.sleep(5000);
        jsClick(To);
        wait(20);
        sendValues(destination,string1);
        Thread.sleep(2000);
        jsClick(destLocation);

    }
    public void Date() throws InterruptedException, IOException {

        jsClick(travelDate);
        Thread.sleep(2000);
        jsScroll(200);
        Thread.sleep(1000);
        Click(date);
        Screenshots("1");
        Thread.sleep(2000);

    }
    public void Search() throws InterruptedException {
        Click(searchButton);
        Thread.sleep(2000);
    }
}
