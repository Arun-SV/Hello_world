import java.util.*;
import java.io.*;

class CK_HCF
{
 public static void main(String[] args)
 {
   int a,b,hcf=0;
   System.out.println("ENTER THE NUMBERS:");
   Scanner s=new Scanner(System.in);
   a=s.nextInt();
   b=s.nextInt();
   int m =Math.min(a,b);
   System.out.println(m);
   for(int i=m; i>=1;i--)
    {
      if(a%i==0 && b%i==0)
       { 
        hcf=i;
       break;
       }
    }
   System.out.println("HCF OF "+a+" and "+b+" is :"+hcf);
  }
}