import java.util.*;
import java.io.*;

class CKH_24_Target_Num
{
   public static void main(String[] args)
   {
     Scanner s=new Scanner(System.in);
     System.out.println("ENTER THE NUMBER OF ELEMENTS");
     int n=s.nextInt();
     System.out.println("Enter the Elements");
     int[] Arr=new int[n];
     for(int i=0;i<n;i++)
     {
       Arr[i]=s.nextInt();
     }
     System.out.println("\n<<<< Enter the TARGET Number >>>>");  
     int m=s.nextInt();
     for(int i=0;i<Arr.length-1;i++)
     {
       if(Arr[i]+Arr[i+1]==m)
       {
        System.out.println("THE ELEMENTS ARE "+Arr[i]+" AND "+Arr[i+1]); 
       }
     } 
   }
}