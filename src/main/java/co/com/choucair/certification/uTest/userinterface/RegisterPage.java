package co.com.choucair.certification.uTest.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage  {
    public static final Target REGISTER_BUTTON = Target
            .the("button that shows us the form to register")
            .located(By.xpath("//a[contains(@class,'unauthenticated-nav-bar__sign-up')]"));
    public static final Target INPUT_FIST_NAME = Target.the("where do we write the first Name")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("where do we write the last Name")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where do we write the email")
            .located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("where do we select the month")
            .located(By.id("birthMonth"));
    public static final Target SELECT_DAY = Target.the("where do we select the day")
            .located(By.id("birthDay"));
    public static final Target SELECT_YEAR = Target.the("where do we select the year")
            .located(By.id("birthYear"));
    public static final Target INPUT_lANGUAGE = Target
            .the("where do we write the language with autocomplete")
            .located(By.xpath("//input[contains(@class,'ui-select-search')]"));
    public static final Target BUTTON_lANGUAGE = Target
            .the("button that select")
            .located(By.xpath("//span[contains(@class,'ui-select-highlight')]"));
    // Step 2

    public static final Target INPUT_CITY = Target.the("where do we write the city")
            .located(By.id("city"));
    public static final Target SELECT_CITY = Target
            .the("button that select")
            .located(By.xpath("//div[@class='pac-item'] //span[contains(text(),'Medellin, Antioquia, Colombia')] "));
    public static final Target INPUT_ZIP = Target.the("where we write the zip code of the area")
            .located(By.id("zip"));
    public static final Target BUTTON_NEXT = Target
            .the("they take us to the next page")
            .located(By.xpath("//a[contains(@class,'btn btn-blue')]"));

    //Step
    public static final Target INPUT_PASSWORD = Target.the("where do we write the password")
            .located(By.id("password"));
    public static final Target INPUT_CONF_PASSWORD = Target.the("where do we write the confirm password")
            .located(By.id("confirmPassword"));
    public static final Target BUTTON_ACCEPT_TERMS = Target
            .the("they take us to the next page")
            .located(By.id("termOfUse"));
    public static final Target BUTTON_ACCEPT_CONDITIONS = Target
            .the("registration ends")
            .located(By.id("privacySetting"));
}
