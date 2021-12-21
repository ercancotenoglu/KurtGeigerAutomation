package com.KurtGeiger.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenPage extends BasePage{



    @FindBy( xpath="/html[1]/body[1]/div[1]/div[1]/main[1]/div[2]/div[4]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/a[1]/p[1]")
    public WebElement aProduct;


    @FindBy( xpath="//body/div[@id='__next']/div[1]/main[1]/div[2]/div[3]/div[2]/div[2]/div[1]/div[2]/ul[1]/li[2]/button[1]")
    public WebElement sizeGuide;


    @FindBy( xpath="(//img[@src=\"//kg-static-cache.s3.amazonaws.com/catalog/product/cache/thumbnail/728x728/8/8/8827969979.jpg\"])[2]")
    public WebElement colourMulti;

    @FindBy( xpath="//body/div[@id='__next']/div[1]/main[1]/div[2]/div[3]/div[2]/div[2]/div[2]/button[1]")
    public WebElement addToBag;

    @FindBy( xpath="//span[@class=\"MinibagIconStyles__StyledMinibagCount-sc-17jjqxa-1 pKsre\"]")
    public WebElement bagLogo;

    @FindBy( xpath="//button[contains(text(),'View my bag')]")
    public WebElement viewMyBag;


    @FindBy( xpath="//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[1]/div[3]/ul[1]/li[1]/button[1]")
    public WebElement checkoutButton;



    @FindBy( css="body.customer-account-login.page-layout-1column:nth-child(2) div.page-wrapper:nth-child(7) div.react-header:nth-child(2) div.react header.sc-gInthZ.bcGslU div.sc-ikPAEB.dZMCiF div.sc-tYqdw.fSbdkq div.sc-dkIXZx.dZazRt:nth-child(3) div.sc-dQoVA.cdzppj div.sc-iqHYmW.dMpQYZ a.sc-kEjbQP.hzlJxs:nth-child(2) div.sc-jrAFXE.dZmEH > svg:nth-child(1)")
    public WebElement membershipButton;




}
