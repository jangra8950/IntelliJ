package switc;

import java.util.Scanner;

public class SwitchMenu
{
    public static void main(String[] args)
    {
        int n,a,b;
        Scanner sc=new Scanner(System.in);

        do
        {
            System.out.println("1.Area for Rectangle");
            System.out.println("2.Area of square");
            System.out.println("3.Exit");
            n=sc.nextInt();
            switch (n)
            {
                case 1:
                    System.out.println("enter Length and Breadth");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    System.out.println("Area of Rectangle of is "+a*b);
                    break;
                case 2:
                    System.out.println("Enter Side of Square");
                    a=sc.nextInt();
                    System.out.println("Area of Square is "+a*a);
                case 3:
                    break;
                default:
                    System.out.println("You entered wrong choice");
                    return;
            }
        }while (n!=3);
    }
}
