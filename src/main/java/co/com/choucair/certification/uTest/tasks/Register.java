package co.com.choucair.certification.uTest.tasks;

import co.com.choucair.certification.uTest.userinterface.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import net.serenitybdd.screenplay.actions.SelectFromOptions;


public class Register implements Task {

    private String firstName;
    private String lastName;
    private String email;
    private String monthBirthDay;
    private String dayBirthDay;
    private String yearBirthDay;
    private String language;
    private String city;
    private String zipCode;
    private String password;
    private String passwordConfirmation;

    public Register(
            String firstName,
             String lastName,
             String email,
             String monthBirthDay,
             String dayBirthDay,
             String yearBirthDay,
             String language,
             String city,
             String zipCode,
             String password,
             String passwordConfirmation
    ){
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.monthBirthDay=monthBirthDay;
        this.dayBirthDay=dayBirthDay;
        this.yearBirthDay=yearBirthDay;
        this.language=language;
        this.city=city;
        this.zipCode=zipCode;
        this.password=password;
        this.passwordConfirmation=passwordConfirmation;
    }
    public static Register OnThePage( String firstName,
                                      String lastName,
                                      String email,
                                      String monthBirthDay,
                                      String dayBirthDay,
                                      String yearBirthDay,
                                      String language,
                                      String city,
                                      String zipCode,
                                      String password,
                                      String passwordConfirmation){
        return Tasks.instrumented(Register.class,firstName,lastName,email,monthBirthDay,dayBirthDay,yearBirthDay,language,city,zipCode,password,passwordConfirmation);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RegisterPage.REGISTER_BUTTON),
                Enter.theValue(firstName).into(RegisterPage.INPUT_FIST_NAME),
                Enter.theValue(lastName).into(RegisterPage.INPUT_LAST_NAME),
                Enter.theValue(email).into(RegisterPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(monthBirthDay).from(RegisterPage.SELECT_MONTH),
                SelectFromOptions.byVisibleText(dayBirthDay).from(RegisterPage.SELECT_DAY),
                SelectFromOptions.byVisibleText(yearBirthDay).from(RegisterPage.SELECT_YEAR),
                Enter.theValue(language).into(RegisterPage.INPUT_lANGUAGE),
                Click.on(RegisterPage.BUTTON_lANGUAGE),
                Click.on(RegisterPage.BUTTON_NEXT),
                // Step 2
                Enter.theValue(city).into(RegisterPage.INPUT_CITY),
                Click.on(RegisterPage.SELECT_CITY),
                Enter.theValue(zipCode).into(RegisterPage.INPUT_ZIP),
                Click.on(RegisterPage.BUTTON_NEXT),
                // Step 3
                Click.on(RegisterPage.BUTTON_NEXT),
                // Step 4
                Enter.theValue((password)).into(RegisterPage.INPUT_PASSWORD),
                Enter.theValue((passwordConfirmation)).into(RegisterPage.INPUT_CONF_PASSWORD),
                Click.on(RegisterPage.BUTTON_ACCEPT_TERMS),
                Click.on(RegisterPage.BUTTON_ACCEPT_CONDITIONS),
                Click.on(RegisterPage.BUTTON_NEXT)
        );
    }
}
