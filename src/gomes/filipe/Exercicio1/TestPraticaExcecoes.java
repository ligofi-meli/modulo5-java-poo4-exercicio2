package gomes.filipe.Exercicio1;

public class TestPraticaExcecoes {
    public static void main(String[] args){
        PraticaExcecoes praticaExcecoes = new PraticaExcecoes();

        try {
            System.out.println(praticaExcecoes.calculoQuociente());
        } catch(Exception exception) {
            System.out.println("Ocorreu um erro !");
        } throw new IllegalArgumentException(
                "O numerador " + praticaExcecoes.b + " não pode ser dividido pelo denominador " + praticaExcecoes.a
        );
    }
}
