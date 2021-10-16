package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/seth/eclipse-workspace/DEMOWEBSHOP_CONFIRMBOOKING/testingFeatures",
glue= {"stepDefination"}, monochrome=true, 
plugin = {"pretty","html:target/HtmlReports", "junit:target/JUnitReports/report.xml",
"json:target/JSONReports/report.json"}, strict=true)

public class TestRunner {

 
}