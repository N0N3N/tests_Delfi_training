package tests;

import core.BaseCoreFunctions;
import core.desktop.ArticlePageDesktop;
import core.desktop.HomePageDesktop;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class DesktopArticleTest {

    private BaseCoreFunctions core = new BaseCoreFunctions();
    private HomePageDesktop homeD = new HomePageDesktop(core);
    private ArticlePageDesktop artD = new ArticlePageDesktop(core);
    private static final Logger LOGGER = LogManager.getLogger(DesktopArticleTest.class);

    private static final String HOME_PAGE = "rus.delfi.lv";
    private int articleNumber = 0;

    @Test
    public void testFirstArticlePageTitle() {
        LOGGER.info("Go to Home Page");
        core.openWebPage(HOME_PAGE);

        LOGGER.info("Get 1st Article Title");
        String homePageTitle = homeD.getTitleName(articleNumber);

        LOGGER.info("Go to Article Page");
        core.openWebPage(homeD.getTitleLink(articleNumber));

        LOGGER.info("Get Article name");
        String articlePageTitle = artD.getTitleName();

        LOGGER.info("Asserting names");
        Assert.assertEquals(articlePageTitle, homePageTitle);

        LOGGER.info("Test Successful");
    }
    @AfterTest
    public void afterTest(){
        core.closeDriver();
        LOGGER.info("Page closed");
    }
}
