import java.util.*;
import java.io.*;
class Palindrome_int
{
  public static void main(String[] args)
 {
  int z,y=0,num,ilength;
  Scanner s=new Scanner(System.in);
  System.out.println("ENTER A INTEGER: ");
  z=s.nextInt();
  ilength=Integer.toString(z).length();
  int x=z;
  System.out.println("LENGTH:"+ilength); 
  for(int i=0;i<ilength;i++)
  {
   num=x%10;
   y=(y*10)+num;
   x=x/10;     
  }
 if(z==y)
  System.out.println("PALINDROME");
 else
  System.out.println("NOT A PALINDROME");

 }
}