package test;

import auto.CoberturasAuto;
import auto.DadosAutoTela1;
import auto.DadosPerfil;
import auto.RestricaoImpressao;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import telas.CoberturasEmpresarial;
import telas.ConsultarCotacao;
import telas.DadosdoSegurado;
import telas.Login;
import utilidade.*;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class TestBradesco {


    @BeforeClass
    public static void inicioDistribuir() throws IOException {
        Distribuir distribuir = new Distribuir();
        distribuir.distribuirArquivos();

    }

    @Test
    public void iniciarBradesco() throws InterruptedException, IOException {

        WebDriver navegador = null;
        boolean verificafim = true;


        //instanciando classes
        LerArquivos ler = new LerArquivos();
        LerArquivosAuto lerauto = new LerArquivosAuto();
        ConsultarCotacao consulta = new ConsultarCotacao();
        DadosdoSegurado dadosseg = new DadosdoSegurado();
        DadosAutoTela1 dadostela1 = new DadosAutoTela1();
        CoberturasAuto cobauto = new CoberturasAuto();
        RestricaoImpressao VerRestricaoAuto = new RestricaoImpressao();
        DadosPerfil dadosPerfil = new DadosPerfil();
        SalvaPDF fazpdf = new SalvaPDF();
        CoberturasEmpresarial cobertura = new CoberturasEmpresarial();
        Login acesso = new Login();
        Diretorios vardir = new Diretorios();


        //fim instanciando classe

        // retornar objeto navegador
        navegador = Navegador.navegador();
        // pegar resumo, matriz e login
        VariaveisConfiguracao config = ler.lerConfiguracoes();
        //realizar login na pagina
        acesso.realizarLogin(navegador, config);
        //consultar calculo
        ArrayList<String> listaNr = null;


        while (verificafim) {
            try {

                // carrega arquivos da pasta
                switch (config.getSegmento()) {
                    case "EMPRESARIAL":
                        consulta.realizarConsulta(navegador, config);
                        //carregar no array os arquivos da pasta arquivos
                        listaNr = ler.carregarArquivos();
                        break;
                    case "AUTO":
                        listaNr = lerauto.carregarArquivosauto();
                        break;
                }

                if (listaNr.size() == 0) {
                    JOptionPane.showMessageDialog(null, "Acabou!");
                    verificafim = false;
                    navegador = null;
                } else {


                    //limpar pasta download
                    fazpdf.deletarArquivosDownload();

                    if (listaNr.size() == 0) {
                        JOptionPane.showMessageDialog(null, "Acabou!");
                    } else {
                        switch (config.getSegmento()) {
                            case "AUTO":
                                //primeira tela dados do segurado
                                VariaveisAuto auto = lerauto.LerArquivoAuto(listaNr.get(0));
                                dadostela1.dadossegurado(navegador, auto, config);
                                dadosPerfil.perfilauto(navegador, auto, config);
                                cobauto.alteracob(navegador, auto, config);
                                if (VerRestricaoAuto.VerificaRestricao(navegador, auto, config, listaNr.get(0))) {
                                    fazpdf.moverPdfDownloadParaPastaPdf(auto, listaNr.get(0));
                                }

                                ler.verificaseCalculou(listaNr.get(0));
                                navegador.switchTo().defaultContent();
                                sleep(1000);
                                navegador.findElement(By.id("auto-cotacoes")).click();
                                sleep(1000);
                                navegador.findElement(By.id("auto-cotacoes-cotacaoauto")).click();
                                sleep(1000);

                                break;
                            case "EMPRESARIAL":
                                //aqui ler do ramo rd
                                Variaveis param = ler.lerArquivo(listaNr.get(0));
                                //alterar os dados do segurado cnpje  atividade
                                dadosseg.trocaCNPJ(navegador, param, config);
                                //alterar os valores das coberturas
                                cobertura.TrocarCoberturas(navegador, param, config);
                                //verifica restricao
                                VerificaRestricao.VerRestricao(navegador, param, config);
                                //vai deketar downloads antigos
                                Impressao.imprimir(navegador, vardir, config);
                                break;
                            case "RESIDENCIAL":
                                //aqui ler do ramo rd
                                //Variaveis param = ler.lerArquivo(listaNr.get(0));
                                //alterar os dados do segurado cnpje  atividade
                                //dadossegressid.trocaCNPJ(navegador, param, config);
                                break;
                            case "CONDOMINIO":

                                break;

                            default:
                                throw new IllegalStateException("Unexpected value: " + config.getSegmento());
                        }

                    }

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                navegador.close();
                navegador.quit();
                System.gc();
                System.out.println("reconetar");
                navegador = Navegador.navegador();
                continue;
            }
        }
    }
}
