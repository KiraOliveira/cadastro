package app.vercel.walkdog.register.newuser;


import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@DisplayName("Testes Automatizados da Funcionalidade de Novo Walker")
public class SecondTests {

    @Test
    @DisplayName("Criando um novo Walker com dados válidos")
    public void testCriandoUmNovoWalkerComDadosValidos() {
        // Aqui o navegador Chrome será aberto
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

        // Aqui o site Walkdog será aberto
        driver.get("https://walkdog.vercel.app/");

        // Validar que está na tela inicial
        String firstScreen = driver.findElement(By.cssSelector("h1")).getText();
        Assertions.assertEquals("Cuidado e diversão em cada passo", firstScreen);

        // Vou clicar no botão com o css igual strong
        driver.findElement(By.cssSelector("strong")).click();

        // Validar que está na tela de cadastro
        String screenRegister = driver.findElement(By.cssSelector("h1")).getText();
        Assertions.assertEquals("Faça seu cadastro", screenRegister);

        // Aqui valida que está na seção "Dados"


        // Aqui ele vai inserir o nome do Walker no campo nome
        driver.findElement(By.name("name")).sendKeys("Kira");

        // Aqui ele vai inserir o nome do Walker no campo nome
        driver.findElement(By.name("email")).sendKeys("kira@email.com");

        // Aqui ele vai inserir o nome do Walker no campo nome
        driver.findElement(By.name("cpf")).sendKeys("12312312396");

        // Aqui valida que está na seção "Endereço"

        // Aqui ele vai inserir o nome do Walker no campo nome
        driver.findElement(By.name("cep")).sendKeys("81250000");

        // Clicar no botão "Buscar CEP"
        driver.findElement(By.className("field")).click();

        // Aqui ele vai inserir o nome do Walker no campo nome
        driver.findElement(By.name("addressNumber")).sendKeys("12");

        // Aqui ele vai inserir o nome do Walker no campo nome
        driver.findElement(By.name("addressDetails")).sendKeys("Apartamento 3");

        // Aqui ele valida que está na seção "Atividades extras"

        // Clicar na opção "Cuidar"
        driver.findElement(By.cssSelector("li:nth-child(1)")).click();

        // Realizar o upload do arquivo
        // Falta realizar o upload do arquivo
        driver.findElement(By.cssSelector("div[role='presentation'] p")).click();

        WebElement element = driver.findElement(By.cssSelector("div[role='presentation"));
        element.sendKeys("rg.png");


        // Initialize WebDriverWait with a timeout of 10 seconds
       /* WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Find the element which may not be initially interactable
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div[role='presentation'] p")));

        // Perform action on the element
        element.click();

        WebElement uploadElement = driver.findElement(By.cssSelector("div[role='presentation'] p"));

        // enter the file path onto the file-selection input field
        uploadElement.sendKeys("/home/kira/Documentos/repositórios/walkdogJavaSE/cadastro/src/test/java/app/vercel/walkdog/register/newuser");*/





        // Verify the page URL
        //Assert.assertEquals(driver.getCurrentUrl(), "http://www.iana.org/help/example-domains");

















        // Clicar no Botão "Cadastrar"
        driver.findElement(By.className("button-register")).click();
        // Falta a parte de inserir a img

        // Fechar navegador
        driver.quit();
    }
}
