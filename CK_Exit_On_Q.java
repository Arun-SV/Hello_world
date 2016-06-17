import java.io.*;
import java.util.Scanner;
class CK_Exit_On_Q
{
 public static void main(String[] args)
 {
  Scanner s=new Scanner(System.in);
  char[] ch=new char[1000]; 
  for(int i=0;i<1000;i++)
  {
      System.out.println("ENTER THE CHARACTER:");
      ch[i]=s.next().charAt(0);
      if(ch[i]=='Q'|| ch[i]=='q')
       {
         System.out.println("<<<<<<< PROGRAMS GETS EXITED >>>>>>>>");
         break;
       }
  }
 }
}
