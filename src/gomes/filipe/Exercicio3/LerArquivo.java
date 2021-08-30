package gomes.filipe.Exercicio3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo {
    public void lerArquivo(String nomeArquivo) throws FileNotFoundException, IOException {
        String texto = null;

        BufferedReader bufferedReader = new BufferedReader(new FileReader(nomeArquivo));

        while((texto = bufferedReader.readLine()) != null) {
            System.out.println(texto);
        }
        bufferedReader.close();
    }
}
