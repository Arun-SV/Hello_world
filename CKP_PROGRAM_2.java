/* 2 - Please get the least number after deleting k digits from the input number. 
For example, if the input number is 24635, the least number is 23 after deleting 3 digits 38 submission
*/
import java.io.*;
import java.util.*;
class CKP_PROGRAM_2
{
 public static void main(String[] args)
 {
   System.out.println("ENTER A NUMBER: ");
   Scanner s=new Scanner(System.in);
   int n=s.nextInt();
   int length=len(n);
   int temp=n, x;
   int[] Arr=new int[length];
   for(int i=length-1;i>=0;i--)
   {
      x=temp%10;
      Arr[i]=x;
      temp=temp/10;
   }
   Arrays.sort(Arr);
  //  for(int o:Arr)
  // System.out.println(o);
   System.out.println("ENTER NUMBER OF DIGITS WANT TO BE DELETED: ");
   int d=s.nextInt();
   int[] Arr2=new int[length-d];
   for(int i=0;i<length-(d);i++)
   {
     Arr2[i]=Arr[i];
   //  System.out.println(Arr2[i]);
   }
   StringBuilder SB=new StringBuilder();
   for(int num:Arr2)
   {
       SB.append(num);
   }
   int output=Integer.parseInt(SB.toString());
   System.out.println("LEAST NUMBER IS: << "+output+" >> AFTER DILETING << "+d+" >> DIGITS");

 }
  static int len(int a)
 { 
      int count=0;
     while(a!=0)
     {
         count++;
         a=a/10;
     }
     return count;
 }
}