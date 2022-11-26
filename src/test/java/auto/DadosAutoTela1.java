package Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilidade.VariaveisAuto;
import utilidade.VariaveisConfiguracao;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class DadosAutoTela1 {
    public void dadossegurado(WebDriver navegador, VariaveisAuto auto, VariaveisConfiguracao config) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(navegador, Duration.ofMinutes(2));
        sleep(3000);
        WebElement frame=navegador.findElement(By.xpath("/html/body/main/div[5]/div/section/div/iframe"));
        navegador.switchTo().frame(frame);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cpdsuc")));

        System.out.println("vou digitar sucursal");
        navegador.findElement(By.id("cpdsuc")).sendKeys(Keys.ARROW_DOWN);
        sleep(1000);
        navegador.findElement(By.id("cpdsuc")).sendKeys(Keys.TAB);
        navegador.findElement(By.id("inspetoria")).sendKeys(Keys.TAB);

        if (auto.getTiposeguro().contains("RENOV")) {
            navegador.findElement(By.xpath("//*[contains(@for, 'RenovacaoSim')]")).click();
            sleep(1000);
            navegador.findElement(By.id("ciaRenovacao")).click();
            navegador.findElement(By.id("ciaRenovacao")).sendKeys(auto.getCongenere());
            navegador.findElement(By.id("ciaRenovacao")).sendKeys(Keys.ENTER);
            navegador.findElement(By.id("BonusAtual")).click();
            int bonusanterior = Integer.parseInt(auto.getBonus()) - 1;
            navegador.findElement(By.id("BonusAtual")).sendKeys(String.valueOf(bonusanterior));
            navegador.findElement(By.id("BonusAtual")).sendKeys(Keys.ENTER);

            navegador.findElement(By.id("Bonus")).sendKeys(auto.getBonus());


        } else {
            navegador.findElement(By.xpath("//*[contains(@for, 'RenovacaoNao')]")).click();
            sleep(1000);
        }

        navegador.findElement(By.id("INDIVIDUAL")).sendKeys(Keys.TAB);

        sleep(1000);
        System.out.println("vou digitar cpf");

        navegador.findElement(By.xpath("/html/body/div[2]/div/form/div[1]/div[7]/div/div[2]/div[1]/div[1]/div/input")).click();
        sleep(1000);
        navegador.findElement(By.xpath("/html/body/div[2]/div/form/div[1]/div[7]/div/div[2]/div[1]/div[1]/div/input")).sendKeys(auto.getCpfauto());
        navegador.findElement(By.xpath("/html/body/div[2]/div/form/div[1]/div[7]/div/div[2]/div[1]/div[1]/div/input")).sendKeys(Keys.TAB);
        sleep(5000);

        System.out.println("vou digitar sexo");


        sleep(1000);
        System.out.println("vou digitar cep");

        navegador.findElement(By.id("cep")).sendKeys(auto.getCepauto());
        navegador.findElement(By.id("cep")).sendKeys(Keys.TAB);

        sleep(1000);
        System.out.println("vou digitar chassi");
        navegador.findElement(By.id("nrchassi")).sendKeys(auto.getChassi());
        navegador.findElement(By.id("nrchassi")).sendKeys(Keys.TAB);
        sleep(1000);


        System.out.println("vou digitar veiculo");
        navegador.findElement(By.id("modeloVeicBrad")).sendKeys(auto.getVeiculo());
        sleep(2000);
        navegador.findElement(By.id("modeloVeicBrad")).sendKeys(Keys.ARROW_DOWN);
        sleep(1000);
        navegador.findElement(By.id("modeloVeicBrad")).sendKeys(Keys.ENTER);
        sleep(1000);
        navegador.findElement(By.id("modeloVeicBrad")).sendKeys(Keys.TAB);
        sleep(1000);
        //navegador.findElement(By.id(" ui-id-11")).click();
        //sleep( 1000 );


        System.out.println("vou digitar ano do veiculo");

        navegador.findElement(By.id("anoFab")).sendKeys(auto.getAnofabrica());
        navegador.findElement(By.id("anoFab")).sendKeys(Keys.TAB);
        sleep(1000);

        navegador.findElement(By.id("anoMod")).sendKeys(auto.getAnofabrica());
        navegador.findElement(By.id("anoMod")).sendKeys(Keys.TAB);
        sleep(1000);

        System.out.println("vou digitar lotacao do veiculo");

        navegador.findElement(By.id("nrPassageiros")).sendKeys("5");
        navegador.findElement(By.id("nrPassageiros")).sendKeys(Keys.TAB);
        sleep(1000);

        System.out.println("vou digitar combustivel");
        String combust = auto.getCombustivel().replaceAll("Combustível", "");

        if (auto.getVeiculo().contains("FL")) {
            navegador.findElement(By.xpath("/html/body/div[2]/div/form/div[1]/div[10]/div[1]/div/div[5]/div[4]/select")).sendKeys("G");
            navegador.findElement(By.xpath("/html/body/div[2]/div/form/div[1]/div[10]/div[1]/div/div[5]/div[4]/select")).sendKeys("G");
            navegador.findElement(By.xpath("/html/body/div[2]/div/form/div[1]/div[10]/div[1]/div/div[5]/div[4]/select")).sendKeys(Keys.TAB);


        } else {
            if (combust.contains("G")) {
                navegador.findElement(By.xpath("/html/body/div[2]/div/form/div[1]/div[10]/div[1]/div/div[5]/div[4]/select")).sendKeys("G");
                navegador.findElement(By.xpath("/html/body/div[2]/div/form/div[1]/div[10]/div[1]/div/div[5]/div[4]/select")).sendKeys(Keys.TAB);
            } else {
                if (combust.contains("D")) {
                    navegador.findElement(By.xpath("/html/body/div[2]/div/form/div[1]/div[10]/div[1]/div/div[5]/div[4]/select")).sendKeys("D");
                    navegador.findElement(By.xpath("/html/body/div[2]/div/form/div[1]/div[10]/div[1]/div/div[5]/div[4]/select")).sendKeys(Keys.TAB);
                } else {
                    navegador.findElement(By.xpath("/html/body/div[2]/div/form/div[1]/div[10]/div[1]/div/div[5]/div[4]/select")).sendKeys("G");
                    navegador.findElement(By.xpath("/html/body/div[2]/div/form/div[1]/div[10]/div[1]/div/div[5]/div[4]/select")).sendKeys("G");
                    navegador.findElement(By.xpath("/html/body/div[2]/div/form/div[1]/div[10]/div[1]/div/div[5]/div[4]/select")).sendKeys(Keys.TAB);
                }
            }
        }

        System.out.println("vou digitar portas");


        if (navegador.findElement(By.xpath("/html/body/div[2]/div/form/div[1]/div[10]/div[1]/div/div[5]/div[1]/select")).isEnabled()) {
            navegador.findElement(By.xpath("/html/body/div[2]/div/form/div[1]/div[10]/div[1]/div/div[5]/div[1]/select")).click();

            if (auto.getPortas().contains("4")) {
                navegador.findElement(By.xpath("/html/body/div[2]/div/form/div[1]/div[10]/div[1]/div/div[5]/div[1]/select")).sendKeys("4");
            } else {
                if (auto.getVeiculo().contains("4")) {
                    navegador.findElement(By.xpath("/html/body/div[2]/div/form/div[1]/div[10]/div[1]/div/div[5]/div[1]/select")).sendKeys("4");
                } else {
                    navegador.findElement(By.xpath("/html/body/div[2]/div/form/div[1]/div[10]/div[1]/div/div[5]/div[1]/select")).sendKeys("2");
                }
            }
            navegador.findElement(By.xpath("/html/body/div[2]/div/form/div[1]/div[10]/div[1]/div/div[5]/div[1]/select")).sendKeys(Keys.TAB);
        }


        System.out.println("vou mudar de tela");
        sleep(1000);
        //navegador.switchTo().frame(1);

        sleep(1000);
        navegador.findElement(By.xpath("//*[contains(@data-analytics-label, 'Botão | Continuar')]")).click();


        sleep(1000);


    }
}
