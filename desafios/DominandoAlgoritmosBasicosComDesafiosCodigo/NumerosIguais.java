// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

//TODO: Imprima se os valores numéricos passados são iguais ou não.
package desafios.DominandoAlgoritmosBasicosComDesafiosCodigo;

import java.util.*;

public class NumerosIguais {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (A == B) {
            System.out.println("Sao iguais!");
        } else {
            System.out.println("Nao sao iguais!");
        }
    }
}