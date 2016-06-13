import java.util.*;
import java.io.*;

class Assi_LCM
{
 public static void main(String[] args)
 {
   int a,b,lcm=0;
   System.out.println("ENTER THE NUMBERS:");
   Scanner s=new Scanner(System.in);
   a=s.nextInt();
   b=s.nextInt();
   for(int i=0; i<a*b ;i++)
    {
      if(i%a==0 && i%b==0)
       lcm=i;
      else
       lcm=a*b;
     }
   System.out.println("LCM OF "+a+" and "+b+" is :"+lcm);
  }
}