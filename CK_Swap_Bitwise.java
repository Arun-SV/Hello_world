import java.io.*;
import java.util.Scanner;
class CK_Swap_Bitwise
{
 public static void main(String[] args)
 {
  System.out.println("ENTER THE INTEGERS: ");
  Scanner s=new Scanner(System.in);
  int a=s.nextInt();
  int b=s.nextInt();
  System.out.println("BEFORE SWAPPING: \na="+a+"\nb="+b);
  a=a^b;
  b=a^b;
  a=a^b;
  System.out.println("ON SWAPPING:\na="+a+"\nb="+b);
 }
}
