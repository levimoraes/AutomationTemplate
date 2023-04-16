package pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

import com.codeborne.selenide.*;
import org.junit.Assert;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;

public class LoginPage {

    private SelenideElement inputCompleteName = $(By.xpath("//input[@id='name']"));


    private SelenideElement btnCadastrar = $(By.xpath("//button[@id='submit']"));

    private SelenideElement perfilBtn = $(By.xpath("//h1[.='Profile']"));


    public void typeCompleteName(String completeName) {
        inputCompleteName.should(Condition.visible).sendKeys(completeName);
    }

    public void cadastrarbtn() {
        btnCadastrar.should(visible).click();
    }

    public void perfilBtn() {
        perfilBtn.shouldBe(visible);
    }
}
