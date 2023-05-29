package com.demoqa.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextboxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void successTest() {
        open("https://demoqa.com/text-box");
        $("#userName").setValue("Ivan Safronov");
        $("#userEmail").setValue("safronov@mail.ru");
        $("#currentAddress").setValue("some Adres");
        $("#permanentAddress").setValue("another adress 1");
        $("#submit").click();

        $("#output #name").shouldHave(text("Ivan Safronov"));
        $("#output #email").shouldHave(text("safronov@mail.ru"));
        $("#output #currentAddress").shouldHave(text("ome Adres"));
        $("#output #permanentAddress").shouldHave(text("another adress 1"));
    }

}
