package Ex2.features.search;

import Ex2.questions.TheResult;
import Ex2.tasks.Items;
import Ex2.tasks.OpenShopeeMall;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;

@RunWith(SerenityRunner.class)
public class ShoppeStory {

    Actor anna = Actor.named("Anna");

    @Managed(uniqueSession = true)
    public WebDriver herBrowser;



    @Before
    public void annaCanBrowseTheWeb() {
        anna.can(BrowseTheWeb.with(herBrowser));
        anna.attemptsTo(Open.url("https://shopee.vn/"));
    }

    @Test
    public void click_items_shopee() {
        anna.attemptsTo(
                OpenShopeeMall.open(),
                Items.at(0)
        );
        anna.should(
                seeThat(TheResult.verifyProImage(),equalTo(true)),
                seeThat(TheResult.verifyProName(),equalTo(true)),
                seeThat(TheResult.verifyProPrice(),equalTo(true))
        );
    }
}