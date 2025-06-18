package pages;

import org.openqa.selenium.By;
import utility.DriverManager;

public class LoginPage extends DriverManager {
    public static String username_text_id = "usr";
    public static String password_text_id = "pwd";
    public static String login_button_xpath = "//*[@id=\"second_form\"]/input";

    public static String newUserRegister_id = "NewRegistration";
    public static void sendkeys_username(String userName) throws InterruptedException {
        driver.findElement(By.id(username_text_id)).sendKeys(userName);
    }

    public static void sendkeys_password(String password) throws InterruptedException {
        driver.findElement(By.id(password_text_id)).sendKeys(password);
    }

    public static void click_login_button() {
        driver.findElement(By.xpath(login_button_xpath)).click();
    }

    public static void click_newRegister_button() {
        driver.findElement(By.id(newUserRegister_id)).click();
    }
}
