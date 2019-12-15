package garcia.juan.reto.qvision.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import garcia.juan.reto.qvision.model.DatosReservaModel;
import garcia.juan.reto.qvision.questions.ElValorCobrado;
import garcia.juan.reto.qvision.tasks.AbrirElSitioWeb;
import garcia.juan.reto.qvision.tasks.BuscarHotel;
import garcia.juan.reto.qvision.tasks.SeleccionarElHotel;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ValidarTarifasDXHotelsStepDefinition {

    @Before
    public void configuracionInicial(){
        setTheStage(new OnlineCast());
    }

    @Dado("^que accedo al sitio web de DX Hotels$")
    public void queAccedoAlSitioWebDeDXHotels(){
        theActorCalled("Carolina").wasAbleTo(AbrirElSitioWeb.hotelsDX());
    }

    @Cuando("^reservo la habitacion del hotel$")
    public void reservoLaHabitacionDelHotel(List<DatosReservaModel> datosReserva) {
        theActorInTheSpotlight().attemptsTo(
                BuscarHotel.conLosDatos(datosReserva),
                SeleccionarElHotel.conMenorTarifa()
        );
    }

    @Entonces("^valido que la tarifa cobrada es correcta\\.$")
    public void validoQueLaTarifaCobradaEsCorrecta(List<DatosReservaModel> datosReserva) {
        theActorInTheSpotlight().should(seeThat(ElValorCobrado.esCorrecto(datosReserva)));
    }
}
