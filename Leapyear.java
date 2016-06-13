import java.io.*;
import java.util.Scanner;

class Leapyear
{
 public static void main(String[] args)
 {
   int year;
   System.out.println("ENTER THE YEAR");
   Scanner s=new Scanner(System.in);
   year=s.nextInt();
   if((year%4==0 && year%100!=0) || (year%400==0))
    {
      System.out.println(year+" IS A LEAP YEAR");
       } 
   else
      System.out.println(year+" IS NOT  A LEAP YEAR");
     
 }
}