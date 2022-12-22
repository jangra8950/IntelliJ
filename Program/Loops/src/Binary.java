public class Binary
{
    public static void main(String[] args)
    {
       // it(25);
        rev(25);
    }

    static void it(int n)
    {
        int k,i=0;
        int arr[]=new int[20];
        while (n>0)
        {
            k=n%2;
            arr[i++]=k;
            n=n/2;
        }
        for(int j=i-1;j>=0;j--)
            System.out.print(arr[j]);

    }

    static void rev(int n)
    {
        int k;
        if(n==1)
            System.out.print(1);
        else
        {
            rev(n/2);
            k=n%2;
            System.out.print(k);
        }
    }
}
