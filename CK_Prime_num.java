import java.util.*;
import java.io.*;
class CK_Prime_num
{
  public static void main(String[] args)
  {
    System.out.println("ENTER A NUMBER:");
    Scanner s=new Scanner(System.in);
    int num=s.nextInt();
    int count=0;
     for(int i=2;i<=(num/2);i++)
     {
         if(num%i==0)
         count+=1;
     }
     if(count==0)
       System.out.println(num+" IS PRIME NUMBER");
     else
        System.out.println(num+" IS NOT PRIME NUMBER BECAUSE IT HAS "+count+" DIVISORS OTHER THAN 1");
          
  }
}