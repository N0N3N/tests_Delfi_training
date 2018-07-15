package core.desktop;

import core.BaseCoreFunctions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;


public class HomePageDesktop {
    private BaseCoreFunctions core;
    private static final By TITLE = By.xpath("//h3/a[@class=\"top2012-title\"]");
    private static final Logger LOGGER = LogManager.getLogger(HomePageDesktop.class);
    public HomePageDesktop(BaseCoreFunctions bs){
        this.core = bs;
    }

    public String getTitleName(int titleNumber){
        LOGGER.info("Getting Title: " + core.getWebElements(TITLE, titleNumber).getText());
        return core.getWebElements(TITLE, titleNumber).getText();
    }

    public String getTitleLink(int titleNumber){
        LOGGER.info("Getting title link");
        return core.getWebElements(TITLE, titleNumber).getAttribute("href");
    }
}
