package co.com.choucair.certification.proyectox.stepdefinitions;

import co.com.choucair.certification.proyectox.model.ProyectoxData;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import co.com.choucair.certification.proyectox.tasks.OpenUp;
import co.com.choucair.certification.proyectox.tasks.Register;

import java.util.List;

public class ProyectoxStepDefinitions {
    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than fernando wants a Utest\\.com account$")
    public void thanFernandoWantsAUtestComAccount(){
        OnStage.theActorCalled("Fernando").wasAbleTo(OpenUp.thePage());

    }


    @When("^he fills Utest\\.com site new account data$")
    public void heFillsUtestComSiteNewAccountData(List<ProyectoxData> proyectoxData)
            throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Register.data(proyectoxData.get(0).getStrName(),
                        proyectoxData.get(0).getStrLastName(),
                        proyectoxData.get(0).getStrEmail(),
                        proyectoxData.get(0).getStrBirthMonth(),
                        proyectoxData.get(0).getStrBirthDay(),
                        proyectoxData.get(0).getStrBirthYear(),
                        proyectoxData.get(0).getStrCity(),
                        proyectoxData.get(0).getStrZip(),
                        proyectoxData.get(0).getStrCountry(),
                        proyectoxData.get(0).getStrOs(),
                        proyectoxData.get(0).getStrVersion(),
                        proyectoxData.get(0).getStrLanguage(),
                        proyectoxData.get(0).getStrMobile(),
                        proyectoxData.get(0).getStrModel(),
                        proyectoxData.get(0).getStrMOs(),
                        proyectoxData.get(0).getStrPass()
                )
        );

    }

    @Then("^he create a new account$")
    public void heCreateANewAccount() {
        // Write code here that turns the phrase above into concrete actions

    }

}
