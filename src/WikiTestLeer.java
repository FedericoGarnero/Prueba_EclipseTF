import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;  import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WikiTestLeer {

@Test(description = "Validar que las busquedas en Wikipedia funcionan")
public void ValidarBusquedaWikipedia() throws Exception {  
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\fedecgm\\Downloads\\Chromedriver\\chromedriver.exe");  WebDriver driver = new ChromeDriver();
driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");

WebElement searchInput = driver.findElement(By.cssSelector(".main-box.main-box-responsive-image .main-footer .mw-ui-button"));  
Assert.assertTrue(searchInput.isDisplayed(),"Error no se ve el imput");
searchInput.click();
Thread.sleep(1000);
WebElement titulo = driver.findElement(By.id("firstHeading")); 
System.out.println("Texto encontrado "+ titulo.getText()); 
Assert.assertEquals(titulo.getText(),"Erotica (canción)");
driver.close();
}
}