import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner obj = new Scanner(System.in);
		int x = obj.nextInt();
		int y = obj.nextInt();
		int z = obj.nextInt();
		if(x+y<=z)
		{
		    System.out.println(x*2+y*3);
		}
		else 
		{
		    System.out.println(z*2+y);
		}

	}
}
