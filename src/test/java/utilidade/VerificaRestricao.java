package utilidade;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class VerificaRestricao {
    public static void VerRestricao( WebDriver navegador, Variaveis param, VariaveisConfiguracao config) {

        System.out.println("vai veriricar se calculou");

        //navegador.findElement(By.xpath("/html/body/div[6]/div/div[2]/div/div/div/div/form[3]/div[1]/span/table/tbody/tr/td")).click();

        //esse comando demora um pouco pra testar se existe o elemento na pagina
       /* if (navegador.findElements(By.xpath("//*[contains(text(), 'Item 1: Existe pergunta do Questionário de Avaliação de Risco que não foi respondida')]")).size()>0){
            System.out.println("falta responder questionario");
        }*/
        //outra opção
        try {
            WebDriverWait wait = new WebDriverWait(navegador, Duration.ofMinutes(2));
            navegador.findElement(By.xpath("//*[contains(text(), 'Item 1: Existe pergunta do Questionário de Avaliação de Risco que não foi respondida')]"));
            navegador.findElement(By.id("formCotacao:j_id713")).click();
            Thread.sleep(2000);
            try {
                navegador.findElement(By.xpath("//*[contains(@onfocus, 'ICoberturaEventosExternos')]"));
                navegador.findElement(By.xpath("//*[contains(@onfocus, 'ICoberturaEventosExternos')]")).click();
                navegador.findElement(By.xpath("//*[contains(@onfocus, 'ICoberturaEventosExternos')]")).sendKeys("N");
                Thread.sleep(1000);
                navegador.findElement(By.xpath("//*[contains(@onfocus, 'ICoberturaEventosExternos')]")).sendKeys(Keys.ENTER);
                Thread.sleep(2000);

            } catch (Exception e) {
                System.out.println("Não tem Eventos externos");
            }
            try {
                Thread.sleep(2000);
                navegador.findElement(By.xpath("//*[contains(@onfocus, 'IDespesasReferentesPerdaPontoComercial')]"));
                navegador.findElement(By.xpath("//*[contains(@onfocus, 'IDespesasReferentesPerdaPontoComercial')]")).click();
                navegador.findElement(By.xpath("//*[contains(@onfocus, 'IDespesasReferentesPerdaPontoComercial)]")).sendKeys("N");
                Thread.sleep(1000);
                navegador.findElement(By.xpath("//*[contains(@onfocus, 'IDespesasReferentesPerdaPontoComercial')]")).sendKeys(Keys.ENTER);
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println("Não tem ponto comercial");
            }


            navegador.findElement(By.id("formCotacao:j_id1034")).click();
            Thread.sleep(1000);
            System.out.println("vou clicar em calcular");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("formCotacao:btnCalcular")));

            navegador.findElement(By.id("formCotacao:btnCalcular")).click();

        } catch (Exception e) {
            System.out.println("Não precisa preencher questionario");
        }

    }
}
