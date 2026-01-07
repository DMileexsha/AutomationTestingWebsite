package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementUtil {

    private WebDriver driver;

    public ElementUtil(WebDriver driver) {
        this.driver = driver;
    }

    // ===================== WAITS =====================

    // Wait until element is VISIBLE (for click, type)
    public WebElement waitForElementVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // Wait until element is PRESENT in DOM (for validation)
    public WebElement waitForElementPresent(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    // ===================== ACTIONS =====================

    public void click(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));

        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView({block:'center'});", element);

        element.click();
    }




    public void type(By locator, String text) {
        WebElement element = waitForElementVisible(locator);
        element.clear();
        element.sendKeys(text);
    }

    // ===================== VALIDATIONS =====================

    // Safe display check (no timeout failure)
    public boolean isDisplayed(By locator) {
        try {
            return waitForElementPresent(locator).isDisplayed();
        } catch (Exception e) {
            return true;
        }
    }

    // Check element exists in DOM
    public boolean isElementPresent(By locator) {
        try {
            waitForElementPresent(locator);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Object getText(By locator) {
        try {
            return waitForElementVisible(locator).getText().trim();
        } catch (Exception e) {
            return null;
        }
    }



    // ===================== PAGE LOAD =====================

    // Wait for full page load (use on homepage)
    public void waitForPageLoad() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(webDriver ->
                ((org.openqa.selenium.JavascriptExecutor) webDriver)
                        .executeScript("return document.readyState")
                        .equals("complete"));
    }
}
