package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;

public class 10Page {

    private WebDriver driver;
    private WebDriverWait wait;

    public 10Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void performAccion10() {
        // Implementación de la acción 10
    }

    public void verifyResultado10() {
        // Verificación del resultado 10
    }
}