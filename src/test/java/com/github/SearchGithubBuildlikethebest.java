package com.github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SearchGithubBuildlikethebest {

    @BeforeAll
    static void conf() {
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void shouldBeBuildLikeTheBest () {
        open("https://github.com/");
        $(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        $("[class=font-mktg]").shouldHave(text("Build like the best"));
    }
}
