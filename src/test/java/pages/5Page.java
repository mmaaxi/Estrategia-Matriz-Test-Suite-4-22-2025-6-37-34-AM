package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class 5Page {
    WebDriver driver;
    By resultado5Locator = By.id("RESULTADO_5_ELEMENT_ID");
    
    public 5Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performAccion5() {
        // Add automation code to perform Accion 5 here
    }

    public boolean isResultado5Displayed() {
        return driver.findElement(resultado5Locator).isDisplayed();
    }
}