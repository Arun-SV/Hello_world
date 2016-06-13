import java.util.*;
import java.io.*;

class CK_Sorting_AND_IndexMatching
{
 public static void main(String[] args)
 {
  System.out.println("ENTER THE NUMBER OF ELEMENTS IN ARRAY: ");
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  CK_Sorting_AND_IndexMatching obj=new CK_Sorting_AND_IndexMatching();
  int[] Arr=new int[n];
  System.out.println("ENTER THE ELEMENTS:");
  for(int i=0;i<n;i++)
    {
     Arr[i]=s.nextInt();
    }
  int[] Ascending=obj.toAscending(Arr,n);
  System.out.println(">>>>>>Ascending Order>>>>>>");  
  for(int x:Ascending)
     System.out.println(x);
  for(int i=0;i<n;i++)
   {
     if(Ascending[i]==i)
       System.out.println("ELEMENT MATCHING WITH INDEX VALUE IS:"+i);
   }
  }
  public int[] toAscending(int[] A,int n)
  {
    int temp;
    for(int i=0;i<n-1;i++)
    {
      for(int j=0;j<n-i-1;j++)
       {
         if(A[j]>A[j+1])
          {
            temp=A[j];
            A[j]=A[j+1];
            A[j+1]=temp; 
           }
        }
     }
     return A;

  }
}
   