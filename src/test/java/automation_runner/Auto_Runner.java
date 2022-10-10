package automation_runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.utlity.files.Utlity_Files;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Demo Projects\\shopping_cucumber\\Feature\\automation.feature",

				glue = "com.stepdefination"	
				
		)

public class Auto_Runner {


	public static WebDriver driver;
	
	
	@BeforeClass
	public static void step_Up() {

		driver = Utlity_Files.get_Browser("chrome");
		driver.get("http://automationpractice.com/index.php");
		
	}
	@AfterClass
	public static void tear_Down() {

		driver.close();
	}

}
