package com.github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class searchGithubWikiSoftAssertions {

    @Test
    void shouldBeJunit () {
        Configuration.browserSize = "1920x1080";
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("[data-filterable-for=wiki-pages-filter]")
                .$(By.cssSelector("button[type='button']")).click();
        $("a[href='/selenide/selenide/wiki/SoftAssertions']").click();

        sleep(5000);
    }

}
