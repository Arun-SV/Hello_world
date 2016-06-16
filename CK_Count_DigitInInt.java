import java.util.*;
import java.io.*;
class CK_Count_DigitInInt
{
    public static void main(String[] args)
    {
      System.out.println("ENTER THE INTEGER:");
      Scanner s=new Scanner(System.in);
      int num=s.nextInt();
      System.out.println("\n<<<<<  USING LIBRARY METHOD  >>>>>");
      int length1=Integer.toString(num).length();
      System.out.println("LENGTH OF THE INTEGER IS  :  "+length1);
      int temp=num;
      int count=0;
      while(temp!=0)
      {
          count++;
          temp=temp/10;
      }
      System.out.println("\n<<<<<  WITHOUT USING METHOD  >>>>>");
      System.out.println("LENGTH OF THE INTEGER IS  :  "+count);
    }
}