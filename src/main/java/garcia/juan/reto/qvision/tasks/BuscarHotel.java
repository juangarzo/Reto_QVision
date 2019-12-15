package garcia.juan.reto.qvision.tasks;

import garcia.juan.reto.qvision.model.DatosReservaModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.conditions.Check;
import org.openqa.selenium.Keys;

import java.util.List;

import static garcia.juan.reto.qvision.userinterface.BuscadorPage.*;

public class BuscarHotel implements Task {

    private List<DatosReservaModel> datosReserva;

    public BuscarHotel(List<DatosReservaModel> datosReserva) {
        this.datosReserva = datosReserva;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DESPLEGABLE_LOCATION),
                Check.whether(datosReserva.get(0).getLocation().equalsIgnoreCase(OPCION_LOS_ANGELES.getName()))
                        .andIfSo(Click.on(OPCION_LOS_ANGELES)),
                Check.whether(datosReserva.get(0).getLocation().equalsIgnoreCase(OPCION_SAN_FRANCISCO.getName()))
                        .andIfSo(Click.on(OPCION_SAN_FRANCISCO)),
                Check.whether(datosReserva.get(0).getLocation().equalsIgnoreCase(OPCION_LAS_VEGAS.getName()))
                        .andIfSo(Click.on(OPCION_LAS_VEGAS)),
                Check.whether(datosReserva.get(0).getLocation().equalsIgnoreCase(OPCION_HONOLULU.getName()))
                        .andIfSo(Click.on(OPCION_HONOLULU)),
                Check.whether(datosReserva.get(0).getLocation().equalsIgnoreCase(OPCION_NEW_YORK.getName()))
                        .andIfSo(Click.on(OPCION_NEW_YORK)),
                Check.whether(datosReserva.get(0).getLocation().equalsIgnoreCase(OPCION_NASSAU.getName()))
                        .andIfSo(Click.on(OPCION_NASSAU)),
                Check.whether(datosReserva.get(0).getLocation().equalsIgnoreCase(OPCION_PARIS.getName()))
                        .andIfSo(Click.on(OPCION_PARIS)),
                Check.whether(datosReserva.get(0).getLocation().equalsIgnoreCase(OPCION_LONDON.getName()))
                        .andIfSo(Click.on(OPCION_LONDON)),
                Check.whether(datosReserva.get(0).getLocation().equalsIgnoreCase(OPCION_ROME.getName()))
                        .andIfSo(Click.on(OPCION_ROME)),
                Check.whether(datosReserva.get(0).getLocation().equalsIgnoreCase(OPCION_HAMBURG.getName()))
                        .andIfSo(Click.on(OPCION_HAMBURG)),
                Enter.theValue(datosReserva.get(0).getCheckIn()).into(CAMPO_CHECK_IN),
                Hit.the(Keys.ENTER).keyIn(CAMPO_CHECK_IN),
                Enter.theValue(datosReserva.get(0).getCheckOut()).into(CAMPO_CHECK_OUT),
                Hit.the(Keys.ENTER).keyIn(CAMPO_CHECK_OUT),
                Click.on(BOTON_SEARCH)
        );
    }

    public static BuscarHotel conLosDatos(List<DatosReservaModel> datosReserva) {
        return Tasks.instrumented(BuscarHotel.class,datosReserva);
    }
}
