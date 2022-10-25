//package StepDefinitions;
//
//import Pagefactory.LoginPage_PF;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.concurrent.TimeUnit;
//
//public class LoginDemoSteps_PF {
//
//    WebDriver driver = null;
//    LoginPage_PF login;
//
//
//
//    @Given("browser is open")
//    public void browser_is_open() {
//        System.out.println("Inside Step-user- browser is open");
//        WebDriverManager.chromedriver().setup();
//
//
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//
//    }
//    @And("user is on login page")
//    public void user_is_on_login_page() throws InterruptedException {
//        System.out.println("Inside Step-user- user is on login page");
//        driver.navigate().to("https://example.testproject.io/web/");
//        Thread.sleep(1000);
//
//
//
//    }
//    @When("^user enters (.*) and (.*)$")
//    public void user_enters_username_and_passwort(String username, String password) throws InterruptedException {
//       // System.out.println("Inside Step-user- user enters username and password");
//        Thread.sleep(1000);
//
//        driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys(username);
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
//
//        Thread.sleep(2000);
//
//    }
//    @When("user clicks on login")
//    public void user_clicks_on_login() throws InterruptedException {
//        System.out.println("Inside Step-user- user clicks on login");
//        driver.findElement(By.id("login")).click();
//        Thread.sleep(2000);
//
//    }
//
//    @Then("user is navigated to the home page")
//    public void user_is_navigated_to_the_home_page() throws InterruptedException {
//        System.out.println("Inside Step-user is navigated to the home page");
//        driver.findElement(By.id("logout")).isDisplayed();
//        Thread.sleep(2000);
//
//        driver.quit();
//
//    }
//
//}
