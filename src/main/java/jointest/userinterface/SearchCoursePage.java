package jointest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_ACADEMY = Target.the("Click on ACADEMY")
            .located(By.xpath("//div [@class='Academy']"));
    public static final Target SELECT_COURSE = Target.the("Click on the course Introduction to uTest")
            .located(By.xpath("//a @[class=\"course-track-view\" ng-class=\"{'completed': $ctrl.courseTrackCompleted}]"));


    public static final Target NAME_COURSE = Target.the("Click name of course")
            .located(By.id("namecourse"));
}
