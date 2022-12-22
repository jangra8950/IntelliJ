package string;

public class Palindrome
{
    public static void main(String[] args) {
        String s="madam";
        char[] a=s.toCharArray();
        anag(a);
    }

    public static void anag(char[] a)
    {
        int i=0;
        int j = a.length-1;
        while(i<j)
        {
            if(a[i]!=a[j])
                break;
            i++;
            j--;
        }
        if(i==j)
            System.out.println("Palindrome String");
        else
            System.out.println("Not Palindrome");
    }
}
