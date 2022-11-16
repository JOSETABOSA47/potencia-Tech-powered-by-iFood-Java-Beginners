package desafios.DominandoAlgoritmosBasicosComDesafiosCodigo;

import java.util.Scanner;

public class BuscaSequencial {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] elementos = { 64, 137, -16, 43, 67, 81, -90, 212, 10, 75 };

        int num = leitor.nextInt();

        System.out.println(encontrarValor(elementos, num));
        // TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.

    }

    static String encontrarValor(int[] elementos, int numero) {
        String result = "";

        for (int i = 0; i < elementos.length; i++) {
            if (numero == elementos[i]) {
                result = "Achei " + numero + " na posicao " + i;
                break;
            } else {
                result = "Numero " + numero + " nao encontrado!";
            }
        }
        return result;
    }
}
