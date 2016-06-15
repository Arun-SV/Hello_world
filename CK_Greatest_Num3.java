import java.io.*;
import java.util.*;
class CK_Greatest_Num3
{
    public static void main(String[] args)
    {
        System.out.println("ENTER THREE NUMBERS");
        int a,b,c;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        if(a>b && a>c)
          System.out.println(a+" IS GREATER.");
        else if (b>c)
           System.out.println(b+" IS GREATER.");
        else
           System.out.println(c+" IS GREATER.");
          
    }
}
