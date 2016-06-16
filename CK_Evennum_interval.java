import java.util.*;
import java.io.*;
class CK_Evennum_interval
{
  public static void main(String[] args)
  {
    System.out.println("ENTER THE MINIMUM RANGE:");
    Scanner s=new Scanner(System.in);
    int n1=s.nextInt();
    System.out.println("ENTER THE MAXIMUM RANGE:");
    int n2=s.nextInt();
    System.out.println("ODD NUMBERS ARE");
     for(int i=n1;i<=n2;i++)
     {
         if(i%2==0)
           System.out.println(i);
     }
  }
}