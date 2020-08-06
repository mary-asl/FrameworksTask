package tests.businessObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locale {

    WebDriver driver;
    private static final By GEO_LOCATION_TEXT_LOCATOR = By.xpath("//span[@class='geo j-geocity-text']");

    public Locale(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getCurrentLocale() {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(GEO_LOCATION_TEXT_LOCATOR));
        return driver.findElement(GEO_LOCATION_TEXT_LOCATOR);
    }
}
