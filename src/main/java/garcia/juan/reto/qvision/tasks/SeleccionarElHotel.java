package garcia.juan.reto.qvision.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static garcia.juan.reto.qvision.userinterface.Resultados.RESULTADOS_BOTONES;
import static garcia.juan.reto.qvision.userinterface.Resultados.RESULTADOS_PRECIOS;

public class SeleccionarElHotel implements Task {
    private int cantidadresultados;

    @Override
    public <T extends Actor> void performAs(T actor) {

        cantidadresultados = RESULTADOS_PRECIOS.resolveAllFor(actor).size();
        int posicionMenor = 0;
        for (int i = 0; i < cantidadresultados-1; i++) {
            String valor1=RESULTADOS_PRECIOS.resolveAllFor(actor).get(i).getText().replace("$","");
            String valor2=RESULTADOS_PRECIOS.resolveAllFor(actor).get(i+1).getText().replace("$","");
            if(Integer.parseInt(valor1)>Integer.parseInt(valor2)){
                posicionMenor=i+1;
            }
        }
        actor.attemptsTo(Click.on(RESULTADOS_BOTONES.resolveAllFor(actor).get(posicionMenor)));
    }

    public static SeleccionarElHotel conMenorTarifa() {
        return Tasks.instrumented(SeleccionarElHotel.class);

    }
}
