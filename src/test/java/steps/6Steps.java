package steps;

import pages.6Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class 6Steps {
    private 6Page page;

    public 6Steps() {
        page = new 6Page();
    }

    @Given("I am on the necessary page")
    public void i_am_on_the_necessary_page() {
        page.navigateToPage();
    }

    @When("I perform Accion 6")
    public void i_perform_accion_6() {
        page.performAccion6();
    }

    @Then("I should see Resultado 6")
    public void i_should_see_resultado_6() {
        Assert.assertTrue(page.isResultado6Displayed());
    }
}