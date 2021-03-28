package tests.lambda.page;

import org.openqa.selenium.By;
import tests.TestData;
import tests.lambda.test.TestBaseLambda;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PageIssueLambda extends TestBaseLambda {

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
