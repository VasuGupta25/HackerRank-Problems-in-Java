import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger bigInteger=new BigInteger(n);
        Boolean b;
        b=bigInteger.isProbablePrime(1);
        if(b==true){
            System.out.println("prime");
        
        }
        else{
            System.out.println("not prime");
        }
        
        scanner.close();
    }
}

///https://www.hackerrank.com/challenges/java-primality-test/problem
