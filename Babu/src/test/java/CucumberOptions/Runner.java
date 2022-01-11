package CucumberOptions;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( features = "src/test/java/Feature", tags =  "@ListUser",  
		//"@CallHistory, @SignUp, @Forgotpassword, @CallDetailScreen, @zoomCallInitiate, @EditProfile, @myProfile, @ChangePassword, @CallDetailsEntry, @AboutUs,  @Forgotpassword,  @MailRepot",  
glue =  { "StepDefinition" }, 
        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}, 
        monochrome = true
)
public class Runner {
@AfterClass
public static void writeExtentReport() {
  //  Reporter.loadXMLConfig(new File("Config/report.xml"));

}

}
