package garcia.juan.reto.qvision.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class BuscadorPage {
    public final static Target DESPLEGABLE_LOCATION = Target.the("Desplegable").
            located(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));

    public final static Target OPCION_LOS_ANGELES = Target.the("Los Angeles").
            located(By.xpath("//div[@class='dx-item-content dx-list-item-content'][contains(text(),'Los Angeles')]"));

    public final static Target OPCION_SAN_FRANCISCO = Target.the("San Francisco").
            located(By.xpath("//div[@class='dx-item-content dx-list-item-content'][contains(text(),'San Francisco')]"));

    public final static Target OPCION_LAS_VEGAS = Target.the("Las Vegas").
            located(By.xpath("//div[@class='dx-item-content dx-list-item-content'][contains(text(),'Las Vegas')]"));

    public final static Target OPCION_HONOLULU = Target.the("Honolulu").
            located(By.xpath("//div[@class='dx-item-content dx-list-item-content'][contains(text(),'Honolulu')]"));

    public final static Target OPCION_NEW_YORK = Target.the("New York").
            located(By.xpath("//div[@class='dx-item-content dx-list-item-content'][contains(text(),'New York')]"));

    public final static Target OPCION_NASSAU = Target.the("Nassau").
            located(By.xpath("//div[@class='dx-item-content dx-list-item-content'][contains(text(),'Nassau')]"));

    public final static Target OPCION_PARIS = Target.the("Paris").
            located(By.xpath("//div[@class='dx-item-content dx-list-item-content'][contains(text(),'Paris')]"));

    public final static Target OPCION_LONDON = Target.the("London").
            located(By.xpath("//div[@class='dx-item-content dx-list-item-content'][contains(text(),'London')]"));

    public final static Target OPCION_ROME = Target.the("Rome").
            located(By.xpath("//div[@class='dx-item-content dx-list-item-content'][contains(text(),'Rome')]"));

    public final static Target OPCION_HAMBURG = Target.the("Hamburg").
            located(By.xpath("//div[@class='dx-item-content dx-list-item-content'][contains(text(),'Hamburg')]"));

    public final static Target CAMPO_CHECK_IN = Target.the("CheckIn").
            located(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
    public final static Target CAMPO_CHECK_OUT = Target.the("CheckOut").
            located(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"));
    public final static Target BOTON_SEARCH = Target.the("Boton Search").
            located(By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[1]/div/div[1]/div[3]/div"));


}
