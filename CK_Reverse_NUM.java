//REVERSE THE NUM
import java.util.Scanner;
import java.io.*;
class CK_Reverse_NUM
{
 public static void main(String[] args) 
 {
 int num,y=0,intLength;
 System.out.println("ENTER THE NUMBER");
 Scanner s=new Scanner(System.in);
 num=s.nextInt();
 intLength=Integer.toString(num).length();
 int x=num;
 for(int i=0;i<intLength;i++)
  {
   num=x%10;
   y=(y*10)+num;
   x=x/10;     
  }
 System.out.println(y);
 }
}