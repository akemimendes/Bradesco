package utilidade;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LerArquivosAuto {

    private String nrlinha;
    public ArrayList carregarArquivosauto() {

        ArrayList<String> listaNrlinha = new ArrayList<String>();

        File[] files = new File("/home/robertinho/bradesco_rd/arquivos/").listFiles();
        try {
            for (File file : files) {
                listaNrlinha.add(file.getName());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listaNrlinha;
    }


    public VariaveisAuto LerArquivoAuto (String nrlinha) throws IOException {

        this.nrlinha = nrlinha;
        VariaveisAuto Auto = new VariaveisAuto();

        File file = new File("/home/robertinho/bradesco_rd/arquivos/" + nrlinha);

        if (file.exists()) {
            Scanner ler = new Scanner("/home/robertinho/bradesco_rd/arquivos/" + nrlinha);
            String arquivo = ler.nextLine();
            FileReader arq = new FileReader(arquivo);
            BufferedReader lerArq = new BufferedReader(arq);

            Auto.setNomeauto(lerArq.readLine());
            Auto.setCpfauto(lerArq.readLine());
            Auto.setcepauto(lerArq.readLine());
            Auto.setdatanasc(lerArq.readLine());
            Auto.setestcivil(lerArq.readLine());
            Auto.setsexo(lerArq.readLine());
            Auto.settiposeguro(lerArq.readLine());
            Auto.setbonus(lerArq.readLine());
            Auto.setfranquia(lerArq.readLine());
            Auto.setanofabrica(lerArq.readLine());
            Auto.setZero(lerArq.readLine());
            Auto.setveiculo(lerArq.readLine());
            Auto.setmarca(lerArq.readLine());
            Auto.setfipe(lerArq.readLine());
            Auto.setcongenere(lerArq.readLine());
            Auto.setisdm(lerArq.readLine());
            Auto.setchassi(lerArq.readLine());
            lerArq.readLine();
            Auto.setisdc(lerArq.readLine());
            Auto.setcomissao(lerArq.readLine());
            Auto.settipoass(lerArq.readLine());
            lerArq.readLine();
            lerArq.readLine();
            Auto.settipovidros(lerArq.readLine());
            Auto.setgrgres(lerArq.readLine());
            Auto.setgrgtrab(lerArq.readLine());
            Auto.setgrgescola(lerArq.readLine());
            Auto.setcomercial(lerArq.readLine());
            Auto.setcombustivel(lerArq.readLine());
            Auto.setapp(lerArq.readLine());
            Auto.settiporeser(lerArq.readLine());
            Auto.setresid(lerArq.readLine());
            Auto.setqtdveic(lerArq.readLine());
            Auto.settipopessoa(lerArq.readLine());
            Auto.setprofissao(lerArq.readLine());
            Auto.setsinistro(lerArq.readLine());
            Auto.setdmo(lerArq.readLine());
            Auto.setantifurto(lerArq.readLine());
            Auto.setCpfcond(lerArq.readLine());
            Auto.setdatacond(lerArq.readLine());
            lerArq.readLine();
            lerArq.readLine();
            lerArq.readLine();
            lerArq.readLine();
            lerArq.readLine();
            lerArq.readLine();
            lerArq.readLine();
            lerArq.readLine();
            lerArq.readLine();
            lerArq.readLine();
            lerArq.readLine();

            Auto.setkmmes(lerArq.readLine());
            Auto.setportas(lerArq.readLine());



        }

        return Auto;
    }
}