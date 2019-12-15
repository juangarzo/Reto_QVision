package garcia.juan.reto.qvision.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ResumenReserva extends PageObject {


    public final static Target TOTAL_TO_PAY_NOW = Target.the("TOTAL TO PAY NOW").
            located(By.xpath("//h4[@class='total-price']"));

}
