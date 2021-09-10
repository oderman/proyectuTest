package jointest.userinterface;



import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class UtestLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON =Target.the("Button that show us where we will log in").
            located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']//strong[contains(text(),'Join Today')]"));
    public static final Target INPUT_NAME = Target.the("Where do we write the name")
            .located(By.name("name"));
    public static final Target INPUT_LASTNAME =Target.the("Where do we write the Last name")
            .located(By.name("lastname"));
    public static final Target INPUT_EMAIL = Target.the("Where do we write the email")
            .located(By.id("email"));
    public static final Target ENTER_BUTTON = Target.the("Click on the button")
            .located(By.xpath("//button[contains(@class,'btn btn-blue')]"));
}
