package steps;

import static org.junit.Assert.assertEquals;
import java.io.IOException;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.LoginPage;
import utils.Utils;

public class LoginStep {

    LoginPage login = new LoginPage();


    @And("wait {int}sec")
    public void waitSec(int arg0) {
        Selenide.sleep(120);
    }

    @And("click on Cadastrar")
    public void clickOnCadastrar() {
        login.cadastrarbtn();
    }

    @And("type on Name field")
    public void completePetNameField() {

        String completeName = Utils.generateRadomName();
        login.typeCompleteName(completeName);
    }

    @Given("are on the application's page")
    public void areOnTheApplicationSLoginPage() {
        login.perfilBtn();
    }
}
