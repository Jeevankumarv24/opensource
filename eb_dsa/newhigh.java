import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj = new Scanner(System.in);
        int n =obj.nextInt();
        int h[] = new int[n];
        for(int i =0;i<n;i++)
        {
            h[i] = obj.nextInt();
            
        }
        int r[] = new int[n];
        for(int i=0;i<n;i++)
        {
            r[i]=-1;
            for(int j=i+1;j<n;j++)
            {
                if(h[j]>h[i])
                {
                    r[i]=h[j];
                    break;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(r[i]+" ");
        }
        
    }
}
