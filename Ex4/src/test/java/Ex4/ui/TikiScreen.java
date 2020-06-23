package Ex4.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TikiScreen {
    public static Target MENU_BUTTON = Target.the("danh muc button")
            .located(By.xpath("(//*[@text=\"Danh mục\"])[1]"));
    public static Target LAPTOP_PC_BUTTON = Target.the("laptop pc button")
            .located(By.xpath("(//*[@text=\"Laptop - Máy Vi Tính - Linh kiện\"])[1]"));
    public static Target LAPTOP_BUTTON = Target.the("Lightning Deals button")
            .located(By.xpath("(//*[@text='Laptop'])"));
    public static Target LITS_ITEMS_FIELD = Target.the("list items field")
            .located(By.id("vn.tiki.app.tikiandroid:id/vContainer"));
    public static Target IMAGE_PRODUCT_FIELD = Target.the("product image field")
            .located(By.id("vn.tiki.app.tikiandroid.productDetail2:id/ivPhoto"));
    public static Target NAME_PRODUCT_FIELD = Target.the("product name field")
            .located(By.xpath("//*[contains(@text,'Laptop HP')]"));
    public static Target PRICE_FIELD = Target.the("price field")
            .located(By.id("vn.tiki.app.tikiandroid.productDetail2:id/tvPrice"));
    public static Target CHOOSE_BUY_BUTTON = Target.the("choose to buy button")
            .located(By.id("vn.tiki.app.tikiandroid:id/button"));
}
