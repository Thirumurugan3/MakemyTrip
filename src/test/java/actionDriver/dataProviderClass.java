package actionDriver;

import org.testng.annotations.DataProvider;

public class dataProviderClass {

    @DataProvider(name = "product1")
    public String[][] product1(){
        String data[][]=new String[1][1];

        data[0][0]="Tv";
//        data[1][0]="Shirt";

        return data;
    }

    @DataProvider(name = "product2")
    public String[][] product2(){
        String data[][]=new String[1][1];

        data[0][0]="Graphics Card";
//        data[1][0]="airpods";

        return data;
    }
}
