package pl.b2b;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pl.b2b.cfg.cfg;
import pl.b2b.tatryData.toShopData;
import pl.b2b.tatryMethod.tatryOrder;

public class tatryTest {

    static WebDriver driver;
    private tatryOrder tatryOrder;
	private doUsuniecia doUsunieciaZmienna;

    @Before
    public void init(){
        driver = cfg.getDriver(cfg.CHROME);
        tatryOrder = PageFactory.initElements(driver, tatryOrder.class);
    }


    @Test
    public void startPage () {
        PageFactory.initElements(driver, this);
        driver.get(toShopData.TATROMANIAK);
        tatryOrder.tatryStart();


    }
	



}
