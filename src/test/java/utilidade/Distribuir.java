package utilidade;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Distribuir {
    private String nomevm;
    private static File pastaarquivos;
    private static File pastaapdf;
    private static File pastaprontos;
    private static File pastatxt;
    private static File pastaerro;
    private static File pastastatus;
    private static File pastacotacao;
    private static File pastaimage;
    private static PrintWriter gravarArq;
    private boolean existenrcotacao;

    public void distribuirArquivos() throws IOException {
        File destpastamae = new File("/home/robertinho/bradesco");
        destpastamae.mkdir();
        pastaarquivos = CriarPastas.criarPastaArquivos();
        pastaapdf = CriarPastas.criarPastaPdf();
        pastaprontos = CriarPastas.criarPastaProntos();
        pastatxt = CriarPastas.criarPastaTxt();
        pastaerro = CriarPastas.criarPastaErro();
        pastastatus = CriarPastas.criarPastaStatus();
        pastacotacao = CriarPastas.criarPastacotacao();


        //cria arquivo com o nome da vm caso nao exista
        gravarArq = PegarNomeVm.CriarNomeVM();
        //ler o nome da vm
        nomevm = PegarNomeVm.NomeVm(nomevm);
        // caminho de onde ira pegar os arquivos
        File diretorio = new File("/run/user/1000/gvfs/smb-share:server=freenas.local,share=arquivosgerais/E/LABSEG/apolice/result/brad/PRONTOS/distribuir/" + nomevm + "/");
        File destino = new File("/home/robertinho/bradesco/arquivos/");
//distribui os arquivos para a vm
        if (diretorio.exists()) {
            FileUtils.copyDirectory(diretorio, destino);
            FileUtils.deleteDirectory(diretorio);
        }

        File directoryresumo = new File("/run/user/1000/gvfs/smb-share:server=freenas.local,share=arquivosgerais/E/LABSEG/apolice/result/brad/PRONTOS/cotacao/");
        File destresumo = new File("/home/robertinho/bradesco/cotacao/");
        destresumo.mkdir();
        FileUtils.copyDirectory(directoryresumo, destresumo);


    }
}
