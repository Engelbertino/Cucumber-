package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.util.concurrent.TimeUnit;

public class GoogleSearchSteps {


    WebDriver driver = null;

//    @Given("browser is open")
//    public void browser_is_open() {
//        System.out.println("Inside Step - browser is open");
//        WebDriverManager.chromedriver().setup();
//       // String projectPath = System.getProperty("Arbeit-Pc");
//       // System.out.println("Project path is: "+ projectPath);
//        //System.getProperty("webdriver.chrome.driver",projectPath+"\\src\\driver\\chromedriver.exe" );
//
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
//    }
//    @And("user is on google search page")
//    public void user_is_on_google_search_page(){
//        System.out.println("Inside Step - user is on google search page");
//        driver.navigate().to("https://www.google.com/");
//    }
//    @When("user enters a text in search box")
//    public void user_enters_a_text_in_search_box() throws InterruptedException {
//        System.out.println("Inside Step - user enters a text in search box");
//
//        // Meldung ablehnen
//        driver.findElement(By.xpath("//*[@id=\"W0wltc\"]/div")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.name("q")).sendKeys("AUTOMATION Step by Step");
//
//    }
//    @And("hits enter")
//    public void hits_enter() throws InterruptedException {
//        System.out.println("Inside Step - hits enter");
//        Thread.sleep(3000);
//        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//
//    }
//    @Then("user s navigated to search results")
//    public void user_s_navigated_to_search_results() {
//        System.out.println("Inside Step - user s navigated to search results");
//        driver.getPageSource().contains("Online Courses");
//
//        driver.close();
//        driver.quit();
//    }
}
