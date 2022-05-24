import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;  import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WikiTestBienvenidos {

@Test(description = "Validar titulo bienvenido")
public void ValidarBusquedaWikipedia() throws Exception {  System.setProperty("webdriver.chrome.driver", "C:\\Users\\fedecgm\\Downloads\\Chromedriver\\chromedriver.exe");  WebDriver driver = new ChromeDriver();
driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
WebElement elemento1 = driver.findElement(By.xpath("//h1/span/a"));  System.out.println("Texto encontrado "+ elemento1.getText()); Assert.assertEquals(elemento1.getText(),"Bienvenidos");
driver.close();
}
}