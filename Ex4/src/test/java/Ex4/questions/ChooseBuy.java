package Ex4.questions;

import Ex4.ui.TikiScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ChooseBuy implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return TikiScreen.CHOOSE_BUY_BUTTON.resolveFor(actor).isVisible();
    }
}
