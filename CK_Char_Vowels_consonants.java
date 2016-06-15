import java.util.*;
import java.io.*;
class CK_Char_Vowels_consonants
{
    public static void main(String[] args)
    {
        System.out.println("Enter A Character:");
        Scanner s=new Scanner(System.in);
        char c=s.next().charAt(0);
        if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u')
           System.out.println(c+" IS A VOWEL");
        else
            System.out.println(c+" IS A CONSONANT");
    }
}