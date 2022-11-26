package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilidade.VariaveisAuto;
import utilidade.VariaveisConfiguracao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.Thread.sleep;

public class RestricaoImpressao {
    public boolean VerificaRestricao(WebDriver navegador, VariaveisAuto auto, VariaveisConfiguracao config, String nrlinha) throws InterruptedException, IOException {
        int restricao;
        {
            System.out.println("VOU imprimir");

            sleep(5000);

            //vou tratar aqui a restricao
            restricao = 0;
            try {
                navegador.findElement(By.xpath("//*[contains(@data-analytics-label, 'Botão | Seguro Auto Tradicional | Imprimir')]"));
                System.out.println("Calculou...sem restrição");
                System.out.println("Calculou...vou imprimir");
                navegador.findElement(By.xpath("//*[contains(@data-analytics-label, 'Botão | Seguro Auto Tradicional | Imprimir')]")).click();

                restricao = 0;
                //não tem restriçao


            } catch (Exception e) {


                navegador.findElement(By.xpath("//*[contains(text(), 'Risco nao se enquadra em nossos criterios de aceitacao.')]"));
                restricao = 1;
                String Motivorestricao = "Risco nao se enquadra em nossos criterios de aceitacao";
                //aqui tratar para mover o arquivo para pasta restricao
                String nomeComputador = System.getProperty("user.name");
                File file = new File("/home/robertinho/bradesco_rd/arquivos/" + nrlinha);
                FileWriter arq = new FileWriter("/home/" + nomeComputador + "/bradesco_rd/erro/" + nrlinha);
                PrintWriter gravarArq = new PrintWriter(arq);
                gravarArq.println(Motivorestricao);
                gravarArq.flush();
                gravarArq.close();

                File fileerro = new File("/home/" + nomeComputador + "/bradesco_rd/erro/" + nrlinha);
                File filearquivo = new File("/home/" + nomeComputador + "/bradesco_rd/arquivos/" + nrlinha);
                if (fileerro.exists() && fileerro.isFile()) {
                    filearquivo.delete();

                }
            }
        }
        return restricao == 0;
    }
}

