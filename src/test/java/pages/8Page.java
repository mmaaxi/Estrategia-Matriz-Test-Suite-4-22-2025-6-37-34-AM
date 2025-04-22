package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class 8Page {
    WebDriver driver;

    @FindBy(id = "performAccion8Button")
    private WebElement accion8Button;

    @FindBy(id = "resultado8")
    private WebElement resultado8Element;

    public 8Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateToPage() {
        driver.get("http://example.com/relevantpage");
    }

    public void performAccion8() {
        accion8Button.click();
    }

    public boolean isResultado8Displayed() {
        return resultado8Element.isDisplayed();
    }
}