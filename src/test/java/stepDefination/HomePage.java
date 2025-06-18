package stepDefination;

import io.cucumber.java.en.Given;

import static pages.HomePage.*;

public class HomePage {
    @Given("User navigates to login page")
    public void user_navigates_to_login_page() throws InterruptedException {
        click_hamburger_menu();
        click_signIn_link();
    }

}
