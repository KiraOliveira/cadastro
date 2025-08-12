package app.vercel.walkdog.register.newuser;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

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
    }
}
