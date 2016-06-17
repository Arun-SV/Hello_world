import java.io.*;
import java.util.*;
class CK_Num_Of_Words_In_Line
{
 public static void main(String[] args)
 {
   System.out.println("ENTER A STRING:");
   Scanner s=new Scanner(System.in);
   String str=s.nextLine();
   String[] Arr=str.split(" ");
   int n=Arr.length;
   System.out.println("NUMBER OF WORDS IS: "+n);
 }
}