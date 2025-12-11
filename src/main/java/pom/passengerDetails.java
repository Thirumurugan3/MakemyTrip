package pom;

import base.baseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class passengerDetails extends baseClass {

    public static WebDriver driver;

    public passengerDetails(WebDriver dr){
        this.driver=dr;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "fname")
    WebElement Name;

    @FindBy(name = "age")
    WebElement Age;

    @FindBy(id = "contactEmail")
    WebElement Email;

    @FindBy(id = "mobileNumber")
    WebElement Phonenum;

    @FindBy(xpath = "//div[@class='maleTab ']")
    WebElement gender;

    @FindBy(xpath = "//span[text()='Continue']")
    WebElement paymentcontinue;

    @FindBy(xpath = "//span[@class='checkboxWpr']")
    WebElement checkbox;


    public void passengerdetails(String name,String age,String email,String phone) throws InterruptedException {
        Thread.sleep(1000);
        sendValues(Name,name);
        Thread.sleep(1000);
        sendValues(Age,age);
        Thread.sleep(1000);
        Click(gender);
        Thread.sleep(1000);
        sendValues(Email,email);
        Thread.sleep(1000);
        sendValues(Phonenum,phone);

    }
    public void payContinue() throws InterruptedException {
        jsScroll(500);
        wait(10);
        Click(checkbox);
        Thread.sleep(1000);
        Click(paymentcontinue);
    }
}
