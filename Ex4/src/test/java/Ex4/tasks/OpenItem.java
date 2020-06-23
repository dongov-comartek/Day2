package Ex4.tasks;

import Ex4.ui.TikiScreen;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;
import sun.awt.windows.WEmbeddedFrame;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenItem implements Task {

    int index=0;
    public OpenItem(int index){
        this.index=index;
    }
    @Step("Open login screen")
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> lsItems = TikiScreen.LITS_ITEMS_FIELD.resolveAllFor(actor);
        actor.attemptsTo(
                Click.on(lsItems.get(this.index))
        );
    }
    public static OpenItem click(int index){
        return instrumented(OpenItem.class,index);
    }
}
