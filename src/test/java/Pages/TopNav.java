package Pages;

import Utility.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TopNav extends ParentPage {

    public TopNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id='index-button']")
    public WebElement mainButton;

    @FindBy(xpath = "//*[@id='obot-button']")
    public WebElement priceButton;

    @FindBy(xpath = "//*[@id='timer-button']")
    public WebElement timerButton;

    @FindBy(xpath = "//*[@id='oxyz-logo']")
    public WebElement logo;

    @FindBy(xpath = "//*[@id='price']")
    public WebElement price;

    @FindBy(xpath = "//*[@id='change']")
    public WebElement changeRatio;

    @FindBy(xpath = "//*[@id='powered']")
    public WebElement powered;

    @FindBy(xpath = "/html/body/div[3]/a[1]")
    public WebElement discord;

    @FindBy(xpath = "/html/body/div[3]/a[2]")
    public WebElement telegram;

    @FindBy(xpath = "/html/body/div[3]/a[3]")
    public WebElement x;

    @FindBy(xpath = "//*[@id='mascot']/img")
    public WebElement mascot;


    public WebElement getWebElement(String strElementName) {

        switch (strElementName.trim()) {
            case "Main Button":
                return this.mainButton;
            case "Price Button":
                return this.priceButton;
            case "Timer Button":
                return this.timerButton;
            case "Logo":
                return this.logo;
            case "Price":
                return this.price;
            case "Change Ratio":
                return this.changeRatio;
            case "Powered":
                return this.powered;
            case "Discord":
                return this.discord;
            case "Telegram":
                return this.telegram;
            case "X":
                return this.x;
            case "Mascot":
                return this.mascot;

        }

        return null;
    }
}







