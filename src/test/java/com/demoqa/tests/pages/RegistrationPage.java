package com.demoqa.tests.pages;

import com.codeborne.selenide.SelenideElement;
import com.demoqa.tests.pages.components.CalendarComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationPage {

    CalendarComponent calendarComponent = new CalendarComponent();

    SelenideElement firstNameInput = $("#firstName"),
                     lastNameInput = $("#lastName"),
                     userEmailInput = $("#userEmail"),
                    genderWrapper = $("#genterWrapper"),
                    birdthDayInpute = $("#dateOfBirthInput");

    public RegistrationPage openPage() {
        open("/automation-practice-form");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));

        return this;
    }
    public RegistrationPage setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public RegistrationPage setLastName(String value) {
        lastNameInput.setValue(value);

        return this;
    }

    public RegistrationPage setUserEmail(String value) {
        userEmailInput.setValue(value);

        return this;
    }
    public RegistrationPage setBirthDay(String day, String month, String year) {
        birdthDayInpute.click();
        calendarComponent.setDate(day, month, year);
        return this;
    }

}
