package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class StudentRegistrationForm {

    @BeforeAll
    static void conf () {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
//        Configuration.holdBrowserOpen = true;
    }

    @Test
    void registrationForm () {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
//        executeJavaScript($("footer").remove());
        $("#firstName").setValue("Ivan");
        $("#lastName").setValue("Safronov");
        $("#userEmail").setValue("test@mail.ru");
        $("#gender-radio-1").parent().click();
        $("#userNumber").setValue("79998118356");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("August");
        $(".react-datepicker__year-select").selectOption("1996");
        $(".react-datepicker__day--030:not(react-datepicker__day--outside-month)").click();
        $("#subjectsWrapper").setValue("Sport").pressEnter();
        $("#hobbies-checkbox-1").parent().click();
//        $("#uploadPicture").uploadFile(new File("src/test/resources/img/1.png"));
        $("#uploadPicture").uploadFromClasspath("img/1.png");
        $("#currentAddress").setValue("other address");
        $("#state").click();
//        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#react-select-3-option-0").click();
        $("#city").$(byText("Delhi")).click();
        $("#submit").click();
    }

}
