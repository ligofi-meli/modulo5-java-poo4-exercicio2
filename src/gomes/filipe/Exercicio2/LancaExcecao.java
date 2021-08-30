package gomes.filipe.Exercicio2;

public class LancaExcecao {
    public static void main(String[] args) {
        // Mensagem final
        String mensagemFinal = "Esta é a última mensagem";

        // Código lança exceção
        int[] numeros = new int[5];
        numeros[5] = 10;

        try{
            numeros[5] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(mensagemFinal);
        }
    }
}
