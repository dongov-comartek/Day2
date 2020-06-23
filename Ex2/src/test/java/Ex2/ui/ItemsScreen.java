package Ex2.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ItemsScreen {
    public static Target PRODUCT_IMAGE_FIELD = Target.the("product image field")
            .located(By.xpath("//div[@class=\"_1anaJP\"]"));
    public static Target PRODUCT_NAME_FIELD = Target.the("product name field")
            .located(By.xpath("//div[@class=\"qaNIZv\"]"));
    public static Target PRODUCT_PRICE_FIELD = Target.the("product price field")
            .located(By.xpath("//div[@class=\"_3n5NQx\"]"));
}
