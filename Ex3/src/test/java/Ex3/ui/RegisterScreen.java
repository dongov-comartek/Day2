package Ex3.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterScreen {
    public static Target FNAME_FIELD = Target.the("first name field")
            .located(By.xpath("//*[@text=\"First Name\"]"));
    public static Target LNAME_FIELD = Target.the("last name field")
            .located(By.xpath("//*[@text=\"Last Name\"]"));
    public static Target AGE_FIELD = Target.the("age field")
            .located(By.xpath("(//*[@content-desc=\"Age\"])[2]"));
    public static Target USER_NAME_FIELD = Target.the("user name field")
            .located(By.xpath("//*[@text=\"User Name\"]"));
    public static Target PASSWORD_FIELD = Target.the("password field")
            .located(By.xpath("//*[@text=\"Password\"]"));
    public static Target REGISTER_BUTTON = Target.the("register button")
            .located(By.xpath("//*[@content-desc=\"Register\"]"));
    public static Target WELCOME_FIELD = Target.the("welcome field")
            .located(By.xpath("//*[ends-with(@content-desc,'Dong')]"));
}
