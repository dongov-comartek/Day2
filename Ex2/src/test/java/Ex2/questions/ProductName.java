package Ex2.questions;

import Ex2.ui.ItemsScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ProductName implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return ItemsScreen.PRODUCT_NAME_FIELD.resolveFor(actor).isVisible();
    }
}
