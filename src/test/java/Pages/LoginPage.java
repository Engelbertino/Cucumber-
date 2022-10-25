package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    By txt_username = By.id("name");
    By txt_password = By.id("password");
    By btn_login = By.id("login");
    By btn_logout = By.id("logout");

    // contructer
    public LoginPage(WebDriver driver){
        this.driver = driver;

        String fount_Title = driver.getTitle();
        if(!fount_Title.equals("TestProject Demo")){
            throw new IllegalStateException("This is not Login Page. The Current page is " +driver.getCurrentUrl());
        }
    }

    public void enterUsername(String username){
        driver.findElement(txt_username).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(txt_password).sendKeys(password);
    }
    public void clickLogin(){
        driver.findElement(btn_login).click();
    }
    public void checkLogOutlsDisplayed(){

        driver.findElement(btn_logout).isDisplayed();
    }

    public void loginValidUser(String username, String password){
        driver.findElement(txt_username).sendKeys(username);
        driver.findElement(txt_password).sendKeys(password);
    }


}
