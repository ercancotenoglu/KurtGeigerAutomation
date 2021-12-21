package com.KurtGeiger.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{


    @FindBy(id="onetrust-accept-btn-handler")
    public WebElement acceptAllCookies;


    @FindBy(css = "body.no-scroll:nth-child(2) header.TransparentHeaderCompactStyle__StyledTransparentHeader-sc-14ogz8g-0.iUjlYF:nth-child(3) div.TransparentHeaderCompactStyle__StyledMobileNav-sc-14ogz8g-6.crOaFQ div.TransparentHeaderCompactStyle__StyledMobileUtils-sc-14ogz8g-7.djunSv div.TransparentHeaderCompactStyle__StyledSecondarySection-sc-14ogz8g-4.jTxWlV:nth-child(1) div.MobileMenuCompactStyles__StyledMobileMenuContainer-sc-1awfozd-0.dgIVQK div.MobileMenuCompactStyles__StyledMobileNavigationContainer-sc-1awfozd-2.xRSbK div.MobileMenuCompactStyles__StyledLinksContainer-sc-1awfozd-4.doOrJn ul:nth-child(1) > li:nth-child(8)")
    public WebElement collections;


    @FindBy( xpath="/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/button[2]/span[1]")
    public WebElement filters;


    @FindBy( xpath="/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/button[2]/span[1]")
    public WebElement bagsCheckbox;


    @FindBy( xpath="//span[contains(text(),'Search')]")
    public WebElement searchButton;

    @FindBy( xpath="//input[@id='search']")
    public WebElement searchButtonInput;


    @FindBy( css="header.TransparentHeaderCompactStyle__StyledTransparentHeader-sc-14ogz8g-0.jjYhyh:nth-child(3) div.TransparentHeaderCompactStyle__StyledDesktopNav-sc-14ogz8g-5.erAJYp div.MainMenuStyles__StyledMainMenuContainer-sc-83zgb3-0.kdMJDA div.MainMenuStyles__StyledMainMenuLinksContainer-sc-83zgb3-1.fBKDNc ul.MainMenuStyles__StyledLinks-sc-83zgb3-2.bPelzE li.MainMenuItemStyles__StyledMainMenuItem-sc-s14kyg-0.fSSCCH:nth-child(5) > a.LinkItemStyles__StyledLink-sc-di0b72-0.cLEWHS")
    public WebElement bagsButton;

    @FindBy( xpath="(//a[@class=\"LinkItemStyles__StyledLink-sc-di0b72-0 cLEWHS\"])[57]")
    public WebElement carvelaUnderBags;

    @FindBy( xpath="(//a[@class=\"LinkItemStyles__StyledLink-sc-di0b72-0 cLEWHS\"])[70]")
    public WebElement menCategory;

    @FindBy( xpath="//div[contains(text(),'Category')]")
    public WebElement category;


    @FindBy( xpath="//body/div[@id='__next']/div[1]/main[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/p[2]")
    public WebElement shoesMenSubCategory;

    @FindBy( xpath="//p[contains(text(),'Boots')]")
    public WebElement boots;


}
