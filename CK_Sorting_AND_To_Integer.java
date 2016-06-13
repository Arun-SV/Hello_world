import java.util.*;
import java.io.*;

class CK_Sorting_AND_To_Integer
{
 public static void main(String[] args)
 {
  System.out.println("ENTER THE NUMBER OF ELEMENTS IN ARRAY: ");
  Scanner s=new Scanner(System.in);
  int n=s.nextInt();
  CK_Sorting_To_Integer obj=new CK_Sorting_To_Integer();
  int[] Arr=new int[n];
  System.out.println("ENTER THE ELEMENTS:");
  for(int i=0;i<n;i++)
    {
     Arr[i]=s.nextInt();
    }
  int[] Descending=obj.toDescending(Arr,n);
  System.out.println(">>>>>>Descending Order>>>>>>");  
  for(int x:Descending)
     System.out.println(x); 
 
  StringBuilder strNum = new StringBuilder();
  for (int num : Descending) 
   {
     strNum.append(num);
   }
  int finalInt = Integer.parseInt(strNum.toString());  
  System.out.println("HIGHEST NUMBER POSSIBLE:"+finalInt);

 }
public int[] toDescending(int[] A,int n)
  {
    int temp;
    for(int i=0;i<n-1;i++)
    {
      for(int j=0;j<n-i-1;j++)
       {
         if(A[j]<A[j+1])
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