package tests.lambda.test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import tests.TestData;
import tests.lambda.page.PageIssueLambda;

import static io.qameta.allure.Allure.step;

public class TestBaseLambda {
    @BeforeAll
    static void fullScreen() {
        Configuration.startMaximized = true;
    }

    @Test
    void pageIssue() {
        TestData value = new TestData();
        step ("Переходим к GitHub", () -> {
            PageIssueLambda.openPageGitHub(value);
        }) ;
        step ("Ищем репозиторий", () -> {
            PageIssueLambda.searchRepository(value);
        }) ;
        step ("Переходим к репозиторию", () -> {
            PageIssueLambda.openRepository(value);
        }) ;
        step ("Проверяем наличие Issue", () -> {
            PageIssueLambda.checkIssue(value);
        }) ;

    }
}
