package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class 4Page {

    WebDriver driver;

    @FindBy(how = How.ID, using = "accion4Button")
    private WebElement accion4Button;

    @FindBy(how = How.ID, using = "resultado4Text")
    private WebElement resultado4Text;

    public 4Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performAccion4() {
        accion4Button.click();
    }

    public void verifyResultado4() {
        // Add assertion logic or validations for Resultado 4
        String expectedText = "Expected Resultado 4";
        assert resultado4Text.getText().equals(expectedText) : "Resultado 4 validation failed!";
    }
}