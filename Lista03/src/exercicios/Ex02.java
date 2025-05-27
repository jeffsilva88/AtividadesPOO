
/*Crie um programa em Java que imprima todos os números de 1 à 100 e 
diga se o número é par ou ímpar. */

package exercicios;

public class Ex02 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " é par");
            } else {
                System.out.println(i + " é ímpar");
            }
        }
    }
}
