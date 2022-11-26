package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilidade.VariaveisAuto;
import utilidade.VariaveisConfiguracao;

import java.io.IOException;
import java.time.Duration;

import static java.lang.Thread.sleep;

public class CoberturasAuto {
    public void alteracob(WebDriver navegador, VariaveisAuto auto, VariaveisConfiguracao config) throws InterruptedException, IOException {
        WebDriverWait wait = new WebDriverWait(navegador, Duration.ofMinutes(2));
        System.out.println("vou selecionar produto");
        sleep(6000);
        System.out.println("clicar em editar");

        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("comissaoAuto")));
        navegador.findElement(By.xpath("//*[contains(@data-analytics-label, 'Botão | Seguro Auto Tradicional | Editar')]")).click();


        System.out.println("vou alterar comissao");
        navegador.findElement(By.id("comissaoAuto")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("comissaoAuto")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("comissaoAuto")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("comissaoAuto")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("comissaoAuto")).sendKeys(auto.getComissao());
        navegador.findElement(By.id("comissaoAuto")).sendKeys("00");

        System.out.println("vou alterar franquia");
        navegador.findElement(By.id("codigoFranquia-0")).click();
        if (auto.getFranquia().contains("RED")) {
            navegador.findElement(By.id("codigoFranquia-0")).sendKeys("50");

        } else {
            navegador.findElement(By.id("codigoFranquia-0")).sendKeys("O");
        }
        navegador.findElement(By.id("codigoFranquia-0")).sendKeys(Keys.ENTER);


        System.out.println("vou alterar RCF");

        navegador.findElement(By.id("lmiDanosMateriais")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiDanosMateriais")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiDanosMateriais")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiDanosMateriais")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiDanosMateriais")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiDanosMateriais")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiDanosMateriais")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiDanosMateriais")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiDanosMateriais")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiDanosMateriais")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiDanosMateriais")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiDanosMateriais")).sendKeys(auto.getIsdm());
        navegador.findElement(By.id("lmiDanosMateriais")).sendKeys("00");

        System.out.println("vou alterar RCFDC");

        navegador.findElement(By.id("lmiDanosCorporais")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiDanosCorporais")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiDanosCorporais")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiDanosCorporais")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiDanosCorporais")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiDanosCorporais")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiDanosCorporais")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiDanosCorporais")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiDanosCorporais")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiDanosCorporais")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiDanosCorporais")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiDanosCorporais")).sendKeys(auto.getIsdc());
        navegador.findElement(By.id("lmiDanosCorporais")).sendKeys("00");

        System.out.println("vou alterar danos morais");

        navegador.findElement(By.id("lmiDanosMorais")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiDanosMorais")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiDanosMorais")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiDanosMorais")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiDanosMorais")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiDanosMorais")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiDanosMorais")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiDanosMorais")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiDanosMorais")).sendKeys(auto.getDmo());
        navegador.findElement(By.id("lmiDanosMorais")).sendKeys("00");


        System.out.println("vou alterar app");

        navegador.findElement(By.id("lmiMortePassageiro0")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiMortePassageiro0")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiMortePassageiro0")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiMortePassageiro0")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiMortePassageiro0")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiMortePassageiro0")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiMortePassageiro0")).sendKeys(auto.getApp());
        navegador.findElement(By.id("lmiMortePassageiro0")).sendKeys("00");

        navegador.findElement(By.id("lmiInvalidezPassageiro0")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiInvalidezPassageiro0")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiInvalidezPassageiro0")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiInvalidezPassageiro0")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiInvalidezPassageiro0")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiInvalidezPassageiro0")).sendKeys(Keys.BACK_SPACE);
        navegador.findElement(By.id("lmiInvalidezPassageiro0")).sendKeys(auto.getApp());
        navegador.findElement(By.id("lmiInvalidezPassageiro0")).sendKeys("00");

        sleep(1000);
        System.out.println("vou alterar assistencia");
        navegador.findElement(By.id("clAssistencia")).click();
        navegador.findElement(By.id("clAssistencia")).sendKeys(Keys.HOME);
        if (auto.getTipoass().contains("2")) {
            //navegador.findElement(By.id("clAssistencia")).sendKeys(Keys.ARROW_DOWN);
        } else {
            if (auto.getTipoass().contains("3")) {
                navegador.findElement(By.id("clAssistencia")).sendKeys(Keys.ARROW_DOWN);
                navegador.findElement(By.id("clAssistencia")).sendKeys(Keys.ARROW_DOWN);
                navegador.findElement(By.id("clAssistencia")).sendKeys(Keys.ARROW_DOWN);

            } else {
                navegador.findElement(By.id("clAssistencia")).sendKeys(Keys.ARROW_DOWN);
                navegador.findElement(By.id("clAssistencia")).sendKeys(Keys.ARROW_DOWN);
            }
        }
        navegador.findElement(By.id("clAssistencia")).sendKeys(Keys.ENTER);
        sleep(1000);
        System.out.println("vou alterar carro resrva");

        navegador.findElement(By.id("clCarroReserva")).click();
        navegador.findElement(By.id("clCarroReserva")).sendKeys(Keys.HOME);
        if (auto.getTiporeser().contains("7")) {
            navegador.findElement(By.id("clCarroReserva")).sendKeys(Keys.ARROW_DOWN);
        } else {
            if (auto.getTiporeser().contains("15")) {
                navegador.findElement(By.id("clCarroReserva")).sendKeys(Keys.ARROW_DOWN);
                navegador.findElement(By.id("clCarroReserva")).sendKeys(Keys.ARROW_DOWN);
                navegador.findElement(By.id("clCarroReserva")).sendKeys(Keys.ARROW_DOWN);
                navegador.findElement(By.id("clCarroReserva")).sendKeys(Keys.ARROW_DOWN);

            } else {
                if (auto.getTiporeser().contains("15")) {
                    navegador.findElement(By.id("clCarroReserva")).sendKeys(Keys.ARROW_DOWN);
                    navegador.findElement(By.id("clCarroReserva")).sendKeys(Keys.ARROW_DOWN);
                } else {
                    navegador.findElement(By.id("clCarroReserva")).sendKeys("N");

                }
            }
        }
        navegador.findElement(By.id("clCarroReserva")).sendKeys(Keys.ENTER);


        sleep(1000);
        System.out.println("vou alterar carro vidros");
        navegador.findElement(By.id("clVidros")).click();
        navegador.findElement(By.id("clVidros")).sendKeys(Keys.HOME);
        if (auto.getTipovidros().contains("BAS")) {
            navegador.findElement(By.id("clVidros")).sendKeys(Keys.ARROW_DOWN);
            navegador.findElement(By.id("clVidros")).sendKeys(Keys.ARROW_DOWN);
        } else {
            navegador.findElement(By.id("clVidros")).sendKeys(Keys.ARROW_DOWN);
        }

        navegador.findElement(By.id("clVidros")).sendKeys(Keys.ENTER);

        sleep(1000);

        System.out.println("VOU TIRAR MARTELINHO E REPARO");
        navegador.findElement(By.xpath("//*[contains(@for, 'radio-clSuperMartelinho-nao-0')]")).click();
        navegador.findElement(By.xpath("//*[contains(@for, 'radio-clReparoRapido-nao-0')]")).click();
        sleep(1000);
        //Deve ser recalcular
        //navegador.findElement(By.xpath("/html/body/div[2]/div/div[6]/div/div/div[2]/div[5]/div[1]/form/div/div[8]/div/div[2]/div/div[1]/a")).click();
        navegador.findElement(By.xpath("//*[@id=\"plano-0\"]/div[8]/div/div[2]/div/div[1]/a")).click();
        sleep(4000);
    }
}
