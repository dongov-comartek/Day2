package Ex2.tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import Ex2.ui.ShoppeScreen;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

public class Items implements Task {
    int index = 0;

    public Items(int index) {
        this.index = index;
    }
    @Override

    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> lsItems= ShoppeScreen.ITEMS_FIELD.resolveAllFor(actor);
        actor.attemptsTo(
                WaitUntil.the(ShoppeScreen.ITEMS_FIELD, isVisible()).forNoMoreThan(60).seconds(),
                Click.on(lsItems.get(this.index))

        );
    }

    public static Items at(int index) {
        return instrumented(Items.class, index);
    }
}
