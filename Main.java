import java.util.*;
class Jav{
  public static void main(String[] args)
  {
    Scanner obj = new Scanner(System.in);
    //obj.nextInt();
    int n = obj.nextInt();
    int a[]= new int[n];
    int sum=0;
    for(int i =0;i<n;i++)
      {
        a[i]= obj.nextInt();
        sum+=a[i];
      }
    System.out.println(sum);
  }
}
