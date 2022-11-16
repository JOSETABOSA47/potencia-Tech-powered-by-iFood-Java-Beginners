package desafios.DominandoAlgoritmosBasicosComDesafiosCodigo;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);

        int num = number.nextInt();

        System.out.println(multiplos(num));

        // TODO: Retorne a palavra correta de acordo com o múltiplo de "num".
        // Caso o valor não seja múltiplo de 3 ou 5, exiba o número, conforme o
        // enunciado.

    }

    static String multiplos(int numero) {
        if (numero % 3 == 0 && numero % 5 == 0) {
            return "FizzBuzz";
        } else if (numero % 3 == 0 && numero % 5 != 0) {
            return "Fizz";
        } else if (numero % 5 == 0 && numero % 3 != 0) {
            return "Buzz";
        }
        return Integer.toString(numero);
    }
}
