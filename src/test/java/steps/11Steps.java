package steps;

import pages.11Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class 11Steps {

    11Page page = new 11Page();

    @Given("the user performs Accion 11")
    public void theUserPerformsAccion11() {
        page.performAccion11();
    }

    @Then("the result should be Resultado 11")
    public void theResultShouldBeResultado11() {
        assertTrue(page.verifyResultado11());
    }
}