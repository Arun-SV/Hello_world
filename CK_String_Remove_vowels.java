import java.util.*;
import java.lang.String;
class CK_String_Remove_vowels
{
 public static void main(String[] args)
 {
  String str,rev="",rvow="";
  System.out.println("ETER A STRING");
  Scanner s=new Scanner(System.in);
  str=s.nextLine();
  int len=str.length();
  for(int i=len-1;i>=0;i--)
  {
    rev=rev+str.charAt(i);
  }
   System.out.println("REVERSE="+rev);
  for(int j=0;j<len;j++)
  {
    if(!(str.charAt(j)=='a'|| str.charAt(j)=='e'||str.charAt(j)=='i'||str.charAt(j)=='o'||str.charAt(j)=='u'))
      rvow=rvow+str.charAt(j);    
  }
  System.out.println("VOWELS REMOVED="+rvow);
  }
}