package co.com.choucair.certification.automationtesting.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DemoAutomationPage {

    public static final Target TEXTO_FIRST_NAME = Target.the("Area para escribir el nombre").located(By.xpath("//input[@placeholder='First Name']"));
    public static final Target TEXTO_LAST_NAME = Target.the("Area para escribir el apellido").located(By.xpath("//input[@placeholder='Last Name']"));
    public static final Target TEXTO_ADDRESS = Target.the("Area para escribir la direccion").located(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']"));
    public static final Target TEXTO_EMAIL = Target.the("Area para escribir el email").located(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']"));
    public static final Target TEXTO_PHONE = Target.the("Area para escribir el telefono").located(By.cssSelector("input.form-control.ng-pristine.ng-untouched.ng-invalid.ng-invalid-required.ng-valid-pattern"));
    public static final Target RADIO_MALE = Target.the("Radio button para escoger  genero masculino").located(By.xpath("//label[1]//input[1]"));
    public static final Target RADIO_FEMALE = Target.the("Radio button para escoger  genero femenino").located(By.xpath("//label[2]"));
    public static final Target SELECT_SKILLS = Target.the("select para escoger los skills").located(By.id("Skills"));
    public static final Target SELECT_COUNTRY = Target.the("select para escoger el pais").located(By.id("countries"));
    public static final Target SPAN_COUNTRY = Target.the("select/span 2 para escoger el pais").located(By.xpath("//span[@class='select2-selection select2-selection--single']"));
    public static final Target TEXTO_COUNTRY = Target.the("area para escribir el pais").located(By.xpath("//input[@class='select2-search__field']"));
    public static final Target SELECT_YEAR = Target.the("select para escoger el año de nacimiento").located(By.id("yearbox"));
    public static final Target SELECT_DAY = Target.the("select para escoger el dia de nacimiento").located(By.id("daybox"));
    public static final Target SELECT_MONTH = Target.the("select para escoger el mes de nacimiento").located(By.xpath("//select[@placeholder='Month']"));
    public static final Target TEXTO_PASSWORD = Target.the("Area para escribir la contraseña").located(By.id("firstpassword"));
    public static final Target TEXTO_CONFIRMPASSWORD = Target.the("Area para escribir la confirmacion contraseña").located(By.id("secondpassword"));
    public static final Target BOTON_SUBMIT = Target.the("Boton para enviar los datos del formulario").located(By.id("submitbtn"));
    public static final Target CHECKBOX_CRICKET = Target.the("Checkbox para seleccionar hobbie cricket").located(By.id("checkbox1"));
    public static final Target CHECKBOX_MOVIES = Target.the("Checkbox para seleccionar hobbie movies").located(By.id("checkbox2"));
    public static final Target CHECKBOX_HOCKEY = Target.the("Checkbox para seleccionar hobbie hockey").located(By.id("checkbox3"));
    public static final Target LISTA_LENGUAJES = Target.the("Ingresa lenguaje").located(By.xpath("//*[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']/li"));
    public static final Target DIV_LENGUAJES = Target.the("desplegar lenguajes").located(By.id("msdd"));
    public static final Target TEXTO_SALIDA = Target.the("Texto que sale al registrarse correctamente").located(By.xpath("//h4[1]"));
}
