package com.demoqa.tests.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {

    SelenideElement firstNameInput = $("#firstName");

    public void setFirstName() {
        firstNameInput.setValue("Ivan");
    }

}
