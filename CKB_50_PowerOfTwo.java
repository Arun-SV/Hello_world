import java.util.*;
class CKB_50_PowerOfTwo
{
	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
 		int x=sc.nextInt();
		boolean a=isPowerOfTwo(x);
		if (a)
			System.out.print("yes");
		else
			System.out.print("no");
	}
	
	
	static boolean isPowerOfTwo(int n)
    {
     return ((n > 0) && ((n & (n - 1)) == 0));  //ONE LINE FUNCTION
    }
}