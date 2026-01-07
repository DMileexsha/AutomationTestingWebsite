package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.ElementUtil;

public class EcommercePages {
    private WebDriver driver;
    private ElementUtil elementUtil;

    public EcommercePages(WebDriver driver) {
        this.driver= driver;
        elementUtil = new ElementUtil(driver);
    }


    private By loginlink = By.xpath("//a[text()=' Signup / Login']");
    private By emailTextBox = By.xpath("(//input[@name='email'])[1]");
    private By passwordTextBox = By.xpath("(//input[@name='password'])[1]");
    private By loginButtoninLoginPage = By.xpath("//button[@data-qa='login-button']");
    private By deleteAccountButton = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a");
    private By automationText = By.xpath("//span[contains(text(),'Automation')]");
    private By categoryText = By.xpath("//h2[text()='Category']");
    private By featureItemText = By.xpath("//h2[contains(text(),'Features')]");
    private By productsButton = By.xpath("//a[text()=' Products']");

    private By searchText = By.xpath("//input[@name='search']");
    private By searchTextButtton = By.xpath("//i[@class='fa fa-search']");
    private By SearchProductText = By.xpath("//h2[text()='Searched Products']");

    private By viewProductButton = By.xpath("//a[text()='View Product'][1]");

    private By rupeeSymbol= By.xpath("//span[contains(text(),'Rs')]");
    private By quantity= By.xpath("//input[@name='quantity']");

    private By addToCartButton = By.xpath("//button[@class='btn btn-default cart']");
    private By viewCartButton = By.xpath("//u[text()='View Cart']");

    private By viewTextPopup = By.xpath("//h4[normalize-space()='Added!']");
    private By crossBtn = By.xpath("//i[@class='fa fa-times']");
    private By proceedToCheckoutBtn = By.xpath("//a[text()='Proceed To Checkout']");
    private By deliveryAddressText = By.xpath("//h3[text()='Your delivery address']");
    private By placeOrderBtn = By.xpath("//a[normalize-space()='Place Order']");

    private By nameOnCard = By.xpath("//input[@name='name_on_card']");
    private By cardNoField = By.xpath("//input[@name='card_number']");
    private By cvcField= By.xpath("//input[@name='cvc']");
    private By expiryMonthField= By.xpath("//input[@name='expiry_month']");
    private By expiryYearField= By.xpath("//input[@name='expiry_year']");
    private By payAndConfirmOrder= By.xpath("//button[@id='submit']");
    private By congratsText= By.xpath("//p[text()='Congratulations! Your order has been confirmed!']");

    public void clickLoginButton() {
        elementUtil.click(loginlink);
    }

    public void enterEmail(String email) {
        elementUtil.type(emailTextBox, email);
    }

    public void enterPassword(String password) {
        elementUtil.type(passwordTextBox, password);
    }

    public void clickLoginInLoginPage() {
        elementUtil.click(loginButtoninLoginPage);
    }

    public void checkLoginSuccess() {

       Assert.assertTrue(elementUtil.isDisplayed(deleteAccountButton));

    }


    public void automationTextValidationHomePage() {
        Assert.assertTrue(elementUtil.isDisplayed(automationText));
        Assert.assertTrue(elementUtil.isDisplayed(categoryText));
        Assert.assertTrue(elementUtil.isDisplayed(featureItemText));

    }

    public void clickProductButton(){

        elementUtil.click(productsButton);
    }

    public void performValidationOnProductPage(){
        elementUtil.type(searchText, "men");
        elementUtil.click(searchTextButtton);
       Assert.assertTrue(elementUtil.isDisplayed(SearchProductText));

    }

    public void viewProductButton(){
        elementUtil.click(viewProductButton);
    }

    public void performValidationOnPdp(){

        Assert.assertTrue(elementUtil.isElementPresent(rupeeSymbol));
        elementUtil.type(quantity,"4");

    }

    public void addToCartButton(){
        elementUtil.click(addToCartButton);
    }

    public void viewTextInPopup(){
        Assert.assertTrue(elementUtil.isElementPresent(viewTextPopup));
    }

    public void viewCart(){
        elementUtil.click(viewCartButton);
    }

    public void performValidationOnCart(){
        Assert.assertTrue(elementUtil.isDisplayed(crossBtn));
    }
    public void proceedToCheckout(){
        elementUtil.click(proceedToCheckoutBtn);
    }

    public void performOnCheckoutPage(){
        Assert.assertTrue(elementUtil.isDisplayed(deliveryAddressText));
    }

    public void clickOnPlaceOrder(){
        elementUtil.click(placeOrderBtn);
    }

    public void enterPaymentDetails(){
        elementUtil.type(nameOnCard,"Mileesha");
        elementUtil.type(cardNoField,"2002588056369027");
        elementUtil.type(cvcField,"963");
        elementUtil.type(expiryMonthField,"03");
        elementUtil.type(expiryYearField,"2030");

    }

    public void userClicksPayAndConfirm(){
        elementUtil.click(payAndConfirmOrder);
    }

    public void validateCongratsText(){
        Assert.assertTrue(elementUtil.isDisplayed(congratsText));
    }

}
