package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.10Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class 10Steps {

    private WebDriver driver;
    private 10Page page;

    public 10Steps() {
        this.driver = Hooks.driver;
        this.page = PageFactory.initElements(driver, 10Page.class);
    }

    @Given("I perform Accion 10")
    public void iPerformAccion10() {
        page.performAccion10();
    }

    @Then("I should see Resultado 10")
    public void iShouldSeeResultado10() {
        page.verifyResultado10();
    }
}