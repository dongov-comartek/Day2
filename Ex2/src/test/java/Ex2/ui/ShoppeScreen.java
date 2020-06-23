package Ex2.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShoppeScreen {
    public static Target CLOSE_ADR_FIELD = Target.the("close field")
            .located(By.xpath("//div[@class='shopee-popup__close-btn']"));
    public static Target SHOPEE_MALL_FIELD = Target.the("shopee mall field")
            .located(By.xpath("(//*[text()=\"Shopee Mall\"])[1]"));
    public static Target NHA_CUA_DOI_SONG_FIELD = Target.the("nha cua & doi song field")
            .located(By.xpath("(//*[text()=\"Nhà Cửa & Đời Sống\"])"));
    public static Target ITEMS_FIELD = Target.the("items field")
            .located(By.xpath("//div[@class='_1gkBDw']"));


}
