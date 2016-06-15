import java.util.*;
import java.io.*;
class CK_Odd_Even
{
  public static void main(String[] args)
  {
    int a;
    System.out.println("ENTER A NUMBER:");
    Scanner s=new Scanner(System.in);
    a=s.nextInt();
    if(a%2==0)
      System.out.println(a+" IS EVEN.");
    else  
      System.out.println(a+" IS ODD.");
  }
}

