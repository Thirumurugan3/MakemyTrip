package runner;


import base.baseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/featureFolder/trip.feature",glue = "stepDefenition")

public class runnerClass extends baseClass {


    @BeforeClass
    public static void Start(){
        browserLaunch();
        windowMaximize();
    }

    @AfterClass
    public static void End(){
//        driver.quit();
    }
}
