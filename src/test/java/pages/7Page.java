package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class 7Page {
    WebDriver driver;

    By accion7Locator = By.id("accion7");
    By resultado7Locator = By.id("resultado7");

    public 7Page(WebDriver driver) {
        this.driver = driver;
    }

    public void doAccion7() {
        driver.findElement(accion7Locator).click();
    }

    public boolean isResultado7Displayed() {
        return driver.findElement(resultado7Locator).isDisplayed();
    }
}