/*17 - ) A number X is said to be ‘seed’ of number Y if multiplying 
X by its digit equates to Y. For example, 123 is a seed of 738 coz
123*1*2*3 = 738. Now given a number find all its ‘seed’. - (posted by T.B.Nanda)*/ 
import java.util.*;
import java.io.*;
class CKP_PROGRAM17
{
    public static void main(String[] args)
    {
        int n;
        System.out.println("ENTER A NUMBER:");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(int i=1;i<n;i++)
        {
            int len=length(i) ;
            int x=0,mux=1;
            int temp=i;
            for(int j=0;j<len;j++)
            {
               x=temp%10;
               mux=mux*x;
               temp=temp/10;           
            }
            int p=i*mux;
            if(p==n)
            {
            System.out.println("THE SEED FOR THE NUMBER << "+n+" >> IS << "+i+" >>");
            }
        }
    }
       static int length(int a)
     {
        int count=0;
        while(a!=0)
         {
            count++;
            a=a/10;   
         }return count;
     }
    
}