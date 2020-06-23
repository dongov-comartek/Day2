package Ex4.features.search;

import Ex4.questions.TheResulted;
import Ex4.tasks.OpenItem;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import Ex4.tasks.OpenMenu;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static org.hamcrest.Matchers.*;

@RunWith(SerenityRunner.class)
public class SearchByKeywordStory {

    Actor anna = Actor.named("Anna");

    @Managed(driver = "appium")
    public WebDriver herBrowser;

    @Before
    public void annaCanBrowseTheWeb() {
        anna.can(BrowseTheWeb.with(herBrowser));
    }

    @Test
    public void view_menu_after_click_firsh_product() {
        anna.attemptsTo(
                OpenMenu.open(),
                OpenItem.click(0)
        );
        anna.should(
              //  seeThat(TheResulted.verifyChooseBuy(),equalTo(true)),
                seeThat(TheResulted.verifyNameProduct(),equalTo(true)),
                seeThat(TheResulted.verifyPrice(),equalTo(true)),
                seeThat(TheResulted.verifyProductInamge(),equalTo(true))
        );
    }
}