import java.util.*;
import java.io.*;

class CK_Armstrong_Num_Range
{
    public static void main(String[] args)
    {  
       System.out.println("ENTER A Min RANGE:");
       Scanner s=new Scanner(System.in);
       int n1=s.nextInt();
       System.out.println("ENTER A Max RANGE:");
       int n2=s.nextInt(); 
       for(int i=n1;i<=n2;i++)
       {
          int l=len(i);
          //System.out.println("LENGTH="+l);
          int temp=i,sum=0;
          int x=0;
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
           if(i==sum)
         {
            System.out.println(i+" IS ARMSTRONG NUMBER.");
         }
       
       }
       //System.out.println("SUM IS "+sum);
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