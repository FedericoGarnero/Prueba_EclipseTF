import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;  import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WikiTests1 {

@Test(description = "Validar que las busquedas en Wikipedia funcionan")
public void ValidarBusquedaWikipedia() throws Exception {  System.setProperty("webdriver.chrome.driver", "C:\\Users\\fedecgm\\Downloads\\Chromedriver\\chromedriver.exe");  WebDriver driver = new ChromeDriver();
driver.get("http://wikipedia.org");
WebElement searchInput = driver.findElement(By.cssSelector("div#main-tfa div.main-footer div.main-footer-actions.main-plainlist.nomobile ul li a span.mw-ui-button"));  Assert.assertTrue(searchInput.isDisplayed()); 
searchInput.submit();
WebElement tituloResultado = driver.findElement(By.id("firstHeading"));  System.out.println("Texto encontrado "+ tituloResultado.getText());  Assert.assertTrue(tituloResultado.isDisplayed());
driver.close();
}
}