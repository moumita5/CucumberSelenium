package StepDefinations;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.cucumber.java.en.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import java.time.Duration;
//import java.net.URL; 
//import org.openqa.selenium.By; 
//import org.openqa.selenium.remote.DesiredCapabilities;
public class GoogleSearchSteps {

	public static WebDriver driver;
	
	
	@Given("browser is open")
	public void browser_is_open() throws InterruptedException {
		System.out.println("Inside steps: browser is open");
	   // String projectPath = System.getProperty("user.dir");
		//System.out.println("Project path is"+ projectPath);
		//System.setProperty("webdriver.chrome.driver", projectPath + "/CucumberJavaSelenium/src/test/resources/drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:/Users/girim/eclipse-workspace/CucumberJavaSelenium/src/test/resources/drivers/chromedriver.exe");
        driver  = new ChromeDriver();
	 //  public static final WebDriver driver = new ChromeDriver();
	   Thread.sleep(100);
	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  // driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	   Thread.sleep(60);
	   driver.manage().window().maximize();
	   Thread.sleep(100);
	   //driver.quit();
       //driver.close();
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() throws InterruptedException {
		System.out.println("Inside steps: user is on google search page");
		//driver.getProperty("https://facebook.com/"); //#facebook
		driver.navigate().to("https://google.com"); //#google
		//driver.get("https://google.com/");
		//Thread.sleep(60);
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
        System.out.println("Inside steps: user enters the text in search box");
        
           //  driver.findElement(By.name("email")).sendKeys("moumita.giri.7"); //#facebook
     		//  driver.findElement(By.name("pass")).sendKeys("null"); //#facebook
              driver.findElement(By.name("q")).sendKeys("automation step by step"); 
	}

	@And("hits enter")
	public void hits_enter() {
		System.out.println("Inside steps: user hits enter");
		
		 // driver.findElement(By.name("login")).click(); //#facebook
	      	driver.findElement(By.name("q")).sendKeys(Keys.ENTER); 
	
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("user is navigated to search results");
		
		driver.getPageSource().contains("Online Courses");
	}

}
