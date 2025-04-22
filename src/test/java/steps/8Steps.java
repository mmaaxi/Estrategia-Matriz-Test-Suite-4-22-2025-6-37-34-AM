package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.8Page;
import static org.junit.Assert.*;

public class 8Steps {
    WebDriver driver;
    8Page page = new 8Page(driver);

    @Given("I am on the relevant page")
    public void i_am_on_the_relevant_page() {
        page.navigateToPage();
    }

    @When("I execute Accion 8")
    public void i_execute_accion_8() {
        page.performAccion8();
    }

    @Then("I should see Resultado 8")
    public void i_should_see_resultado_8() {
        assertTrue(page.isResultado8Displayed());
    }
}