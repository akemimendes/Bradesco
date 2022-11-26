package utilidade;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class Impressao
{
    public static <Arrayarquivos> void imprimir(WebDriver navegador, Diretorios vardir, VariaveisConfiguracao config) throws InterruptedException {
        // vou deletar downloads existentes

        File[] files = new File("/home/robertinho/Downloads/").listFiles();
        for (File file : files) {
            file.delete();
        }


        //clicar em imprimir
        try
        {
            WebDriverWait wait = new WebDriverWait(navegador, Duration.ofMinutes(2));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[6]/div/div[2]/div/div/div/div/form[3]/div[14]/div/span/div[2]/a[1]")));
            navegador.findElement(By.xpath("/html/body/div[6]/div/div[2]/div/div/div/div/form[3]/div[14]/div/span/div[2]/a[1]")).click();
            Thread.sleep(1000);
            // clicou em imprimir
        } catch (Exception e) {
        }
        // clica em PDF da Cotação

        // vai renomear o pdf e mover para pasta

            Thread.sleep(3000);
        //Arrayarquivos<String> listaArquivos;
        //listaArquivos = new Arrayarquivos<String>();

        File[] files1 = new File("/home/robertinho/Downloads/").listFiles();
        try{
        for (File file : files) {
            file.renameTo(new File("home/robertinho/bradesco_rd/pdf/1"));
        }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
 }





