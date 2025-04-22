package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.5Page;

public class 5Steps {
    WebDriver driver;
    5Page page;

    @Given("I am on the initial page")
    public void iAmOnTheInitialPage() {
        driver = new // Initialize your WebDriver here
        page = new 5Page(driver);
        driver.get("URL_OF_THE_INITIAL_PAGE");
    }
    
    @When("I perform Accion 5")
    public void iPerformAccion5() {
        page.performAccion5();
    }

    @Then("I should see Resultado 5")
    public void iShouldSeeResultado5() {
        Assert.assertTrue("Resultado 5 is not displayed", page.isResultado5Displayed());
        driver.quit();
    }
}