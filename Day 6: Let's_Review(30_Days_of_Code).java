import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            char[] chars = str.toCharArray();

            for (int j = 0; j < chars.length; j++) {
                if (j % 2 == 0) {
                    System.out.print(chars[j]);
                }
            }

        System.out.print(" ");

            for (int k = 0; k < chars.length; k++) {
                if (k % 2 != 0) {
                    System.out.print(chars[k]);
                }
            }
            System.out.println();
        }

        sc.close();
    }

}
