package core.desktop;

import core.BaseCoreFunctions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;


public class ArticlePageDesktop {
    private BaseCoreFunctions core;
    private static final By TITLE = By.xpath(" //h1[@itemprop=\"name\"]");
    private static final Logger LOGGER = LogManager.getLogger(ArticlePageDesktop.class);
    public ArticlePageDesktop(BaseCoreFunctions bs){
        this.core = bs;
    }

    public String getTitleName(){
        LOGGER.info("Getting Title: " + core.getWebElement(TITLE).getText());
        return core.getWebElement(TITLE).getText();
    }

}
