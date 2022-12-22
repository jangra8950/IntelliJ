package string;

public class CountWords
{
    public static void main(String[] args) {
        String s="how are you";
        System.out.println("words are "+words(s));
    }

    public static int words(String s)
    {
        int count=1;
        int j=s.length()-1;
        for (int i=0;i<j;i++)
        {
            if(s.charAt(i)==' ' && s.charAt(i-1) !=' ')
                count++;
        }
        return count;
    }
}
