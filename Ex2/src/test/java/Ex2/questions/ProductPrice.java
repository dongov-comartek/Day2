package Ex2.questions;

import Ex2.ui.ItemsScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ProductPrice implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return ItemsScreen.PRODUCT_PRICE_FIELD.resolveFor(actor).isVisible();
    }
}
