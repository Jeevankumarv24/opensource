import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner obj = new Scanner(System.in);
		int  t= obj.nextInt();
		while(t-->0)
		{
		    int x = obj.nextInt();
		    int y = obj.nextInt();
		    int t1 = x*y;
		    if(t1%10==0||t1%11==0||t1%12==0||(y-10)%10==0||(y-11)%10==0||(y-12)%10==0||(y-10)%11==0||(y-11)%11==0||(y-12)%11==0||(y-10)%12==0||(y-11)%12==0||(y-12)%12==0)
		    {
		        
		        System.out.println("YES");
		    }
		    else System.out.println("NO");
		    
		}

	}
}
