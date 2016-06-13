import java.util.*;
import java.io.*;

class CK_Repeated_Element
{
 public static void main(String[] args)
 {
  System.out.println("ENTER THE NUMBER OF ELEMENTS IN ARRAY: ");
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  Sorting_Array obj=new Sorting_Array();
  int[] Arr=new int[n];
  System.out.println("ENTER THE ELEMENTS:");
  for(int i=0;i<n;i++)
   {
     Arr[i]=s.nextInt();
    }
  for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
       {
         if(Arr[i]==(Arr[j]))
          { 
            System.out.println("REPEATED ELEMENT:"+Arr[j]);
           }
          else
            continue;
        }
     } 
  }
} 