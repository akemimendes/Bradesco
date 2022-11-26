package telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilidade.VariaveisConfiguracao;

import java.time.Duration;

public class ConsultarCotacao
{


    public void realizarConsulta(WebDriver navegador, VariaveisConfiguracao cofig)
    {


        try
        {
            WebDriverWait wait = new WebDriverWait(navegador, Duration.ofMinutes(2));

            System.out.println("vou digitar o nr da cotacao");
            Thread.sleep(2000);

            navegador.switchTo().frame(0);
            Thread.sleep(500);
            navegador.findElement(By.id("nav-link-dd-C")).click();
            Thread.sleep(500);
            navegador.findElement(By.xpath("//*[@id=\"dd-C\"]/a[1]")).click();
            Thread.sleep(500);
            System.out.println("tela de consulta");
            Thread.sleep(500);
            navegador.findElement(By.id("formConsulta:cdCalculo")).sendKeys(cofig.getMatriz());
            Thread.sleep(500);
            WebElement suc=navegador.findElement(By.id("formConsulta:cdSucursal"));
            Select sucursal=new Select(suc);
            sucursal.selectByIndex(1);

            navegador.findElement(By.id("formConsulta:btnConsultar")).click();
            switch (cofig.getSegmento()) {
                case "EMPRESARIAL":
                    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"j_id155:tabConsultaCotacao:0:j_id156\"]/a")));
                    navegador.findElement(By.xpath("//*[@id=\"j_id155:tabConsultaCotacao:0:j_id156\"]/a")).click();
                    System.out.println("saiu da consulta");
                    break;
                case "RESIDENCIAL":
                    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"j_id143:tabConsultaCotacao:0:j_id342\"]/a")));
                    navegador.findElement(By.xpath("//*[@id=\"j_id143:tabConsultaCotacao:0:j_id342\"]/a")).click();
                    System.out.println("saiu da consulta");
                    break;
            }


        }
        catch (Exception e) {
        }
    }

}



