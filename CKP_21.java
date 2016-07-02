/*21 - Program to divide an array into 2 parts such that the averages
 are same. E.g. : 4 2 3 4 2 -> [4,2,3], [4,2] E.g. : 1 2 3 4 5 -> 
 "Not Possible" Followup Question will be what if the array contains 
 a negative values as well */
import java.util.*;
class CKP_21
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ELEMENT:");
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("ENTER THE ELEMENTS");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int sum1=0,count1=0,n1=0;
        if(n%2==0)
         n1=n/2;
        else
         n1=(n/2)+1;
        for(int i=0;i<n1;i++)
        {
            count1++;
            sum1+=arr[i];
        }
        int sum2=0,count2=0;
        for(int i=n1;i<n;i++)
        {
            count2++;
            sum2+=arr[i];
        }
        if((sum1/count1)==(sum2/count2))
           System.out.println("Possible");
        else
           System.out.println("Not Possible");  
    }
}