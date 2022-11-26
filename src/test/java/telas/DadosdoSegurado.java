package telas;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilidade.Variaveis;
import utilidade.VariaveisConfiguracao;

import java.time.Duration;

public class DadosdoSegurado {
    public void trocaCNPJ(WebDriver navegador, Variaveis param, VariaveisConfiguracao config) {
        try {
            WebDriverWait wait = new WebDriverWait(navegador, Duration.ofMinutes(2));
            System.out.println("vou trocar cnpj");
            Thread.sleep(2000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"formCotacao:ICpfCnpjProponente\"]")));
            navegador.findElement(By.xpath("//*[@id=\"formCotacao:ICpfCnpjProponente\"]")).clear();
            Thread.sleep( 1000 );

            navegador.findElement(By.xpath("//*[@id=\"formCotacao:ICpfCnpjProponente\"]")).sendKeys(param.getCnpjcpf());
            Thread.sleep( 1000 );
            navegador.findElement( By.xpath("//*[@id=\"formCotacao:ICpfCnpjProponente\"]")).sendKeys( Keys.TAB );
            Thread.sleep( 1000 );

            System.out.println("vou trocar cep");
            navegador.findElement(By.xpath("/html/body/div[6]/div/div[2]/div/div/div/div/form[3]/div[10]/span/div[3]/div[1]/input")).clear();
            Thread.sleep( 1000 );
            navegador.findElement(By.xpath("/html/body/div[6]/div/div[2]/div/div/div/div/form[3]/div[10]/span/div[3]/div[1]/input")).sendKeys(param.getCep());
            Thread.sleep( 1000 );
            navegador.findElement( By.xpath("/html/body/div[6]/div/div[2]/div/div/div/div/form[3]/div[10]/span/div[3]/div[1]/input")).sendKeys( Keys.TAB );
            Thread.sleep( 1000 );
            navegador.findElement( By.xpath("/html/body/div[6]/div/div[2]/div/div/div/div/form[3]/div[10]/span/div[3]/div[2]")).click();
            Thread.sleep( 2000 );
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[6]/div/div[2]/div/div/div/div/form[3]/div[10]/span/div[3]/div[5]/input")));
            navegador.findElement(By.xpath("/html/body/div[6]/div/div[2]/div/div/div/div/form[3]/div[10]/span/div[3]/div[5]/input")).click();
            Thread.sleep( 1000 );
            navegador.findElement(By.xpath("/html/body/div[6]/div/div[2]/div/div/div/div/form[3]/div[10]/span/div[3]/div[5]/input")).sendKeys("123");
            Thread.sleep( 1000 );

            System.out.println("vou trocar cnpj atividade");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[6]/div/div[2]/div/div/div/div/form[3]/div[10]/span/div[5]/div[2]/input")));
            navegador.findElement(By.xpath("/html/body/div[6]/div/div[2]/div/div/div/div/form[3]/div[10]/span/div[5]/div[2]/input")).clear();
            Thread.sleep( 1000 );
            navegador.findElement(By.xpath("/html/body/div[6]/div/div[2]/div/div/div/div/form[3]/div[10]/span/div[5]/div[2]/input")).sendKeys(param.getCnpjcpf());
            Thread.sleep( 1000 );

            navegador.findElement( By.xpath("/html/body/div[6]/div/div[2]/div/div/div/div/form[3]/div[10]/span/div[5]/div[2]/input")).sendKeys( Keys.TAB );
            Thread.sleep( 3000 );

            System.out.println("vou trocar codigo de atividade");
           // wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("formCotacao:IAtividade")));
            //if (navegador.findElement(By.id("formCotacao:IAtividade")).isEnabled()){
                navegador.findElement(By.id("formCotacao:IAtividade")).sendKeys(Keys.HOME);
            // }

            navegador.findElement(By.id("formCotacao:IAtividade")).click();
            Thread.sleep( 1000 );
            navegador.findElement(By.id("formCotacao:IAtividade")).sendKeys(param.getCod());
            Thread.sleep( 1000 );
            navegador.findElement( By.id("formCotacao:IAtividade")).sendKeys( Keys.ENTER );
            Thread.sleep(2000);


        } catch (Exception e) {
        }

    }
}

