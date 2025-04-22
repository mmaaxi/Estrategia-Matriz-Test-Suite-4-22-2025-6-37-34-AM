package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class 9Page {

    WebDriver driver;

    @FindBy(id = "action9Button")
    WebElement action9Button;

    @FindBy(id = "result9Element")
    WebElement result9Element;

    public 9Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToTestPage() {
        driver.get("https://example.com/testpage");
    }

    public void performAction9() {
        action9Button.click();
    }

    public boolean isResult9Displayed() {
        return result9Element.isDisplayed();
    }
}