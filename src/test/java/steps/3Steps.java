package steps;

import pages.3Page;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class 3Steps {

    3Page page = new 3Page();

    @When("I perform Accion 3")
    public void iPerformAccion3() {
        page.performAccion3();
    }

    @Then("I should see Resultado 3")
    public void iShouldSeeResultado3() {
        assertTrue(page.verifyResultado3());
    }
}