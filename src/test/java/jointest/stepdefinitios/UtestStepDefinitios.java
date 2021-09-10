package jointest.stepdefinitios;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jointest.questions.Answer;
import jointest.tasks.Login;
import jointest.tasks.OpenUp;
import jointest.tasks.Search;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class UtestStepDefinitios {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^than Oderman want to register in Utest$")
    public void thanOdermanWantToRegisterInUtest() {
        OnStage.theActorCalled("Oderman").wasAbleTo((Performable) OpenUp.thePage(Login.onThePage()));
    }

    @When("^he search the course introduction to Utest$")
    public void heSearchHowToRegisterInTheUtestPage() {
      OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));

    }

    @Then("^he finds the course introduction to Utest$")
    public void heFindsTheButtonAndRegisterInThePage() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));

    }
}
