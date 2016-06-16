import java.util.*;
import java.io.*;
class CK_Sum_N_Value
{
    public static void main(String[] args)
    {
       int out=0;
      System.out.println("ENTER THE N VALUE:");
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      for(int i=1;i<=n;i++)
      {
          out+=i;   
      }
    System.out.println("SUM OF "+n+" IS:"+out);
    }
}