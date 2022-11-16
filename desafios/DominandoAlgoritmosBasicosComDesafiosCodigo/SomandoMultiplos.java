package desafios.DominandoAlgoritmosBasicosComDesafiosCodigo;

import java.util.Scanner;

public class SomandoMultiplos {

    public static void main(String[] args) {
        int A, N, soma_multiplos = 0;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            if (i % A == 0) {
                soma_multiplos = soma_multiplos + i;
            }
        }
        System.out.println(soma_multiplos);

        // TODO: Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".
    }

}
