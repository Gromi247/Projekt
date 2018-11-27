package pl.b2b.tatryMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pl.b2b.tatryData.hipFlaskOrderData;
import pl.b2b.tatryData.shirtOrderData;
import pl.b2b.tatryData.toShopData;

public class tatryOrder {
    private WebDriver webDriver;
    private WebDriverWait wait;

    public tatryOrder(WebDriver webDriver) {
        this.webDriver = webDriver;
        wait = new WebDriverWait(webDriver, 10);

    }

    @FindBy(xpath = toShopData.TATRO_SHOP)
    private WebElement tatroShop;

    @FindBy(xpath = shirtOrderData.MAN)
    private WebElement man;

    @FindBy(xpath = shirtOrderData.MAN_TERMO)
    private WebElement manTermo;

    @FindBy(xpath = shirtOrderData.MAN_SHIRT)
    private WebElement manShirt;

    @FindBy(xpath = shirtOrderData.CLOSE_SHIRT)
    private WebElement closeShirt;



    @FindBy(xpath = hipFlaskOrderData.ACCESORIES)
    private WebElement accesories;

    @FindBy(xpath = hipFlaskOrderData.FLASKS)
    private WebElement flasks;

    @FindBy(xpath = hipFlaskOrderData.FLASK_PIC)
    private WebElement flaskPic;

    @FindBy(xpath = hipFlaskOrderData.FLASK_ADD)
    private WebElement flaskAdd;

    @FindBy(xpath = hipFlaskOrderData.FLASK_PAGE)
    private WebElement flaskPage;

    @FindBy(xpath = hipFlaskOrderData.FLASK_BUY)
    private WebElement flaskBuy;


    private void tatroShop(){
        wait.until(ExpectedConditions.visibilityOf(tatroShop));
        tatroShop.click();
    }

    private void man(){
        wait.until(ExpectedConditions.visibilityOf(man));
        man.click();
    }

    private void manTermo() {
        wait.until(ExpectedConditions.visibilityOf(manTermo));
        manTermo.click();
    }

    private void manShirt() {
        wait.until(ExpectedConditions.visibilityOf(manShirt));
        manShirt.click();
    }

    private void shirtAdd()  {
        wait.until(ExpectedConditions.visibilityOf(closeShirt));
        closeShirt.click();
    }



    private void accesories() {
        wait.until(ExpectedConditions.visibilityOf(accesories));
        accesories.click();

    }

    private void flasks() {
        wait.until(ExpectedConditions.visibilityOf(flasks));
        flasks.click();

    }

    private void flaskPic() {
        wait.until(ExpectedConditions.visibilityOf(flaskPic));
        flaskPic.click();

    }

//    private void flaskAdd() {
//        wait.until(ExpectedConditions.visibilityOf(flaskAdd));
//        flaskAdd.click();
//
//    }

    private void flaskPage() {
        wait.until(ExpectedConditions.visibilityOf(flaskPage));
        flaskPage.click();

    }

    private void flaskBuy()  {
        wait.until(ExpectedConditions.visibilityOf(flaskBuy));
        flaskBuy.sendKeys("11");
        flaskBuy.click();

    }










    public void tatryStart () {
        tatroShop();
        man();
        manTermo();
        manShirt();
        shirtAdd();
        accesories();
        flasks();
        flaskPic();
//        flaskAdd();
        flaskPage();
        flaskBuy();





    }











}

