import java.io.*;
import java.util.*;

class Assi_Average_Of_Array
{
  public static void main(String[] args)
  {
   int sum,average;
    System.out.println("ENTER THE NUBER OF ELEMENTS:");
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    System.out.println("ENTER THE "+n+" ELEMENTS:");
int[] Arr=new int[n];
    for(int i=0;i<n;i++)
    { 
      Arr[i]=s.nextInt();
    
    }
    int temp=0;
    for(int i=0;i<n;i++)
    {
     temp+=Arr[i];
    }
   average=temp/n;  
   System.out.println("AVERAGE="+average);
  } 
 } 