package string;

public class CountVowels
{
    public static void main(String[] args) {
        String s="what are you doing";
        vow(s);
    }

    public static void vow(String s)
    {
        int v=0,c=0;
        int j=s.length();
        for (int i=0;i<j;i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
                v++;
            else if((s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122))
                c++;
        }
        System.out.println("Numbers of Vowels are "+v);
        System.out.println("Numbers of consonent are "+c);
    }
}
