package stepDefinitions;

import configs.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.EcommercePages;

public class MyStepDefinitions {
    WebDriver driver= DriverFactory.getDriver();
    EcommercePages ecommercePages = new EcommercePages(driver);


    @Given("I am on the landing page")
    public void i_am_on_the_landing_page() {
            Assert.assertTrue(driver.getTitle().contains("Automation Exercise"));
    }

    @Then("user clicks the login button")
    public void user_clicks_the_login_button() {
        ecommercePages.clickLoginButton();

    }
    @Then("user enters email and password")
    public void user_enters_email_and_password() {
        ecommercePages.enterEmail("its.eliza328@gmail.com");
        ecommercePages.enterPassword("eliza2002");

    }
    @Then("user clicks login")
    public void user_clicks_login() {
        ecommercePages.clickLoginButton();

    }
    @Then("validates if login is success")
    public void validates_if_login_is_success() {
     ecommercePages.checkLoginSuccess();

    }
    @Then("user performs validation on the homepage")
    public void user_performs_validation_on_the_homepage() {
        ecommercePages.automationTextValidationHomePage();

    }
    @When("user clicks on products")
    public void user_clicks_on_products() {
        ecommercePages.clickProductButton();

    }
    @Then("user performs the validations on product listing page")
    public void user_performs_the_validations_on_product_listing_page() {
        ecommercePages.performValidationOnProductPage();
    }
    @Then("user clicks on view products")
    public void user_clicks_on_view_products() {
         ecommercePages.viewProductButton();
    }
    @Then("user performs validation on product description page")
    public void user_performs_validation_on_product_description_page() {
        ecommercePages.performValidationOnProductPage();

    }
    @Then("user clicks on add to cart")
    public void user_clicks_on_add_to_cart() {
        ecommercePages.addToCartButton();

    }
    @Then("user validate the popup")
    public void user_validate_the_popup() {
       ecommercePages.viewTextInPopup();

    }
    @When("user clicks on view cart")
    public void user_clicks_on_view_cart() {
        ecommercePages.viewCart();

    }
    @Then("user performs the validation on the cart page")
    public void user_performs_the_validation_on_the_cart_page() {
        ecommercePages.performValidationOnCart();

    }
    @When("user clicks on checkout")
    public void user_clicks_on_checkout() {
        ecommercePages.proceedToCheckout();

    }
    @Then("user performs validation on checkout page")
    public void user_performs_validation_on_checkout_page() {
        ecommercePages.performOnCheckoutPage();

    }
    @When("user clicks on place order button")
    public void user_clicks_on_place_order_button() {
        ecommercePages.clickOnPlaceOrder();

    }
    @Then("user enter payment details")
    public void user_enter_payment_details() {
        ecommercePages.enterPaymentDetails();

    }
    @Then("user click on pay and confirm button")
    public void user_click_on_pay_and_confirm_button() {
        ecommercePages.userClicksPayAndConfirm();

    }
    @Then("user performs validation on the congrats page")
    public void user_performs_validation_on_the_congrats_page() {
        ecommercePages.validateCongratsText();

    }

}