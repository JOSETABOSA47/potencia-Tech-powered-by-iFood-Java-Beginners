package desafios.DominandoAlgoritmosIntermediariosComDesafiosCodigo;

import java.util.Scanner;

public class ValidParentheses {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean caracter = ehValido(scanner.nextLine());

        System.out.println(caracter);
    }

    public static boolean ehValido(String s) {
        if (s.indexOf("[") == 0 && s.lastIndexOf(']') == (s.length() - 1)) {
            return true;
        } else if (s.indexOf("(") == 0 && s.lastIndexOf(')') == (s.length() - 1)) {
            return true;
        } else if (s.indexOf("{") == 0 && s.lastIndexOf('}') == (s.length() - 1)) {
            return true;
        }
        return false;
    }
}
