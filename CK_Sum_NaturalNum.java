import java.util.*;
import java.io.*;
class CK_Sum_NaturalNum
{
    public static void main(String[] args)
    {
       int out=0;
      System.out.println("ENTER THE LENGTH");
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      for(int i=0;i<n;i++)
      {
          out+=i;   
      }
    System.out.println("SUM OF NATURAL NUM IS:"+out);
    }
}