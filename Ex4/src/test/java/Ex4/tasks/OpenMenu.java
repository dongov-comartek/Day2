package Ex4.tasks;

import Ex4.ui.TikiScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class OpenMenu implements Task {

    @Step("Open login screen")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TikiScreen.MENU_BUTTON, isVisible()).forNoMoreThan(60).seconds(),
                Click.on(TikiScreen.MENU_BUTTON),
                Click.on(TikiScreen.LAPTOP_PC_BUTTON),
                Click.on(TikiScreen.LAPTOP_BUTTON)

        );
    }
    public static OpenMenu open(){
        return instrumented(OpenMenu.class);
    }
}
