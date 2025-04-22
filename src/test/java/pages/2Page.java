import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class 2Page {
    private WebDriver driver;

    @FindBy(id = "someElemId") // Replace with actual element ID
    private WebElement accion2Element;

    @FindBy(id = "resultElemId") // Replace with actual element ID
    private WebElement resultado2Element;

    public 2Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void performAccion2() {
        accion2Element.click(); // Example action, replace with actual action
    }

    public boolean isResultado2Expected() {
        return resultado2Element.isDisplayed(); // Example condition, replace with actual validation
    }
}