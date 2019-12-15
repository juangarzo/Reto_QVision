package garcia.juan.reto.qvision.questions;

import garcia.juan.reto.qvision.model.DatosReservaModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static garcia.juan.reto.qvision.userinterface.ResumenReserva.TOTAL_TO_PAY_NOW;

public class ElValorCobrado implements Question<Boolean> {

    private List<DatosReservaModel> datosReserva;
    public ElValorCobrado(List<DatosReservaModel> datosReserva) {
        this.datosReserva = datosReserva;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return (Text.of(TOTAL_TO_PAY_NOW).viewedBy(actor).asString().replace("$","")
                .equalsIgnoreCase(datosReserva.get(0).getTotalEsperado().replace("$","")));
    }

    public static ElValorCobrado esCorrecto(List<DatosReservaModel> datosReserva) {
        return new ElValorCobrado(datosReserva);
    }
}
