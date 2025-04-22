import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.2Page;

import static org.junit.Assert.assertTrue;

public class 2Steps {
    private WebDriver driver;
    private 2Page page;

    public 2Steps() {
        this.driver = Hooks.getDriver();
        this.page = PageFactory.initElements(driver, 2Page.class);
    }

    @When("^I perform Accion 2$")
    public void iPerformAccion2() {
        page.performAccion2();
    }

    @Then("^I expect Resultado 2$")
    public void iExpectResultado2() {
        assertTrue(page.isResultado2Expected());
    }
}