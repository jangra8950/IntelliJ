package string;

public class Duplicates
{
    public static void main(String[] args) {
        String s="finding";
        dupli(s);
    }

    public static void dupli(String s)
    {
        int[] h=new int[26];
        int i;
        for(i=0;i<s.length();i++)
            h[s.charAt(i)-97]++;

        for(i=0;i<26;i++)
        {
            if(h[i]>1)
                System.out.println((char)(i + 97) + " repeating " + h[i] + " times");
        }
    }
}

