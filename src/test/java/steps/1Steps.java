package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.1Page;

public class 1Steps {

    WebDriver driver;
    1Page page;

    public 1Steps() {
        driver = Hooks.getDriver();
        page = PageFactory.initElements(driver, 1Page.class);
    }

    @Given("I perform Accion 1")
    public void performAccion1() {
        page.performAction1();
    }

    @Then("I should see Resultado 1")
    public void shouldSeeResultado1() {
        page.verifyResultado1();
    }
}