import java.util.*;
import java.io.*; 
class CK_Swap_odd_even
{
    public static String swap(String s)
 {
    String even = "";
    String odd = "";
    int length = s.length();
 
    for (int i = 0; i <= length-2; i+=2)
   {          
        even += s.charAt(i+1) +""+ s.charAt(i);
    }
 
    if (length % 2 != 0)
    {          
        odd = even + s.charAt(length-1);
        return odd;
    } 
    else 
    {
        return even;
    }
 }
  public static void main(String[] args)
  {
   String S;
   System.out.println("ENTER THE STRING: ");
   Scanner sc=new Scanner(System.in);
   S=sc.nextLine();
   System.out.println(swap(S));
  }
}