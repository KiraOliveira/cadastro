package app.vercel.walkdog.register.newuser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

import org.openqa.selenium.WebElement;

@DisplayName("Testes Automatizados da Funcionalidade de Novo Walker")
public class NewUserTests {

    @Test
    @DisplayName("Criando um novo Walker com dados válidos")
    public void testCriandoUmNovoWalkerComDadosValidos() {
        // Aqui o navegador Chrome será aberto
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

        // Aqui o site Walkdog será aberto
        navegador.get("https://walkdog.vercel.app/");

        // Validar que está na tela inicial
        String firstScreen = navegador.findElement(By.cssSelector("h1")).getText();
        Assertions.assertEquals("Cuidado e diversão em cada passo", firstScreen);

        // Vou clicar no botão com o css igual strong
        navegador.findElement(By.cssSelector("strong")).click();

        // Validar que está na tela de cadastro
        String screenRegister = navegador.findElement(By.cssSelector("h1")).getText();
        Assertions.assertEquals("Faça seu cadastro", screenRegister);

        // Aqui valida que está na seção "Dados"


        // Aqui ele vai inserir o nome do Walker no campo nome
        navegador.findElement(By.name("name")).sendKeys("Kira");

        // Aqui ele vai inserir o nome do Walker no campo nome
        navegador.findElement(By.name("email")).sendKeys("kira@email.com");

        // Aqui ele vai inserir o nome do Walker no campo nome
        navegador.findElement(By.name("cpf")).sendKeys("12312312396");

        // Aqui valida que está na seção "Endereço"

        // Aqui ele vai inserir o nome do Walker no campo nome
        navegador.findElement(By.name("cep")).sendKeys("81250000");

        // Clicar no botão "Buscar CEP"
        navegador.findElement(By.className("field")).click();

        // Aqui ele vai inserir o nome do Walker no campo nome
        navegador.findElement(By.name("addressNumber")).sendKeys("12");

        // Aqui ele vai inserir o nome do Walker no campo nome
        navegador.findElement(By.name("addressDetails")).sendKeys("Apartamento 3");

        // Aqui ele valida que está na seção "Atividades extras"

        // Clicar na opção "Cuidar"
        navegador.findElement(By.cssSelector("li:nth-child(1)")).click();

        // Realizar o upload do arquivo
        // Falta realizar o upload do arquivo
        //navegador.findElement(By.cssSelector("div[role='presentation'] p")).click();




        // Clicar no Botão "Cadastrar"
        navegador.findElement(By.className("button-register")).click();
        // Falta a parte de inserir a img

        // Fechar navegador
        //navegador.quit();
    }
}
