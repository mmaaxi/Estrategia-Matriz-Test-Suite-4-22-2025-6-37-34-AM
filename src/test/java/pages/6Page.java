package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;

public class 6Page {
    private WebDriver driver;

    public 6Page() {
        this.driver = DriverFactory.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void navigateToPage() {
        driver.get("URL_of_the_page");
    }

    public void performAccion6() {
        WebElement accionElement = driver.findElement(By.id("accion6Button"));
        accionElement.click();
    }

    public boolean isResultado6Displayed() {
        WebElement resultadoElement = driver.findElement(By.id("resultado6Element"));
        return resultadoElement.isDisplayed();
    }
}