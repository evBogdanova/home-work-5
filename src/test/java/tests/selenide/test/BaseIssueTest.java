package tests.selenide.test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import tests.TestData;
import tests.selenide.page.IssueTestPage;

public class BaseIssueTest {
    @BeforeAll
    static void fullScreen() {
        Configuration.startMaximized = true;
    }

    @Test
    void pageIssue() {
        TestData testData = new TestData();
        IssueTestPage.openPageGitHub(testData);
        IssueTestPage.searchRepository(testData);
        IssueTestPage.openRepository(testData);
        IssueTestPage.checkIssue(testData);

    }
}
