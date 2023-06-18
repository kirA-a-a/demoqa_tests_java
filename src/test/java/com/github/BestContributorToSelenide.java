package com.github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class BestContributorToSelenide {

    @Test
    void andreiSolntsevShouldBeFirsContributor () {
        open("https://github.com/selenide/selenide");
        $("div.Layout-sidebar").$(byText("Contributors"))
                .closest("h2").sibling(0).$$("li").first().hover();
        $(".Popover-message").shouldHave(text("Andrey Solntsev"));
        sleep(5000);
    }

}
