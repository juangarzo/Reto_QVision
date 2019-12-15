package garcia.juan.reto.qvision.tasks;

import garcia.juan.reto.qvision.userinterface.HotelsDXHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirElSitioWeb implements Task {

    private HotelsDXHomePage hotelsDXHomePage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(hotelsDXHomePage));
    }

    public static AbrirElSitioWeb hotelsDX() {
        return Tasks.instrumented(AbrirElSitioWeb.class);
    }
}
