package garcia.juan.reto.qvision.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Resultados extends PageObject {
/*
    public final static Target RESULTADOS_PRECIOS = Target.the("Resultados Precios").
            located(By.xpath("//p[@class='rate-number'][{0}]"));
    public final static Target RESULTADOS_BOTONES = Target.the("Resultados Botones").
            located(By.xpath("//span[text()='Book it'][{0}]"));*/

    public final static Target RESULTADOS_PRECIOS = Target.the("Resultados Precios").
            located(By.xpath("//p[@class='rate-number']"));
    public final static Target RESULTADOS_BOTONES = Target.the("Resultados Botones").
            located(By.xpath("//span[text()='Book it']"));
}
