package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.9Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class 9Steps {
    
    WebDriver driver;
    9Page page;

    public 9Steps(WebDriver driver) {
        this.driver = driver;
        page = PageFactory.initElements(driver, 9Page.class);
    }

    @Given("el usuario está en la página de prueba")
    public void elUsuarioEstaEnLaPaginaDePrueba() {
        page.navigateToTestPage();
    }

    @When("el usuario realiza la acción 9")
    public void elUsuarioRealizaAccion9() {
        page.performAction9();
    }

    @Then("se espera el resultado 9")
    public void seEsperaResultado9() {
        assertTrue(page.isResult9Displayed());
    }
}