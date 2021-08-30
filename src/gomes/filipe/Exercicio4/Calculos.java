package gomes.filipe.Exercicio4;

import java.util.Random;

public class Calculos {

    Random aleatorio = new Random();

    public void maiorEntreDoisNumeros(double x, double y) {
        System.out.println("--- Maior entre dois números ---");
        System.out.println("x = " + x + " e y =  " + y + " maior é "  + Math.max(x, y));
    }

    public void menorEntreDoisNumeros(double x, double y) {
        System.out.println("--- Menor entre dois números ---");
        System.out.println("x = " + x + " e y =  " + y + " menor é "  + Math.min(x, y));
    }

    public void potencia(double x, double y) {
        System.out.println("--- Potência entre dois números ---");
        System.out.println("x = " + x + " e y =  " + y + " potência é " + Math.pow(x, y));
    }

    public void cosseno(double x) {
        System.out.println("---Cosseno de um número ---");
        System.out.println("x = " + x + " e cosseno é " +Math.cos(x));
    }

    public void raizQuadrada(double x) {
        System.out.println("--- Raíz quadrada de um número ---");
        System.out.println("sqrt " + x + " = " + Math.sqrt(x));
    }

    public void numeroAleatorio() {
        System.out.println("--- Número aleátorio entre 0 e 1000 ---");
        System.out.println(aleatorio.nextInt(1000));
    }
}
