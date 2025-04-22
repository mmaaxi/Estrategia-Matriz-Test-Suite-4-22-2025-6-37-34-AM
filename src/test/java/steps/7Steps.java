package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.7Page;

public class 7Steps {
    7Page page = new 7Page();

    @When("I perform Accion 7")
    public void performAccion7() {
        page.doAccion7();
    }

    @Then("I should see Resultado 7")
    public void shouldSeeResultado7() {
        Assert.assertTrue(page.isResultado7Displayed());
    }
}