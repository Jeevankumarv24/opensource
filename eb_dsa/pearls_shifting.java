import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while(t-->0)
        {
            int n = obj.nextInt();
            int k = obj.nextInt();
            int a[] = new int[n];
            for(int i =0;i<n;i++) a[i] = obj.nextInt();
            k=k%n;
           for(int i =k;i<n;i++)
           {
               System.out.print(a[i]+" ");
           }
            for(int i =0;i<k;i++)
            {
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
}
