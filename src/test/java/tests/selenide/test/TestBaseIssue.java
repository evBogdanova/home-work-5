package tests.selenide.test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import tests.TestData;
import tests.selenide.page.PageIssue;

public class TestBaseIssue {
    @BeforeAll
    static void fullScreen() {
        Configuration.startMaximized = true;
    }

    @Test
    void pageIssue() {
        TestData testData = new TestData();
        PageIssue.openPageGitHub(testData);
        PageIssue.searchRepository(testData);
        PageIssue.openRepository(testData);
        PageIssue.checkIssue(testData);

    }
}
