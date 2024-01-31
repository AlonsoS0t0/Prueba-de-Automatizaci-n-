package com.nttdata.stepsdefinitions;

import com.nttdata.page.BottomGratis;
import com.nttdata.steps.InventorySteps;
import com.nttdata.steps.JuntozSteps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyGratisStepdefs {
    private JuntozSteps juntozSteps;
    private WebDriver driver;
    private Scenario scenario;

    @Before(order = 0)
    public void setUp(){
        //setUp
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

        //crear el driver
        driver = new ChromeDriver();
        //max
        driver.manage().window().maximize();
    }

    @Before(order = 1)
    public void setScenario(Scenario scenario){
        this.scenario = scenario;
    }

    @After
    public void quitDriver(){
        driver.quit();
    }

    private JuntozSteps JuntozSteps(WebDriver driver){
        return new JuntozSteps(driver);

    }
    @Dado("dado Que Me Encuentro En La Pagina Https Juntoz Com")
    public void dadoQueMeEncuentroEnLaPaginaHttpsJuntozCom() {
        driver.get("https://juntoz.com/");

    }

    @Y("Ingresar la categoría {string}")
    public void ingresarLaCategoría(String categoria) {
        juntozSteps = new JuntozSteps(driver);
        juntozSteps.buscarCategoria(categoria);
        WebElement butonbuqueda = driver.findElement(categoria);
        categoria.click();
    }

    @Y("hago click en el primer producto")
    public void hagoClickEnElPrimerProducto() {
        WebElement butonbuqueda = driver.findElement(categoria);
        categoria.click();
    }
    }

    @Y("luego agrego al Carrito")
    public void luegoAgregoAlCarrito() {
        WebElement butonbuqueda = driver.findElement(categoria);
        categoria.click();
    }
    }

    @Entonces("valido los resultados")
    public void validoLosResultados() {
    }

}
