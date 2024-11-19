import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        obj.nextLine();
        while(t-->0)
        {
            String s = obj.nextLine();
            String t1 = obj.nextLine();
            for(int i =0;i<s.length();i++)
            {
                if(s.charAt(i)==t1.charAt(i)) System.out.print("G");
                else System.out.print("B");
            }
            System.out.println();
        }
    }
}
