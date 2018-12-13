import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        int a=A.compareTo (B);
        if(a<0){
            System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
            char[] array1=A.toCharArray();
            array1[0] = Character.toUpperCase(array1[0]);

            char[] array2 = B.toCharArray();
            array2[0] = Character.toUpperCase(array2[0]);
            String p = String.valueOf(array1);
            String q = String.valueOf(array2);

            System.out.println(p+" "+q);
    }
}



