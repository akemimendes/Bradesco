package Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilidade.VariaveisAuto;
import utilidade.VariaveisConfiguracao;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class DadosPerfil {

    public void perfilauto(WebDriver navegador, VariaveisAuto auto, VariaveisConfiguracao config) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(navegador, Duration.ofMinutes(2));


        System.out.println("vou digitar o condutor principal");
        sleep(2000);

        if (auto.getCpfcond().contains("MESMO")) {
            navegador.findElement(By.xpath("//*[contains(@for, 'segehprincond-SIM')]")).click();

        } else {

            navegador.findElement(By.xpath("//*[contains(@for, 'segehprincond-NAO')]")).click();
            // implementar aqui outro condutor
            // cpf formDesabilitaPrincipalCondutor()
            //datadtnascimento_condutor
            //sexod sexo_condutor-MASCULINO sexo_condutor-FEMININO
        }

        sleep(1000);
        System.out.println("vou digitar o estadeo  civil");

        if (auto.getEstcivil().contains("C")) {
            navegador.findElement(By.xpath("//*[contains(@for, 'estadocivil_condutor-CASADO_UNIAO_ESTAVEL')]")).click();
        } else {
            navegador.findElement(By.xpath("//*[contains(@for, 'estadocivil_condutor-SOLTEIRO_OUTROS')]")).click();
        }
        sleep(1000);

        System.out.println("vou digitar  deoendentes");
        if (auto.getResid().contains("N")) {
            navegador.findElement(By.xpath("//*[contains(@for, 'condutor_idadefilhos-NAO')]")).click();
        } else {
            navegador.findElement(By.xpath("//*[contains(@for, 'condutor_idadefilhos-SIM_CONDUTORES_MASCULINO_OU_FEMININO')]")).click();
        }
        sleep(1000);

        System.out.println("vou garagem na residencia");
        if (auto.getGrgres().contains("Sim")) {
            if (auto.getGrgres().contains("AUT")) {
                navegador.findElement(By.xpath("//*[contains(@for, 'condutor_garagem-SIM_PORTAO_AUTOMATICO')]")).click();
            } else {
                navegador.findElement(By.xpath("//*[contains(@for, 'condutor_garagem-SIM_PORTAO_MANUAL')]")).click();
            }
        } else {
            navegador.findElement(By.xpath("//*[contains(@for, 'condutor_garagem-NAO')]")).click();
        }

        sleep(1000);
        System.out.println("quantidade de veiculos na residencia");
        if (auto.getVeiculo().contains("1")) {
            navegador.findElement(By.xpath("//*[contains(@for, 'chk_mais1veic_resid_NAO')]")).click();
        } else {
            navegador.findElement(By.xpath("//*[contains(@for, 'chk_mais1veic_resid_SIM')]")).click();
        }

        System.out.println("profissao vou deixar outras alterar se precisar");
        navegador.findElement(By.xpath("/html/body/div[2]/div/form/div[1]/div[5]/div[1]/div[2]/div[16]/div/select")).click();
        navegador.findElement(By.xpath("/html/body/div[2]/div/form/div[1]/div[5]/div[1]/div[2]/div[16]/div/select")).sendKeys("o");
        navegador.findElement(By.xpath("/html/body/div[2]/div/form/div[1]/div[5]/div[1]/div[2]/div[16]/div/select")).sendKeys(Keys.ENTER);

        sleep(1000);

        System.out.println("se utiliza para ida e volta trabalho");
        if (auto.getGrgtrab().contains("Sim")) {
            navegador.findElement(By.xpath("//*[contains(@for, 'usav_trab_condutor_SIM')]")).click();
            sleep(1000);

            if (auto.getGrgtrab().contains("Sim")) {
                navegador.findElement(By.xpath("//*[contains(@for, 'garagem_trab_condutor-SIM_PORTAO_AUTOMATICO')]")).click();
            } else {
                navegador.findElement(By.xpath("//*[contains(@for, 'garagem_trab_condutor-NAO')]")).click();
                sleep(1000);
            }
        } else {
            navegador.findElement(By.xpath("//*[contains(@for, 'usav_trab_condutor_NAO')]")).click();

        }

        System.out.println("KM media percorrida");

        if (auto.getKmmes().contains("1500")) {
            navegador.findElement(By.xpath("//*[contains(@for, 'kmrodados-ENTRE_15_E_50_DIA_OU_500_a_1500_MES')]")).click();

        } else {
            if (auto.getKmmes().contains("500")) {
                navegador.findElement(By.xpath("//*[contains(@for, 'kmrodados-ATE_15_DIA_OU_500_MES')]")).click();

            } else {
                navegador.findElement(By.xpath("//*[contains(@for, 'MAIS_DE_50_DIA_OU_MAIS_1500_MES')]")).click();
            }

        }

        System.out.println("ANTIFURTO");
        navegador.findElement(By.xpath("//*[contains(@for, 'chkantifurto_N')]")).click();
        sleep(1000);

        System.out.println("BOTAO CONTINUAR");
       // navegador.findElement(By.id("btn-continuar-qar")).click();
       navegador.findElement(By.xpath("/html/body/div[2]/div/form/div[1]/div[6]/div[2]/a[2]")).click();

    }
}
