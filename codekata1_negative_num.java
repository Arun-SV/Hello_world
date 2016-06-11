/*1.code kata FIND NEGATIVE NUMBER*/
import java.util.Scanner;
import java.io.*;
class codekata1_negative_num
{
 public static void main(String[] args)
  {
    int num;
    System.out.println("ENTER THE NUMBER:: ");
    Scanner sc=new Scanner(System.in);
    num=sc.nextInt();
    if(num!=0)
    {
      if(num>0)
          System.out.println(num+" IS POSITIVE NUMBER");
       else
          System.out.println(num+" IS NEGATIVE NUMBER");  
    }
   else
        System.out.println("YOU ENTERED ZERO"); 
  }
}













