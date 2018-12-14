//https://www.hackerrank.com/challenges/java-negative-subarray/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
       {
           arr[i]=sc.nextInt();
       }
       sc.close();
       
       System.out.println(negativeSubarrays(arr));
    }

    public static int negativeSubarrays(int arr[])
    {
        int count = 0;
        for(int j=0;j<arr.length;j++)
        {
            int sum=0;
            for(int k=j;k< arr.length;k++)
            {
                sum +=arr[k];
                if(sum<0){count++;}
            }
        }
        return count;
    }
}


