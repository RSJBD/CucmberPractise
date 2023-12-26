package hooks;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.net.MediaType;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class HooksClass {

	
	WebDriver driver;
	@Before()//before/After & BeforeSteps/AfterStepshave {Order , Value} But BeforeAll/AfterAll only "Order"
	public void beforeScenario(Scenario scenario) {
		System.out.println("beforeScenario");
		System.out.println(scenario.getId());
		System.out.println(scenario.getName());
		System.out.println(scenario.isFailed());
		System.out.println(scenario.getLine());
	

		scenario.log("Commetns or Message Type here");//Can't  print the value
	}
	@After
	public void afterScenario(Scenario scenario) {
		System.out.println("afterScenario");
		TakesScreenshot ss =((TakesScreenshot)driver);
		byte[] screenshotAs = ss.getScreenshotAs(OutputType.BYTES);
		
		System.out.println(scenario.getSourceTagNames());
		System.out.println(scenario.getStatus());
		System.out.println(scenario.getUri());
		
		scenario.attach(screenshotAs, "img/png", "Image");
	}
	@BeforeStep(value="@Tagname")
	public void beforEachSteps(Scenario scenario) {
		System.out.println("beforEachSteps");
	}
	@AfterStep()
	public void afterEachSteps(Scenario scenario) {
		System.out.println("afterEachSteps");
	}
	@BeforeAll()
	public void beforeAll(Scenario scenario) {
		System.out.println("beforeAll");
	}
	@AfterAll()
	public void afterAll(Scenario scenario) {
		System.out.println("afterAll");
	}
}
