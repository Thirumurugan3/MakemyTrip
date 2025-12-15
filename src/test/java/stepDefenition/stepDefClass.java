package stepDefenition;

import base.baseClass;
import io.cucumber.java.en.*;
import pom.filterPage;
import pom.homePage;
import pom.passengerDetails;

import java.awt.*;
import java.io.IOException;

public class stepDefClass extends baseClass {

    homePage hp=new homePage(driver);
    filterPage fp=new filterPage(driver);
    passengerDetails pd=new passengerDetails(driver);

    @Given("user enter Url")
    public void user_enter_url() {
        Url("https://www.makemytrip.com/");

    }
    @Then("select bus Catagory")
    public void select_bus_catagory() throws InterruptedException {
        hp.transportType();

    }
    @Then("Enter from details {string}")
    public void enter_from_details(String string) throws InterruptedException {
        hp.Source(string);

    }
    @Then("Enter destination {string}")
    public void enter_destination(String string) throws InterruptedException {
        hp.Destinaton(string);
    }
    @Then("select Date")
    public void select_date() throws InterruptedException, IOException {
        hp.Date();
    }
    @Then("Click Search Button")
    public void click_search_button() throws InterruptedException {
        hp.Search();
    }
    @Then("Select any seat")
    public void select_any_seat() throws InterruptedException {
        fp.Seat();

    }
    @Then("Click Continue button")
    public void click_continue_button() throws InterruptedException {
        fp.clickContinue();

    }
    @Then("proceed payment")
    public void proceed_payment() throws InterruptedException {
        pd.payContinue();

    }

    @Then("Filter the details based on our needs {string} {string}")
    public void filterTheDetailsBasedOnOurNeeds(String arg0, String arg1) throws InterruptedException, AWTException, IOException {
        fp.filterDetails(arg0,arg1);
    }

    @Then("enter the passenger details {string} {string} {string} {string}")
    public void enterThePassengerDetails(String arg0, String arg1, String arg2, String arg3) throws InterruptedException {
      pd.passengerdetails(arg0,arg1,arg2,arg3);
    }

    @Then("select pickup and Drop point {string} {string}")
    public void selectPickupAndDropPoint(String arg0, String arg1) throws InterruptedException {
        fp.pickupDrop(arg0,arg1);
    }
}
