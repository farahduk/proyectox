package co.com.choucair.certification.proyectox.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterAccountPage  {
    public static String strPayLoad;
    public static String strDuty;

    public RegisterAccountPage(String strPayLoad, String strDuty) {
        this.strPayLoad = strPayLoad;
        this.strDuty = strDuty;
    }
    public static Target bring(String strPayLoad, String strDuty){
        if(strDuty == "month"){
            final Target SELECT_BIRTH_MONTH = Target.the("Where do select the Birth Month").located(By.xpath("//div[@id='birthDate']//option[@label='"+strPayLoad+"']"));
            return SELECT_BIRTH_MONTH;
        }
        else if(strDuty == "day"){
            final Target SELECT_BIRTH_DAY = Target.the("Where do select the Birth Day").located(By.xpath("//div[@id='birthDate']//option[@label='"+strPayLoad+"']"));
            return SELECT_BIRTH_DAY;
        }
        else if(strDuty == "year"){
            final Target SELECT_BIRTH_YEAR = Target.the("Where do select the Birth Year").located(By.xpath("//div[@id='birthDate']//option[@label='"+strPayLoad+"']"));
            return SELECT_BIRTH_YEAR;
        }
        else if (strDuty=="chooseCountry"){
            final Target CHOOSE_COUNTRY = Target.the("Where do we choose the country").located(By.xpath("//div[contains(text(),'"+strPayLoad+"')]"));
            return CHOOSE_COUNTRY;

        }
        else if(strDuty=="chooseOS"){
            final Target CHOOSE_OS = Target.the("Click and choose your computer").located(By.xpath("//div[contains(text(),'"+strPayLoad+"')]"));
            return CHOOSE_OS;
        }
        else if(strDuty=="chooseVersion"){
            final Target CHOOSE_VERSION = Target.the("Click and choose your OS Version").located(By.xpath("//div[contains(text(),'"+strPayLoad+"')]"));
            return CHOOSE_VERSION;
        }
        else if(strDuty=="chooseLang"){
            final Target CHOOSE_LANGUAGE = Target.the("Click and choose your OS language").located(By.xpath("//div[contains(text(),'"+strPayLoad+"')]"));
            return CHOOSE_LANGUAGE;
        }
        else if(strDuty=="chooseMobile"){
            final Target CHOOSE_MOBILE = Target.the("Click and choose your  Mobile device").located(By.xpath("//div[contains(text(),'"+strPayLoad+"')]"));
            return CHOOSE_MOBILE;
        }
        else if(strDuty=="chooseModel"){
            final Target CHOOSE_MODEL = Target.the("Click and choose your Mobile model").located(By.xpath("//div[contains(text(),'"+strPayLoad+"')]"));
            //final Target CHOOSE_MODEL = Target.the("Click and choose your Mobile model").located(By.xpath("/ul/li/div[130]/span/div"));
            return CHOOSE_MODEL;
        }
        else if(strDuty=="chooseMOs"){
            final Target CHOOSE_MOBILE_OS  = Target.the("Click and choose your Mobile OS ").located(By.xpath("//span/div[contains(text(),'"+strPayLoad+"')]"));
            return CHOOSE_MOBILE_OS;
        }

        return null;

    }

    public static final Target BUTTON_JOIN = Target.the("Click on the Join today button").located(By.xpath("//div[@class='unauthenticated-nav-bar__links navbar-right hidden-sm hidden-xs']//a[contains(text(),'Join Today')]"));
    public static final Target INPUT_NAME = Target.the("Where do we write the Name").located(By.xpath("//*[@id='firstName']"));
    public static final Target INPUT_LAST_NAME = Target.the("Where do we write the LastName").located(By.xpath("//*[@id='lastName']"));
    public static final Target INPUT_EMAIL = Target.the("Where do we write the Email").located(By.id("email"));
    public static final Target BUTTON_NEXT_LOCATIONS = Target.the("Click on the Next location Button").located(By.xpath("//*[@class='btn btn-blue']"));
    public static final Target INPUT_CITY = Target.the("Where do we write the cITY").located(By.id("city"));
    public static final Target CHOOSE_CITY = Target.the("Where do we Choose the city").located(By.xpath("//*[@class='pac-container pac-logo']"));
    public static final Target INPUT_ZIP = Target.the("Where do we write the Zip").located(By.id("zip"));
    public static final Target INPUT_COUNTRY = Target.the("Where do we write the country").located(By.name("countryId"));
    public static final Target BUTTON_NEXT_DEVICES = Target.the("Click on the Next Devices Button").located(By.xpath("//*[@class='btn btn-blue pull-right']"));
    public static final Target INPUT_OS = Target.the("Click on your computer").located(By.xpath("//*[@aria-label='Select OS']"));
    public static final Target INPUT_VERSION = Target.the("Click on version").located(By.xpath("//*[@aria-label='Select a Version']"));
    public static final Target INPUT_LANGUAGE = Target.the("Click on language").located(By.xpath("//*[@aria-label='Select OS language']"));
    public static final Target INPUT_MOBILE = Target.the("Click on Mobile Device").located(By.xpath("//*[@aria-label='Select Brand']"));

    //public static final Target INPUT_MOBILE_MODEL = Target.the("Click on Mobile Device model").located(By.xpath("//*[@aria-label='Select a Model']"));
    public static final Target INPUT_MOBILE_MODEL = Target.the("Click on Mobile Device model").located(By.xpath("//*[@aria-label='Select a Model']"));
    public static final Target INPUT_MOBILE_OS = Target.the("Click on Mobile OS").located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/div[1]/span"));
    public static final Target INPUT_PASSWORD = Target.the("Where do we write the password").located(By.name("password"));
    public static final Target INPUT_PASSWORD_CONFIRM = Target.the("Where do we write the password").located(By.name("confirmPassword"));
    public static final Target INPUT_CHECK1 = Target.the("Where do we Check the utest Term").located(By.name("termOfUse"));
    public static final Target INPUT_CHECK2 = Target.the("Where do we Check the Privacy").located(By.name("privacySetting"));








}
