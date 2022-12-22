package search;

public class Linear
{
    public static void main(String[] args) {
        int[] arr={4,1,5,8,2,6,0,9};
        search(arr,0);
    }

    public static void search(int[] a,int n)
    {
        int i;
        for( i=0;i<a.length;i++)
        {
            if(a[i]==n)
            {
                System.out.println("your element is found " + i + " position");
                break;
            }
        }
        if(i==a.length)
            System.out.println("your element is not present");
    }
}
