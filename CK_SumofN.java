import java.io.*;
import java.util.Scanner;
class CK_SumofN
{
 public static void main(String[] args)
 {
  System.out.println("ENTER THE INTEGER: ");
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  int sum=0;
  for(int i=1;i<=n;i++)
  {
     sum=sum+i;
  }
  System.out.println("SUM IS: "+sum);
 }
}