package gomes.filipe.Exercicio3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LancaExcecaoDeLeitura {
    public static void main(String[] args) {
        try {
            lerArquivo("Tratando exceptions");
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("O arquivo específicado não foi encontrado");
        } catch (IOException exception) {
            System.out.println("Error ao lero arquivo especifícado");
        }
    }

    public static void lerArquivo(String nomeArquivo) throws IOException, FileNotFoundException {
        String texto = null;

        BufferedReader bufferedReader = new BufferedReader(new FileReader(nomeArquivo));

        while((texto = bufferedReader.readLine()) != null) {
            System.out.println(texto);
        }
        bufferedReader.close();
    }


}
