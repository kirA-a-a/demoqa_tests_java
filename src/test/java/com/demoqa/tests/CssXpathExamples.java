package com.demoqa.tests;

import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CssXpathExamples {

    void CssXpathExamples() {
        $("[data-testid=email]").setValue("1");
        $(by("data-testid", "email")).setValue("1");
        $x("//*[@data-testid=email]").setValue("1");
        $(byXpath("//*[@data-testid=email]")).setValue("1");
    }

}
