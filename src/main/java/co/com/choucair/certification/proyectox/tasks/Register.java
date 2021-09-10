package co.com.choucair.certification.proyectox.tasks;

import co.com.choucair.certification.proyectox.userinterface.RegisterAccountPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.WebElement;


public class Register implements Task {
    private static String strBirthMonth;
    private String strName;
    private String strLastName;
    private String strEmail;
    private String strBirthDay;
    private String strBirthYear;
    private String strCity;
    private String strZip;
    private String strCountry;
    private String strOs;
    private String strVersion;
    private String strLanguage;
    private String strMobile;
    private String strModel;
    private String strMOs;
    private String strPass;



    public Register(String strName, String strLastName, String strEmail , String strBirthMonth, String strBirthDay,
    String strBirthYear, String strCity, String strZip, String strCountry, String strOs, String strVersion,
                    String strLanguage, String strMobile, String strModel, String strMOs, String strPass
    ) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail ;
        this.strBirthMonth = strBirthMonth ;
        this.strBirthDay = strBirthDay ;
        this.strBirthYear = strBirthYear ;
        this.strCity = strCity;
        this.strZip = strZip;
        this.strCountry = strCountry;
        this.strOs = strOs;
        this.strVersion = strVersion;
        this.strLanguage = strLanguage;
        this.strMobile = strMobile;
        this.strModel = strModel;
        this.strMOs = strMOs;
        this.strPass = strPass;
    }

    public static Register data(String strName, String strLastName, String strEmail, String strBirthMonth, String strBirthDay,
                                String strBirthYear, String strCity, String strZip, String strCountry, String strOs, String strVersion,
                                String strLanguage, String strMobile, String strModel, String strMOs, String strPass
    ){
        return Tasks.instrumented(Register.class,strName, strLastName, strEmail, strBirthMonth, strBirthDay,
                strBirthYear, strCity, strZip, strCountry, strOs, strVersion, strLanguage, strMobile, strModel, strMOs, strPass
                );

    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(RegisterAccountPage.BUTTON_JOIN),
                Enter.theValue(strName).into(RegisterAccountPage.INPUT_NAME),
                Enter.theValue(strLastName).into(RegisterAccountPage.INPUT_LAST_NAME),
                Enter.theValue(strEmail).into(RegisterAccountPage.INPUT_EMAIL),
                Click.on(RegisterAccountPage.bring(strBirthMonth, "month")),
                Click.on(RegisterAccountPage.bring(strBirthDay, "day")),
                Click.on(RegisterAccountPage.bring(strBirthYear, "year")),
                Click.on(RegisterAccountPage.BUTTON_NEXT_LOCATIONS),
                Enter.theValue("").into(RegisterAccountPage.INPUT_CITY),
                Enter.theValue(strCity).into(RegisterAccountPage.INPUT_CITY),
                Click.on(RegisterAccountPage.CHOOSE_CITY),
                Enter.theValue("").into(RegisterAccountPage.INPUT_ZIP),
                Enter.theValue(strZip).into(RegisterAccountPage.INPUT_ZIP),
                Click.on(RegisterAccountPage.INPUT_COUNTRY),
                Click.on(RegisterAccountPage.bring(strCountry, "chooseCountry")),
                Click.on(RegisterAccountPage.BUTTON_NEXT_DEVICES),
                Click.on(RegisterAccountPage.INPUT_OS),
                Click.on(RegisterAccountPage.bring(strOs, "chooseOS")),
                Click.on(RegisterAccountPage.INPUT_VERSION),
                Click.on(RegisterAccountPage.bring(strVersion, "chooseVersion")),
                Click.on(RegisterAccountPage.INPUT_LANGUAGE),
                Click.on(RegisterAccountPage.bring(strLanguage, "chooseLang")),

                Click.on(RegisterAccountPage.INPUT_MOBILE),
                Click.on(RegisterAccountPage.bring(strMobile, "chooseMobile")),

                Click.on(RegisterAccountPage.INPUT_MOBILE_MODEL),
                Scroll.to(RegisterAccountPage.INPUT_MOBILE_MODEL),
                Click.on(RegisterAccountPage.bring(strModel, "chooseModel")),

                Click.on(RegisterAccountPage.INPUT_MOBILE_OS),
                Scroll.to(RegisterAccountPage.INPUT_MOBILE_OS),

                Click.on(RegisterAccountPage.bring(strMOs, "chooseMOs")),
                Click.on(RegisterAccountPage.BUTTON_NEXT_DEVICES),
                Enter.theValue(strPass).into(RegisterAccountPage.INPUT_PASSWORD),
                Enter.theValue(strPass).into(RegisterAccountPage.INPUT_PASSWORD_CONFIRM),

                Click.on(RegisterAccountPage.INPUT_CHECK1),
                Click.on(RegisterAccountPage.INPUT_CHECK2),
                Click.on(RegisterAccountPage.BUTTON_NEXT_LOCATIONS)








        );

    }
}
