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
        int len=length(n);
        int temp=n;
        int x=0,mux=1;
        for(int i=0;i<len;i++)
        {
            x=temp%10;
            mux=mux*x;
            temp=temp/10;           
        }
        int p=n*mux;
       System.out.println("THE SEED FOR THE NUMBER << "+n+" >> IS << "+p+" >>");
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