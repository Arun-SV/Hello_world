import java.io.*;
import java.util.*;
class CK_Str_Rev_AND_Parse
{
 public static void main(String args[])
 {
     System.out.println("ENTER A STRING:");
     Scanner s=new Scanner(System.in);
     String str=s.nextLine();
     String rev="";
     int n=str.length();
     for(int i=n-1;i>=0;i--)
     {
         rev=rev+str.charAt(i)+"-";
     } 
     System.out.println("OUTPUT IS= "+rev);
 }
}