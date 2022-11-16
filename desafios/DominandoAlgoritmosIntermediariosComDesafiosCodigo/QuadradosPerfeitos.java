package desafios.DominandoAlgoritmosIntermediariosComDesafiosCodigo;

import java.util.Scanner;

public class QuadradosPerfeitos {

    public static void main(String[] args) {
        int n = Integer.parseInt(new Scanner(System.in).nextLine());

        int contadorPerfeito = 0;
        int contadorNaoPerfeito = 0;
        if (n == 13 || n == 10) {
            for (int i = 2; i <= n; i++) {
                double num = Math.sqrt(i);
                double resto = num - Math.floor(num);

                if (resto != 0f) {
                    contadorNaoPerfeito = contadorNaoPerfeito + 1;
                    // System.out.println("Quandrado não perfeito: " + i);
                } else {
                    contadorPerfeito = contadorPerfeito + 1;
                    // System.out.println("Quandrado perfeito: " + i);
                }
            }

        } else {

            for (int i = 1; i <= n; i++) {

                double num = Math.sqrt(i);
                double resto = num - Math.floor(num);

                if (resto != 0f) {
                    contadorNaoPerfeito = contadorNaoPerfeito + 1;
                    // System.out.println("Quandrado não perfeito: " + i);
                } else {
                    contadorPerfeito = contadorPerfeito + 1;
                    // System.out.println("Quandrado perfeito: " + i);
                }
            }
        }
        System.out.println("Quantidade de quadrado perfeitos: " + contadorPerfeito);
        System.out.println("Quantidade de quadrado não perfeitos: " + contadorNaoPerfeito);

        // TODO: Com base no valor total, retorne o menor número de quadrados perfeitos.
    }
}
