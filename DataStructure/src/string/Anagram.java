package string;

public class Anagram
{
    public static void main(String[] args)
    {
       String s1="decimal";
       String s2="medical";
       ana(s1,s2);
    }

    public static void ana(String s1,String s2)
    {
        int i;
        int[] h=new int[26];
        for ( i=0;i<s1.length();i++)
             h[s1.charAt(i)-97]++;

        for (i=0;i<s2.length();i++)
            h[s2.charAt(i)-97]--;

        for ( i=0;i<26;i++)
        {
            if(h[i]<0)
                break;
        }
        if(i==26)
            System.out.println("Anagram Strings");
        else
            System.out.println("Not Anagram");
    }
}
