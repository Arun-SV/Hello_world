import java.util.*;
import java.io.*;

class CK_Armstrong_Num
{
    public static void main(String[] args)
    {
       System.out.println("ENTER A NUMBER");
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int l=len(n);
       System.out.println("LENGTH="+l);
       int temp=n,sum=0;
       int x;
      while(temp!=0)
       {
           int y=1;
          x=temp%10;
          for(int j=0;j<l;j++)
            {
                y*=x;
            }
         sum=sum+y;
         temp=temp/10;
       }
       System.out.println("SUM IS "+sum);
       if(n==sum)
         {
            System.out.println(n+" IS ARMSTRONG NUMBER");
         }
         else
         {
           System.out.println(n+" IS NOT ARMSTRONG NUMBER");  
         }
    }
    static int len(int a)
    {
        int count=0;
        while(a!=0)
        {
         count++;
         a=a/10;
        }return count;
    }
}              