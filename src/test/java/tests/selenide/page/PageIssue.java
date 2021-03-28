package tests.selenide.page;

import org.openqa.selenium.By;
import tests.TestData;
import tests.selenide.test.TestBaseIssue;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PageIssue extends TestBaseIssue {

    public static void openPageGitHub(TestData value) {
        open(value.getUrl());
    }

    public static void searchRepository (TestData value) {
        $("[data-scoped-placeholder = Search]").setValue(value.getRepository()).pressEnter();
    }

    public static void openRepository (TestData value) {
        $(By.linkText(value.getRepository())).click();
    }

    public static void checkIssue (TestData value) {
        $("[data-tab-item = i1issues-tab]").shouldHave(text(value.getCheckValue()));

    }
}
