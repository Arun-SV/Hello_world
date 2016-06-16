import java.util.*;
class CK_MuXTable
{
  public static void main(String[] args)
  {
    System.out.println("ENTER WHICH TABLE:");
    Scanner s=new Scanner(System.in);
    int tab=s.nextInt();
    System.out.println("ENTER THE LENGTH:");
    int len=s.nextInt();
    int out;
    for(int i=tab;i==tab;i++)
    {
       for(int j=1;j<=len;j++)
         {
             out=i*j;
             System.out.println(j+"*"+i+"="+out);
         }
    }
  }
}