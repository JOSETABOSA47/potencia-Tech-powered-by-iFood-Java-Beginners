package desafios.DominandoAlgoritmosIntermediariosComDesafiosCodigo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ClassificandoMatrizes {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int i;
        int N = input.nextInt();
        int[] nums = new int[N];
        for (i = 0; i < N; i++) {
            nums[i] = input.nextInt();
        }
        // TODO: mova todos os inteiros pares para o inicio do array, seguido por todos
        // os números ímpares
        int jo = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                nums[i] = nums[i] ^ nums[jo] ^ (nums[jo] = nums[i]);
                jo++;
            }
        }

        int[] jj = new int[nums.length];
        int p = 0;
        int j = 0;
        int x = 0;
        boolean find;
        while (p < nums.length) {
            if (p == 0) {
                jj[j] = nums[p];
                j++;
            } else {
                x = 0;
                find = false;
                while (x < j && find == false) {
                    if (jj[x] == nums[p]) {
                        find = true;
                    }
                    x++;
                }
                if (find == false) {
                    jj[j] = nums[p];
                    j++;
                }
            }
            p++;
        }
        nums = Arrays.copyOf(jj, j);
        for (int r : nums) {
            System.out.println(r);
        }
    }

}
