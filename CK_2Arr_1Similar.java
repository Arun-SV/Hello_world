import java.io.*;
import java.util.*;
class CK_2Arr_1Similar
{
 public static void main(String[] args)
 {
     System.out.println("ENTER NUMBER OF ELEMENTS IN ARRAY 1: ");
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     System.out.println("ENTER THE ELEMENTS: ");
     int[] Arr1=new int[n];
     for(int i=0;i<n;i++)
     {
        Arr1[i]=s.nextInt();
     }
     System.out.println("ENTER NUMBER OF ELEMENTS IN ARRAY 2: ");
     int m=s.nextInt();
     System.out.println("ENTER THE ELEMENTS: ");
     int[] Arr2=new int[m];
     for(int i=0;i<m;i++)
     {
         Arr2[i]=s.nextInt();
     }
      int[] Arr3=new int[m];
      int k=0;
     for(int i=0;i<n;i++)
     {
         for(int j=0;j<m;j++)
         {
             if(Arr1[i]==Arr2[j])
               {
                    Arr3[k]=Arr1[i];                   
                    k++;
               }   
                  
         }
     }
     System.out.println("ARRAY 3 ELEMENTS ARE:");
     for(int o:Arr3)
     System.out.println(o);
 }
}
