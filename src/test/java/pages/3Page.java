package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class 3Page {

    private WebDriver driver;

    private By accion3 = By.id("accion3");
    private By resultado3 = By.id("resultado3");

    public 3Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performAccion3() {
        WebElement accionElement = driver.findElement(accion3);
        accionElement.click(); // Asume un clic como la acción
    }

    public boolean verifyResultado3() {
        WebElement resultadoElement = driver.findElement(resultado3);
        return resultadoElement.isDisplayed();
    }
}