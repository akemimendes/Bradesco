package utilidade;

import java.io.File;

public class CriarPastas {
    public static File criarPastaArquivos(){
        File pastaarquivos = new File("/home/robertinho/bradesco/arquivos");
        pastaarquivos.mkdir();
        return pastaarquivos;
    }
    public static File criarPastaPdf(){
        File pastaapdf = new File("/home/robertinho/bradesco/pdf");
        pastaapdf.mkdir();
        return pastaapdf;
    }
    public static File criarPastaProntos(){
        File pastaprontos = new File("/home/robertinho/bradesco/prontos");
        pastaprontos.mkdir();
        return pastaprontos;
    }
    public static File criarPastaTxt(){
        File pastatxt = new File("/home/robertinho/bradesco/txt");
        pastatxt.mkdir();
        return pastatxt;
    }
    public static File criarPastaErro(){
        File pastaerro = new File("/home/robertinho/bradesco/erro");
        pastaerro.mkdir();
        return pastaerro;
    }
    public static File criarPastaStatus(){
        File pastaerro = new File("/home/robertinho/bradesco/status");
        pastaerro.mkdir();
        return pastaerro;
    }
    public static File criarPastacotacao(){
        File pastacotacao = new File("/home/robertinho/bradesco/cotacao");
        pastacotacao.mkdir();
        return pastacotacao;
    }

}
