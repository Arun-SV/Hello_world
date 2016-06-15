import java.util.Scanner;
import java.io.*;
class CK_Reverse_OrderOfWord_string
 {
  public static void main(String[] args)
  {
   String original,orev="";
   System.out.println("ENTER A STRING :");
   Scanner s=new Scanner(System.in);
   original=s.nextLine();
   String[] Arr=original.split(" ");
   for(int i=Arr.length-1;i>=0;i--)
     {
       orev=orev+" "+Arr[i];
     }
     System.out.println("REVERSED ORDER OF WORDS IN STRING IS:\n"+orev);
  }
 } 
