import java.util.Scanner;
public class Armstrong
{
    public static void main(String[] args)
    {
        int a,b,k,sum=0;
        System.out.println("enter the no to check armstrong ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=a;
        while(a>0)
        {
            k=a%10;
            sum=sum+k*k*k;
            a=a/10;
        }
        if(b==sum)
            System.out.println("Armstrong no ");
        else
            System.out.println(" Not an armstrong no ");
    }
}
