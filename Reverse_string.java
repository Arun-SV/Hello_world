//REVERSE THR STRING
import java.util.Scanner;
import java.io.*;
class Reverse_string
 {
  public static void main(String[] args)
  {
   String original,reverse="";
   System.out.println("ENTER A STRING :");
   Scanner s=new Scanner(System.in);
   original=s.nextLine();
   for(int i=(original.length())-1;i>=0;i--)
    {
     reverse=reverse+original.charAt(i);
     }
 System.out.println("Reverse String="+reverse);
  }
 }