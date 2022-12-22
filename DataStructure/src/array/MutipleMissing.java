package array;

public class MutipleMissing
{
    public static void main(String[] args) {
        int[] arr=new int[]{1,5,7,9,4,5};
        multi(arr);
    }

    public static void multi(int[] a)
    {
        int[] h=new int[10];
        for(int ele:a)
            h[ele]++;
        for(int i=1;i<10;i++)
        {
            if(h[i]<1)
                System.out.println(i+ " Missing element");
        }
    }


}
