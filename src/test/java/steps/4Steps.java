package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.4Page;

public class 4Steps {

    WebDriver driver;
    4Page page;

    public 4Steps() {
        this.driver = //... initialize driver
        page = PageFactory.initElements(driver, 4Page.class);
    }

    @Given("the user is on the initial screen")
    public void the_user_is_on_initial_screen() {
        driver.get("https://example.com"); // URL of initial screen
    }

    @When("the user performs Accion 4")
    public void the_user_performs_accion_4() {
        page.performAccion4();
    }

    @Then("the user should see Resultado 4")
    public void the_user_should_see_resultado_4() {
        page.verifyResultado4();
    }
}