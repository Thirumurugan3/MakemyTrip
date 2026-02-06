package testCase;

import base.baseClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom.homePage;

public class homePagetest extends baseClass {



    @BeforeTest
    public void launch(){
        launchBrowser();
    }

    @Test(dataProvider = "product1")
    public  void searchtest(String product) throws InterruptedException {
        homePage hp=new homePage(driver);
        hp.searchproduct(product);
    }

}
