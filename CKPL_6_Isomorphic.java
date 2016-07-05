import java.util.*;
class CKPL_6_Isomorphic
{
 public static void main(String[] args)
 {
     Scanner s=new Scanner(System.in);
     String str1,str2;
     str1=s.nextLine();
     str2=s.nextLine();
     if(isIsomorphic(str1,str2))
     System.out.println(str1+" and "+str2+" are ISOMORPHIC.");
     else
    System.out.println(str1+" and "+str2+" are NOT ISOMORPHIC.");
 }
public static boolean isIsomorphic(String s, String t) 
{
    if(s==null||t==null)
        return false;
    if(s.length()!=t.length())
        return false;
    HashMap<Character, Character> map = new HashMap<Character, Character>();
    for(int i=0; i<s.length(); i++)
    {
        char c1 = s.charAt(i);
        char c2 = t.charAt(i);
         if(map.containsKey(c1))
         {
            if(map.get(c1)!=c2)
                return false;
        }
        else
        {
            if(map.containsValue(c2)) 
              return false;
              map.put(c1, c2);
        }
    }
     return true;
  }
}