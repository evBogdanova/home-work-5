package tests.lambda.test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import tests.TestData;
import tests.lambda.page.IssueLambdaTestPage;

import static io.qameta.allure.Allure.step;

public class BaseLambdaTest {
    @BeforeAll
    static void fullScreen() {
        Configuration.startMaximized = true;
    }

    @Test
    void pageIssue() {
        TestData value = new TestData();
        step ("Переходим к GitHub", () -> {
            IssueLambdaTestPage.openPageGitHub(value);
        }) ;
        step ("Ищем репозиторий", () -> {
            IssueLambdaTestPage.searchRepository(value);
        }) ;
        step ("Переходим к репозиторию", () -> {
            IssueLambdaTestPage.openRepository(value);
        }) ;
        step ("Проверяем наличие Issue", () -> {
            IssueLambdaTestPage.checkIssue(value);
        }) ;

    }
}
