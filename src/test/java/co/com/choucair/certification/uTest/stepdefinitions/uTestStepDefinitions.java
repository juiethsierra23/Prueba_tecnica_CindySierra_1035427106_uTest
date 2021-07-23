package co.com.choucair.certification.uTest.stepdefinitions;

import co.com.choucair.certification.uTest.model.RegisterData;
import co.com.choucair.certification.uTest.tasks.OpenUp;
import co.com.choucair.certification.uTest.tasks.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class uTestStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());

    }
    @Given("^Cindy wants to register on the uTest page$")
    public void cindyWantsToRegisterOnTheUTestPage(List<RegisterData> registerData) throws Exception {
        OnStage.theActorCalled("Cindy").wasAbleTo(OpenUp.thePage(),(Register.OnThePage(
                registerData.get(0).getFirstName(),
                registerData.get(0).getLastName(),
                registerData.get(0).getEmail(),
                registerData.get(0).getMonthBirthDay(),
                registerData.get(0).getDayBirthDay(),
                registerData.get(0).getYearBirthDay(),
                registerData.get(0).getLanguage(),
                registerData.get(0).getCity(),
                registerData.get(0).getZipCode(),
                registerData.get(0).getPassword(),
                registerData.get(0).getPasswordConfirmation()
        )));
        //OnStage.theActorCalled("Cindy").wasAbleTo(OpenUp.thePage(),(Login.onThePage(loginData.get(0).getStrUser(), loginData.get(0).getStrPassword())));
    }


    @When("^She looks for the Join Today button at the top right of the uTest page$")
    public void sheLooksForTheJoinTodayButtonAtTheTopRightOfTheUTestPage() {

    }

    @Then("^she finds you today and registers the button$")
    public void sheFindsYouTodayAndRegistersTheButton() {
    }
}
