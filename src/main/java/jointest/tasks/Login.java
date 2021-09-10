package jointest.tasks;

import jointest.userinterface.UtestLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestLoginPage.LOGIN_BUTTON),
                Enter.theValue("Write your name").into(UtestLoginPage.INPUT_NAME),
                Enter.theValue("Write your last name").into(UtestLoginPage.INPUT_LASTNAME),
                Enter.theValue("Write your email").into(UtestLoginPage.INPUT_LASTNAME),
                Click.on(UtestLoginPage.ENTER_BUTTON)
                );

    }
}
