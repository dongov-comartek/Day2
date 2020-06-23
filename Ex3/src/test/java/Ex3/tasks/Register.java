package Ex3.tasks;

import Ex3.actions.Press;
import io.appium.java_client.android.nativekey.AndroidKey;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

import Ex3.ui.RegisterScreen;

public class Register implements Task {

    String fname;
    String lname;
    String age;
    String username;
    String password;


    @Override
    public <T extends Actor> void performAs(T actor) {
        char[] arrayPassword = age.toCharArray();
        actor.attemptsTo(
                Enter.theValue(this.fname).into(RegisterScreen.FNAME_FIELD),
                Enter.theValue(this.lname).into(RegisterScreen.LNAME_FIELD),
                Click.on(RegisterScreen.AGE_FIELD),
                Press.key(AndroidKey.ENTER),
                Press.key(Integer.parseInt(String.valueOf(arrayPassword[0])) + 7),
                Press.key(Integer.parseInt(String.valueOf(arrayPassword[1])) + 7),
              //  Press.key(Integer.parseInt(String.valueOf(arrayPassword[2])) + 7),
                Enter.theValue(this.username).into(RegisterScreen.USER_NAME_FIELD),
                Enter.theValue(this.password).into(RegisterScreen.PASSWORD_FIELD),
                Click.on(RegisterScreen.REGISTER_BUTTON)
        );

    }
    public Register(String fname,String lname,String age,String username,String password){
        this.age=age;
        this.fname=fname;
        this.lname=lname;
        this.username=username;
        this.password=password;
    }
    public static RegisterBuilder withUsername(String username){
        return new RegisterBuilder(username);
    }
    public static class RegisterBuilder{
        String fname;
        String lname;
        String age;
        String username;
        String password;
        public RegisterBuilder(String username){
            this.username=username;
        }
        public RegisterBuilder andFname(String fname){
            this.fname=fname;
            return this;
        }
        public RegisterBuilder andLname(String lname){
            this.lname=lname;
            return this;
        }
        public RegisterBuilder andAge(String age){

            this.age=age;
            return this;
        }
        public RegisterBuilder andPass(String password){
            this.password=password;
            return this;
        }
        public  Register input(){
            return instrumented(Register.class,this.fname,this.lname,this.age,this.username,this.password);
        }
    }
}
