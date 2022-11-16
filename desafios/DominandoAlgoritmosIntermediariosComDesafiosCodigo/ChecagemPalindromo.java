package desafios.DominandoAlgoritmosIntermediariosComDesafiosCodigo;

import java.util.Scanner;

public class ChecagemPalindromo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();

        System.out.println(palindromoString(palavra));

        // TODO: Retorne TRUE ou FALSE, caso a "palavra" seja ou não um Palíndromo.
    }

    static String palindromoString(String nome) {
        String nome_invertido = new StringBuilder(nome).reverse().toString();
        // COMPARETO retorna um valor zero se o valor for igual e do mesmo tamanho,
        // um valor negativo se for desigual um valor maior que zero se for desigual
        if (nome.compareTo(nome_invertido) == 0) {
            return "TRUE";
        }
        return "FALSE";
    }
}
