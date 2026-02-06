package testCase;

import base.baseClass;
import org.testng.annotations.Test;
import pom.productPage;

public class productPagetest extends baseClass {


    @Test(dataProvider = "product2")
    public void addproducttest(String product2) throws InterruptedException {
        productPage pp =new productPage(driver);
        pp.addproduct(product2);
    }

}
