package Ex4.questions;

import Ex4.ui.TikiScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Price implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
       // return Text.of(TikiScreen.PRICE_FIELD).viewedBy(actor).asString();
        return TikiScreen.PRICE_FIELD.resolveFor(actor).isVisible();
    }
}
