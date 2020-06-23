package Ex2.tasks;

import Ex2.ui.ShoppeScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenShopeeMall implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ShoppeScreen.CLOSE_ADR_FIELD),
                Click.on(ShoppeScreen.SHOPEE_MALL_FIELD),
                Click.on(ShoppeScreen.CLOSE_ADR_FIELD),
                Click.on(ShoppeScreen.NHA_CUA_DOI_SONG_FIELD)
        );
    }
    public static OpenShopeeMall open(){
        return instrumented(OpenShopeeMall.class);
    }
}
