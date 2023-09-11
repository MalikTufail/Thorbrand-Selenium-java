package StepDefinitions;

import Pages.Find_a_Lawyer_Page;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.DriverManager;

import java.util.concurrent.TimeUnit;


public class Find_A_Lawyer_Tests {
    WebDriver driver;

    Find_a_Lawyer_Page peoplePageObj;

    DriverManager.BrowserType type = DriverManager.BrowserType.CHROME_WIN;

    @Before
    public void setup() {
        driver = DriverManager.getDriver(type);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        peoplePageObj = new Find_a_Lawyer_Page(driver); // Pass the driver instance here
    }
    @After
    public void TearDown() {driver.quit();}
    /* ------------------------  Given --------------------------- */

    @Given("a home page")
    public void a_home_page() {
        driver.get("https://publish-p48997-e257700.adobeaemcloud.com/");
    }

    @Given("a people page")
    public void a_people_page() {
        driver.get(Find_a_Lawyer_Page.PAGE_URL);

    }
    /* ----------------------- When ------------------------------ */

    @When("I click on the find a lawyer link")
    public void I_click_on_the_find_a_lawyer_link() {
        peoplePageObj.clickMenu();
    }

    @When("I type anything in the input field")
    public void I_type_anything_in_the_input_field() {
//        System.out.println("When step");
        peoplePageObj.nameInput("john");
        System.out.println("When step");
    }

    /* ----------------------- Then ------------------------------ */

    @Then("I am on the people page")
    public void I_am_on_the_people_page() {
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = peoplePageObj.PAGE_TITLE;
        Assert.assertEquals(ActualTitle, ExpectedTitle);
    }

    @Then("the auto suggestion works")
    public void the_auto_suggestion_works(){
        System.out.println("Then step");
    }
}
