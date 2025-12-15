package pom;

import base.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.io.IOException;
import java.util.List;
import java.util.Random;


public class filterPage extends baseClass {

    public static WebDriver driver;

    public filterPage(WebDriver dr) {
        this.driver = dr;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//p[text()='AC'])[2]")
    WebElement acCoach;

    @FindBy(xpath = "//span[@class='sleeperIcon appendRight5']")
    WebElement sleeper;

    @FindBy(xpath = "(//span[contains(text(),'Show all')])[1]")
    WebElement more;


    @FindBy(xpath = "(//div[@class='makeFlex flexOne'])[1]")
    WebElement point1;

    @FindBy(xpath = "(//input[@placeholder='Search'])[1]")
    WebElement srch1;

    @FindBy(xpath = "(//input[@placeholder='Search'])[3]")
    WebElement srch;

    @FindBy(xpath = "((//div[@class='HideShowSection_borderBottom__O_4sX'])[4]//div)[5]")
    WebElement drop;

    @FindBy(xpath = "(//input[@placeholder='Search'])[2]")
    WebElement bottom;

    @FindBy(xpath = "//p[text()='Price']")
    WebElement price;

    @FindBy(xpath = "(//div[@class='BusCard_sectionWrapper__yT8Q3'])[1]//button")
    WebElement selectSeat;

    public By avilableseats=By.xpath( "//img[contains(@alt,'SLEEPER')]/following-sibling::div[contains(@class,'false')]");

//    @FindBy(xpath = "//div[text()='Koyambedu']")
//    WebElement boardingpoint;

    public WebElement board(String name){
        return driver.findElement(By.xpath("//div[text()='"+name+"']"));
    }

//    @FindBy(xpath = "//div[text()='Lakshminagar Bypass']")
//    WebElement droppoit;

    public WebElement drop(String name){
        return driver.findElement(By.xpath("//div[text()='"+name+"']"));
    }

    @FindBy(xpath = "//button[text()='Continue']")
    WebElement continuebtn;

    @FindBy(xpath = "(//div[@class='PickUpDropSelection_pickDropContainer__VSr2j'])[1]")
    WebElement pickupScroll;

    @FindBy(xpath = "(//div[@class='PickUpDropSelection_pickDropContainer__VSr2j'])[2]")
    WebElement DropScroll;

    public void filterDetails(String text, String txt) throws InterruptedException, AWTException, IOException {
        Thread.sleep(1000);
        Click(acCoach);
        Thread.sleep(1000);
        Click(sleeper);
        Thread.sleep(1000);
        sendValues(srch1,text);
        Thread.sleep(1000);
        Click(point1);
        Thread.sleep(3000);
        sendValues(srch, txt);
        Thread.sleep(1000);
        Click(drop);
        Thread.sleep(1000);
        keyPress();
        keyPress();
        keyRelease();
        Screenshots("2");
        Thread.sleep(3000);
        Click(price);

    }
    public void Seat() throws InterruptedException {
        Thread.sleep(2000);
        jsClick(selectSeat);
        Thread.sleep(2000);
        jsScroll(800);
        List<WebElement> availseats = driver.findElements(avilableseats);
        Random r = new Random();
        int index = r.nextInt(availseats.size());
        Thread.sleep(2000);
        availseats.get(index).click();

    }
    public void pickupDrop(String Board,String Drop) throws InterruptedException {
        elementScroll(pickupScroll,200);
        Thread.sleep(2000);
        Click(board(Board));
        elementScroll(DropScroll,200);
        Thread.sleep(2000);
        Click(drop(Drop));
    }
    public void clickContinue() throws InterruptedException {
        jsScroll(800);
        Thread.sleep(2000);
        Click(continuebtn);

    }
}
