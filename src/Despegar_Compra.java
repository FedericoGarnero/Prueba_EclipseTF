import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;  import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Despegar_Compra {

@Test(description = "Validar la compra en despegar")
public void ValidarBusquedaWikipedia() throws Exception {  System.setProperty("webdriver.chrome.driver", "C:\\Users\\fedecgm\\Downloads\\Chromedriver\\chromedriver.exe");  WebDriver driver = new ChromeDriver();
driver.get("https://www.despegar.com.ar/");
driver.manage().window().maximize();

WebElement hotel = driver.findElement(By.cssSelector(".shifu-3-header .header-products-container [href=\"//www.despegar.com.ar/hoteles/\"]"));
hotel.click();
Thread.sleep(1000);
WebElement origen = driver.findElement(By.cssSelector(".sbox5-box-container .input-container [placeholder=\"Ingresá una ciudad, alojamiento o punto de interés\"]")); 
origen.click();
Thread.sleep(1000);
origen.sendKeys("Cordoba, cordoba");
Thread.sleep(1000);
origen.sendKeys(Keys.ENTER);


WebElement fechaEntrada = driver.findElement(By.cssSelector("div.sbox5-box-dates-ovr.sbox5-dates-container  div.sbox5-dates-input1 "));
fechaEntrada.click();
Thread.sleep(2000);

WebElement numeroentrada = driver.findElement(By.xpath("//*[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//*[@class='sbox5-monthgrid-datenumber-text']"));

numeroentrada.click();
Thread.sleep(1000);

WebElement numerosalida = driver.findElement(By.xpath("//*[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//*[@class='sbox5-monthgrid-datenumber -weekday']//*[@class='sbox5-monthgrid-datenumber-number'][text()=12]"));
numerosalida.click();

WebElement entendiCookies = driver.findElement(By.xpath("//a[@class='lgpd-banner--button eva-3-btn -white -md']"));
entendiCookies.click();

WebElement aceptarfecha = driver.findElement(By.xpath("//button[@class='sbox5-3-btn -primary -md']"));
aceptarfecha.click();

Thread.sleep(2000);
WebElement Habitaciones = driver.findElement(By.cssSelector(".sbox5-3-second-input"));
Habitaciones.click();

Thread.sleep(1000);

WebElement adultos = driver.findElement(By.cssSelector("div.distribution__container.distribution__type__rooms div.stepper__room div.stepper__room__row:nth-child(1)  div.sbox5-3-steppers.-md > button.steppers-icon-right.stepper__icon"));
adultos.click();

WebElement menores = driver.findElement(By.cssSelector("div.distribution__container.distribution__type__rooms div.stepper__room div.stepper__distribution_container div.stepper__room__row:nth-child(2) div.stepper__room__row__stepper__contaer div.sbox5-3-steppers.-md > button.steppers-icon-right.stepper__icon"));
menores.click();

WebElement combo = driver.findElement(By.cssSelector(".select-container .select"));
combo.click();

WebElement edad = driver.findElement(By.xpath("//div[@class='select-container'] /select[@class='select'] /option[@value=3]"));
edad.click();

WebElement aplicar = driver.findElement(By.xpath("//div[@class='distribution__container distribution__type__rooms']  //div[@class='stepper__room__footer '] //a[@class='sbox5-3-btn -md -primary']"));
aplicar.click();

WebElement buscar = driver.findElement(By.cssSelector(".sbox5-box-button-ovr.sbox5-3-btn.-secondary.-icon.-lg"));
buscar.click();

WebElement searchInput = driver.findElement(By.cssSelector(".sub-nav-corners-container"));
Assert.assertTrue(searchInput.isDisplayed(),"Error no se ve el la barra");

driver.close();
}
}