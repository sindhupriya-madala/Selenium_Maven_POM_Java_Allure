package stepDefination;

import io.cucumber.java.en.When;

import static pages.LoginPage.*;

public class LoginPage {
    @When("User successfully enters the login details")
    public void user_successfully_enters_the_login_details() throws InterruptedException {
        sendkeys_username("abc@gmail.com");
        sendkeys_password("abcxyz");
        click_login_button();
    }
}
