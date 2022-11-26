package telas;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilidade.Variaveis;
import utilidade.VariaveisConfiguracao;

import java.time.Duration;


public class CoberturasEmpresarial {
    public void TrocarCoberturas(WebDriver navegador, Variaveis param, VariaveisConfiguracao configuracao) {
        try {
            WebDriverWait wait = new WebDriverWait(navegador, Duration.ofMinutes(2));
            System.out.println("vou trocar lmi da basica");
            Thread.sleep(2000);

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("formCotacao:IValorRisco")));
            navegador.findElement(By.id("formCotacao:IValorRisco")).clear();
            navegador.findElement(By.id("formCotacao:IValorRisco")).sendKeys(param.getIncendio());

            Thread.sleep( 1000 );


            //if (configuracao.getAlterarLMI().contains("S")){
                System.out.println("vou trocar lmi da basica");
                System.out.println("Vou alterar demais coberturas");
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("formCotacao:tabCoberturas:0:vlrLMR")));
                Thread.sleep( 1000 );

                System.out.println("Vou alterar perda de aluguel");
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("formCotacao:tabCoberturas:1:vlrLMR")));
                Thread.sleep( 1000 );
                navegador.findElement(By.id("formCotacao:tabCoberturas:1:vlrLMR")).clear();
                Thread.sleep( 1000 );
                navegador.findElement(By.id("formCotacao:tabCoberturas:1:vlrLMR")).sendKeys(Keys.BACK_SPACE);
                navegador.findElement(By.id("formCotacao:tabCoberturas:1:vlrLMR")).sendKeys(Keys.BACK_SPACE);
                navegador.findElement(By.id("formCotacao:tabCoberturas:1:vlrLMR")).sendKeys(Keys.BACK_SPACE);
                Thread.sleep( 1000 );
                navegador.findElement(By.id("formCotacao:tabCoberturas:1:vlrLMR")).sendKeys(param.getAluguel());
                navegador.findElement(By.id("formCotacao:tabCoberturas:1:vlrLMR")).sendKeys(Keys.TAB);
                Thread.sleep( 1000 );
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("formCotacao:IPeriodoIndenitario")));
                navegador.findElement(By.id("formCotacao:IPeriodoIndenitario")).sendKeys("6");
                Thread.sleep( 1000 );
                navegador.findElement(By.id("formCotacao:IPeriodoIndenitario")).sendKeys(Keys.TAB);
                Thread.sleep( 500 );
                navegador.findElement(By.id("formCotacao:btnSalvarPI")).click();

                System.out.println("Vou alterar Vendaval");
                navegador.findElement(By.id("formCotacao:tabCoberturas:2:vlrLMR")).clear();
                navegador.findElement(By.id("formCotacao:tabCoberturas:2:vlrLMR")).sendKeys(Keys.BACK_SPACE);
                navegador.findElement(By.id("formCotacao:tabCoberturas:2:vlrLMR")).sendKeys(Keys.BACK_SPACE);
                navegador.findElement(By.id("formCotacao:tabCoberturas:2:vlrLMR")).sendKeys(Keys.BACK_SPACE);
                navegador.findElement(By.id("formCotacao:tabCoberturas:2:vlrLMR")).sendKeys(param.getVendaval());
                navegador.findElement(By.id("formCotacao:tabCoberturas:2:vlrLMR")).sendKeys(Keys.ENTER);
                Thread.sleep( 1000);

                System.out.println("Vou alterar danos eletricos");
              

                navegador.findElement(By.xpath("//*[contains(@onfocus, 'IDanoEletricos')]")).clear();
                navegador.findElement(By.xpath("//*[contains(@onfocus, 'IDanoEletricos')]")).sendKeys(Keys.BACK_SPACE);
                navegador.findElement(By.xpath("//*[contains(@onfocus, 'IDanoEletricos')]")).sendKeys(Keys.BACK_SPACE);
                navegador.findElement(By.xpath("//*[contains(@onfocus, 'IDanoEletricos')]")).sendKeys(Keys.BACK_SPACE);
                navegador.findElement(By.xpath("//*[contains(@onfocus, 'IDanoEletricos')]")).sendKeys(param.getDanosEletricos());
                navegador.findElement(By.xpath("//*[contains(@onfocus, 'IDanoEletricos')]")).sendKeys(Keys.ENTER);
                Thread.sleep( 500);

                System.out.println("Vou alterar Roubo");
                navegador.findElement(By.id("formCotacao:tabCoberturas:4:vlrLMR")).clear();
                navegador.findElement(By.id("formCotacao:tabCoberturas:4:vlrLMR")).sendKeys(Keys.BACK_SPACE);
                navegador.findElement(By.id("formCotacao:tabCoberturas:4:vlrLMR")).sendKeys(Keys.BACK_SPACE);
                navegador.findElement(By.id("formCotacao:tabCoberturas:4:vlrLMR")).sendKeys(Keys.BACK_SPACE);
                navegador.findElement(By.id("formCotacao:tabCoberturas:4:vlrLMR")).sendKeys(param.getRoubo());
                Thread.sleep( 1000);

                System.out.println("Vou alterar Roubo Valores");
                navegador.findElement(By.id("formCotacao:tabCoberturas:5:vlrLMR")).clear();
                navegador.findElement(By.id("formCotacao:tabCoberturas:5:vlrLMR")).sendKeys(Keys.BACK_SPACE);
                navegador.findElement(By.id("formCotacao:tabCoberturas:5:vlrLMR")).sendKeys(Keys.BACK_SPACE);
                navegador.findElement(By.id("formCotacao:tabCoberturas:5:vlrLMR")).sendKeys(Keys.BACK_SPACE);
                Thread.sleep( 1000);
                navegador.findElement(By.id("formCotacao:tabCoberturas:5:vlrLMR")).sendKeys(param.getRouboval());
                Thread.sleep( 1000 );

                System.out.println("Vou alterar Vidros");
                navegador.findElement(By.id("formCotacao:tabCoberturas:6:vlrLMR")).clear();
                navegador.findElement(By.id("formCotacao:tabCoberturas:6:vlrLMR")).sendKeys(Keys.BACK_SPACE);
                navegador.findElement(By.id("formCotacao:tabCoberturas:6:vlrLMR")).sendKeys(Keys.BACK_SPACE);
                navegador.findElement(By.id("formCotacao:tabCoberturas:6:vlrLMR")).sendKeys(Keys.BACK_SPACE);
                navegador.findElement(By.id("formCotacao:tabCoberturas:6:vlrLMR")).sendKeys(param.getVidros());
                Thread.sleep( 500 );

                 System.out.println("Vou alterar Alagamento");
                 navegador.findElement(By.id("formCotacao:tabCoberturas:7:vlrLMR")).clear();
                 navegador.findElement(By.id("formCotacao:tabCoberturas:7:vlrLMR")).sendKeys(Keys.BACK_SPACE);
                 navegador.findElement(By.id("formCotacao:tabCoberturas:7:vlrLMR")).sendKeys(Keys.BACK_SPACE);
                 navegador.findElement(By.id("formCotacao:tabCoberturas:7:vlrLMR")).sendKeys(Keys.BACK_SPACE);
                 navegador.findElement(By.id("formCotacao:tabCoberturas:7:vlrLMR")).sendKeys(param.getAlagamento());
                 Thread.sleep( 500 );

                 System.out.println("Vou alterar Desmoronamento");
                 navegador.findElement(By.id("formCotacao:tabCoberturas:8:vlrLMR")).clear();
                 navegador.findElement(By.id("formCotacao:tabCoberturas:8:vlrLMR")).sendKeys(Keys.BACK_SPACE);
                 navegador.findElement(By.id("formCotacao:tabCoberturas:8:vlrLMR")).sendKeys(Keys.BACK_SPACE);
                 navegador.findElement(By.id("formCotacao:tabCoberturas:8:vlrLMR")).sendKeys(Keys.BACK_SPACE);
                 navegador.findElement(By.id("formCotacao:tabCoberturas:8:vlrLMR")).sendKeys(param.getDesmoronamento());
                 Thread.sleep( 500 );

                 System.out.println("Vou alterar Equipamento");
                 navegador.findElement(By.id("formCotacao:tabCoberturas:9:vlrLMR")).clear();
                 navegador.findElement(By.id("formCotacao:tabCoberturas:9:vlrLMR")).sendKeys(Keys.BACK_SPACE);
                 navegador.findElement(By.id("formCotacao:tabCoberturas:9:vlrLMR")).sendKeys(Keys.BACK_SPACE);
                 navegador.findElement(By.id("formCotacao:tabCoberturas:9:vlrLMR")).sendKeys(Keys.BACK_SPACE);
                 navegador.findElement(By.id("formCotacao:tabCoberturas:9:vlrLMR")).sendKeys(param.getEquip());
                 Thread.sleep( 1000 );

                System.out.println("Vou alterar Rc EMPREGADOR");
                navegador.findElement(By.id("formCotacao:tabCoberturas:10:vlrLMR")).clear();
                navegador.findElement(By.id("formCotacao:tabCoberturas:10:vlrLMR")).sendKeys(Keys.BACK_SPACE);
                navegador.findElement(By.id("formCotacao:tabCoberturas:10:vlrLMR")).sendKeys(Keys.BACK_SPACE);
                navegador.findElement(By.id("formCotacao:tabCoberturas:10:vlrLMR")).sendKeys(Keys.BACK_SPACE);
                navegador.findElement(By.id("formCotacao:tabCoberturas:10:vlrLMR")).sendKeys(param.getRcempregad());
                Thread.sleep( 1000 );
                if(configuracao.getFazrcgarag().contains("SIM")){
                	System.out.println("Vou alterar RC GARAGISTA CIR");
                	navegador.findElement(By.id("formCotacao:tabCoberturas:11:vlrLMR")).clear();
                	navegador.findElement(By.id("formCotacao:tabCoberturas:11:vlrLMR")).sendKeys(Keys.BACK_SPACE);
                	navegador.findElement(By.id("formCotacao:tabCoberturas:11:vlrLMR")).sendKeys(Keys.BACK_SPACE);
                	navegador.findElement(By.id("formCotacao:tabCoberturas:11:vlrLMR")).sendKeys(Keys.BACK_SPACE);
                	navegador.findElement(By.id("formCotacao:tabCoberturas:11:vlrLMR")).sendKeys(param.getRcgarag());
                	Thread.sleep( 500 );
                	//vai digitar a quantidade de vagas
                	int rcgaragista= param.getRcgarag().length();
               		 if(rcgaragista>1) {
                    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("formCotacao:detalCobRC")));
                    	navegador.findElement(By.id("formCotacao:detalCobRC")).sendKeys("50");
                    	Thread.sleep( 1000 );
                    	navegador.findElement(By.id("formCotacao:detalCobRC")).sendKeys(Keys.TAB);
                    	Thread.sleep( 500 );
                    	navegador.findElement(By.id("formCotacao:btnConfirmarRC")).click();
                   	 }
                }
		if(configuracao.getFazrcgarag().contains("SIM")){
               		System.out.println("Vou alterar RC GARAGISTA INCENDIO ROUBO");
                	navegador.findElement(By.id("formCotacao:tabCoberturas:12:vlrLMR")).clear();
               		navegador.findElement(By.id("formCotacao:tabCoberturas:12:vlrLMR")).sendKeys(Keys.BACK_SPACE);
                	navegador.findElement(By.id("formCotacao:tabCoberturas:12:vlrLMR")).sendKeys(Keys.BACK_SPACE);
                	navegador.findElement(By.id("formCotacao:tabCoberturas:12:vlrLMR")).sendKeys(Keys.BACK_SPACE);

                	//vai digitar a quantidade de vagas
                	int rcgaragista= param.getRcgarag().length();
                	if(rcgaragista>1){
                    	navegador.findElement(By.id("formCotacao:tabCoberturas:12:vlrLMR")).sendKeys(param.getRcgarag());
                    	Thread.sleep( 500 );
                    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("formCotacao:detalCobRC")));
                    	navegador.findElement(By.id("formCotacao:detalCobRC")).sendKeys("50");
                    	Thread.sleep(1000);
                    	navegador.findElement(By.id("formCotacao:detalCobRC")).sendKeys(Keys.TAB);
                    	Thread.sleep(500);
                    	navegador.findElement(By.id("formCotacao:btnConfirmarRC")).click();

               		 }
		}

            System.out.println("Vou alterar RCCOMERCIAL");
            Thread.sleep(1000);

            navegador.findElement(By.xpath("//*[contains(@onfocus, 'IRCEstabelecimentoOperacoes')]")).clear();
            navegador.findElement(By.xpath("//*[contains(@onfocus, 'IRCEstabelecimentoOperacoes')]")).sendKeys(Keys.BACK_SPACE);
            navegador.findElement(By.xpath("//*[contains(@onfocus, 'IRCEstabelecimentoOperacoes')]")).sendKeys(Keys.BACK_SPACE);
            navegador.findElement(By.xpath("//*[contains(@onfocus, 'IRCEstabelecimentoOperacoes')]")).sendKeys(Keys.BACK_SPACE);
            navegador.findElement(By.xpath("//*[contains(@onfocus, 'IRCEstabelecimentoOperacoes')]")).sendKeys(param.getRc());
            Thread.sleep( 1000 );

            System.out.println("Vou alterar RECOMPOSICAO DOCUMENTOS");

            try{
                navegador.findElement(By.xpath("//*[contains(@onfocus, 'IDespesaRecomposicao')]"));

            navegador.findElement(By.xpath("//*[contains(@onfocus, 'IDespesaRecomposicao')]")).clear();
            navegador.findElement(By.xpath("//*[contains(@onfocus, 'IDespesaRecomposicao')]")).sendKeys(Keys.BACK_SPACE);
            navegador.findElement(By.xpath("//*[contains(@onfocus, 'IDespesaRecomposicao')]")).sendKeys(Keys.BACK_SPACE);
            navegador.findElement(By.xpath("//*[contains(@onfocus, 'IDespesaRecomposicao')]")).sendKeys(Keys.BACK_SPACE);
            navegador.findElement(By.xpath("//*[contains(@onfocus, 'IDespesaRecomposicao')]")).sendKeys(param.getRecompDctos());
            Thread.sleep( 1000 );
            }
            catch (Exception e){
                    System.out.println("Não precisa preencher questionario");
            }



            System.out.println("Vou alterar FIDELIDADE FUNCIONARIOS");
	    Thread.sleep( 1000 );
            //navegador.findElement(By.xpath("//*[contains(@onfocus, 'IFidelidade')]")).clear();
            // navegador.findElement(By.xpath("//*[contains(@onfocus, 'IFidelidade')]")).sendKeys(param.getFidelidade());
            

            //deixei pendurado para utilizar despesas extras
            // System.out.println("Vou alterar LUCROS CESSANTES");
            //navegador.findElement(By.id("formCotacao:tabCoberturas:18:vlrLMR")).clear();
            //navegador.findElement(By.id("formCotacao:tabCoberturas:18:vlrLMR")).sendKeys(Keys.BACK_SPACE);
            //navegador.findElement(By.id("formCotacao:tabCoberturas:18:vlrLMR")).sendKeys(Keys.BACK_SPACE);
            //navegador.findElement(By.id("formCotacao:tabCoberturas:18:vlrLMR")).sendKeys(Keys.BACK_SPACE);
            //navegador.findElement(By.id("formCotacao:tabCoberturas:18:vlrLMR")).sendKeys(param.getLucroCessante());
            //Thread.sleep( 500 );
            //vai digitar periodo idennitario
            //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("formCotacao:cdPeriodoIndenitario")));
            //navegador.findElement(By.id("formCotacao:cdPeriodoIndenitario")).sendKeys("6");
            //Thread.sleep( 1000 );
            //navegador.findElement(By.id("formCotacao:cdPeriodoIndenitario")).sendKeys(Keys.TAB);
            //Thread.sleep( 500 );
            //navegador.findElement(By.id("formCotacao:btnConfirmarLC")).click();

            System.out.println("Vou alterar DESPESAS EXTRAS");
            navegador.findElement(By.xpath("//*[contains(@onfocus, 'IDespesasExtradordinarias')]")).clear();
            Thread.sleep( 1000 );
            navegador.findElement(By.xpath("//*[contains(@onfocus, 'IDespesasExtradordinarias')]")).sendKeys(Keys.BACK_SPACE);
            navegador.findElement(By.xpath("//*[contains(@onfocus, 'IDespesasExtradordinarias')]")).sendKeys(Keys.BACK_SPACE);
            navegador.findElement(By.xpath("//*[contains(@onfocus, 'IDespesasExtradordinarias')]")).sendKeys(Keys.BACK_SPACE);
            navegador.findElement(By.xpath("//*[contains(@onfocus,'IDespesasExtradordinarias')]")).sendKeys(param.getLucroCessante());
            Thread.sleep( 1000 );

            System.out.println("Vou alterar RUPTURA DE TUBULACOES");
            navegador.findElement(By.xpath("//*[contains(@onfocus, 'IRuptura')]")).clear();
            navegador.findElement(By.xpath("//*[contains(@onfocus, 'IRuptura')]")).sendKeys(Keys.BACK_SPACE);
            navegador.findElement(By.xpath("//*[contains(@onfocus, 'IRuptura')]")).sendKeys(Keys.BACK_SPACE);
            navegador.findElement(By.xpath("//*[contains(@onfocus, 'IRuptura')]")).sendKeys(Keys.BACK_SPACE);
            navegador.findElement(By.xpath("//*[contains(@onfocus, 'IRuptura')]")).sendKeys(param.getTubulacoes());
            Thread.sleep( 1000 );

            System.out.println("Vou alterar LUMINOSOS");
            navegador.findElement(By.xpath("//*[contains(@onfocus, 'IAnunciosLuminosos')]")).clear();
            navegador.findElement(By.xpath("//*[contains(@onfocus, 'IAnunciosLuminosos')]")).sendKeys(Keys.BACK_SPACE);
            navegador.findElement(By.xpath("//*[contains(@onfocus, 'IAnunciosLuminosos')]")).sendKeys(Keys.BACK_SPACE);
            navegador.findElement(By.xpath("//*[contains(@onfocus, 'IAnunciosLuminosos')]")).sendKeys(Keys.BACK_SPACE);
            navegador.findElement(By.xpath("//*[contains(@onfocus, 'IAnunciosLuminosos')]")).sendKeys(param.getAnuncio());
            Thread.sleep( 1000 );

            System.out.println("Vou alterar EQUIPTOS PORTATEIS");
            //navegador.findElement(By.xpath("//*[contains(@onfocus, 'IEquipamentosPortatesSemiI')]")).clear();
            //navegador.findElement(By.xpath("//*[contains(@onfocus, 'IEquipamentosPortatesSemiI')]")).sendKeys(Keys.BACK_SPACE);
            //navegador.findElement(By.xpath("//*[contains(@onfocus, 'IEquipamentosPortatesSemiI')]")).sendKeys(Keys.BACK_SPACE);
            //navegador.findElement(By.xpath("//*[contains(@onfocus, 'IEquipamentosPortatesSemiI')]")).sendKeys(Keys.BACK_SPACE);
            //navegador.findElement(By.xpath("//*[contains(@onfocus, 'IEquipamentosPortatesSemiI')]")).sendKeys(param.getEqtoPortateis());)
           // Thread.sleep( 500 );

            // }

            System.out.println("nao leu alterar lmi");

            System.out.println("vou clicar em calcular");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("formCotacao:btnCalcular")));

            navegador.findElement(By.id("formCotacao:btnCalcular")).click();



            Thread.sleep( 4000 );


        }
             catch (Exception e) {

        }

    }
}
