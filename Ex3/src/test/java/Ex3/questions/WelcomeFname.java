package Ex3.questions;

import Ex3.ui.RegisterScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class WelcomeFname implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return RegisterScreen.WELCOME_FIELD.resolveFor(actor).isVisible();
    }
    public static Question<Boolean> VerifyFname(){
        return new WelcomeFname();
    }
}
