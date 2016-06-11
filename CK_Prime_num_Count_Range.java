import java.util.*;
class CK_Prime_num_Count_Range
{
  public static void main(String[] args)
  {
    int count=0,count1=0;
    System.out.println("ENTER A RANGE:");
    Scanner s=new Scanner(System.in);
    int num1=s.nextInt();
    int num2=s.nextInt();
    for(int temp=num1;temp<=num2;temp++)
    {
      for(int i=2;i<=(temp/2);i++)
      {
       if((temp%i)==0)
         count+=1;
       else
        continue;     
      }
      if(count==0)
      {
         System.out.println(temp);
          count1+=1;
      } 
     //else if(count>=1)
       //System.out.println(temp+" IS NOT PRIME");
     count=0;
     }
     System.out.println("TOTAL PRIME COUNT:"+count1);
  }
}
