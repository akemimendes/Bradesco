package telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilidade.VariaveisConfiguracao;

import java.time.Duration;

public class Login {

    public void realizarLogin(WebDriver navegador, VariaveisConfiguracao cofig) {
        System.out.println("Inciando o acesso...");
        try {
            WebDriverWait wait = new WebDriverWait(navegador, Duration.ofMinutes(2));
            //aguardando elemento cpf ficar visivel
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cpfcnpj")));
            navegador.findElement(By.id("cpfcnpj")).sendKeys(cofig.getLogin());
            Thread.sleep( 500 );
            navegador.findElement(By.id("tag_Home_Login-proximo")).click();
            Thread.sleep( 1000 );
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("senha")));
            navegador.findElement(By.id("senha")).sendKeys(cofig.getSenha());
            Thread.sleep( 500 );
            navegador.findElement(By.id("tag_Home_Login-entrar")).click();
            System.out.println("Acesso realizado");
            System.out.println("entrando no ramo");
            switch (cofig.getSegmento()) {
                case "EMPRESARIAL":
                    navegador.get("https://wwwn.bradescoseguros.com.br/pnegocios2/wps/myportal/portaldenegociosnovo/arealogada/re/cotacoes/empresarial-ate-10-milhoes/!ut/p/z1/lZFBD4IwDIV_0ro5YB4Xk7GFDZ0ExF3MTmaJogfj73chXkAE7a3J9_r6WuRQi1znn-HsH-HW-Uvsjy496VwrWDNSwkYQsLypaG6IxHuMDj0AX4oDcr_opwGsVDLUszplYK0yDasp4B2Z1fcGbn69kX7LuIgGhS5Ka4BU5E__T2AxvxtZKJHFCVLoFUicJ9kYGJ6IGvoG5n4wnDARcmnN-7WO1UJQgb8AjK0mGg!!/dz/d5/L2dJQSEvUUt3QS80TmxFL1o2X0xHTEkwOTgyTjhVNjgwUVFJTVY4VTQwMVAy/");
                    break;
                case "RESIDENCIAL":
                    navegador.get("https://wwwn.bradescoseguros.com.br/pnegocios2/wps/myportal/portaldenegociosnovo/arealogada/re/cotacoes/empresarial-ate-10-milhoes/!ut/p/z1/lZFBD4IwDIV_0ro5YB4Xk7GFDZ0ExF3MTmaJogfj73chXkAE7a3J9_r6WuRQi1znn-HsH-HW-Uvsjy496VwrWDNSwkYQsLypaG6IxHuMDj0AX4oDcr_opwGsVDLUszplYK0yDasp4B2Z1fcGbn69kX7LuIgGhS5Ka4BU5E__T2AxvxtZKJHFCVLoFUicJ9kYGJ6IGvoG5n4wnDARcmnN-7WO1UJQgb8AjK0mGg!!/dz/d5/L2dJQSEvUUt3QS80TmxFL1o2X0xHTEkwOTgyTjhVNjgwUVFJTVY4VTQwMVAy/");
                    break;
                case "CONDOMINIO":
                    navegador.get("https://wwwn.bradescoseguros.com.br/pnegocios2/wps/myportal/portaldenegociosnovo/arealogada/re/cotacoes/empresarial-ate-10-milhoes/!ut/p/z1/lZFBD4IwDIV_0ro5YB4Xk7GFDZ0ExF3MTmaJogfj73chXkAE7a3J9_r6WuRQi1znn-HsH-HW-Uvsjy496VwrWDNSwkYQsLypaG6IxHuMDj0AX4oDcr_opwGsVDLUszplYK0yDasp4B2Z1fcGbn69kX7LuIgGhS5Ka4BU5E__T2AxvxtZKJHFCVLoFUicJ9kYGJ6IGvoG5n4wnDARcmnN-7WO1UJQgb8AjK0mGg!!/dz/d5/L2dJQSEvUUt3QS80TmxFL1o2X0xHTEkwOTgyTjhVNjgwUVFJTVY4VTQwMVAy/");
                    break;
                case "AUTO":

                  // navegador.findElement(By.id("auto-cotacoes")).click();
                   //Thread.sleep(1000);
                   //navegador.findElement(By.id("auto-cotacoes-cotacaoauto")).click();
                   // Thread.sleep(1000);
                    navegador.get("https://wwwn.bradescoseguros.com.br/pnegocios2/wps/myportal/portaldenegociosnovo/arealogada/auto/cotacoes/cotacao-auto/!ut/p/z1/04_Sj9CPykssy0xPLMnMz0vMAfIjo8zifdx9PA0sLYz8DJzdjAwCHcOCTdx9jQw9PU31w8EKDHAARwP9KGL041EQhd_4cP0oVCssPN3MDQIDPdx8jA08DN1NzdEVoFph4msCVYDHkoLc0AiDTE9FAJRcuYw!/dz/d5/L2dJQSEvUUt3QS80TmxFL1o2X0xHTEkwOTgyTjBDRjIwUUFWUzRHTTJIRDQ3/");
                    break;

            }


            Thread.sleep(500);
            navegador.manage().window().maximize();

        }catch (Exception e){

        }
    }

}
