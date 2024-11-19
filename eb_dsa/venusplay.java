import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while(t-->0)
        {
            int n = obj.nextInt();
            int x = obj.nextInt();
            int c = 3*x;
            int fc = n/c;
            int rt = n%c;
            int cou = fc;
            
            if(rt >= 3 * x) cou++;
                
            System.out.println(cou);
        }
    }
}
