package switc;

import java.util.Scanner;

public class Months
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the month number ");
        n=sc.nextInt();

        switch (n)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("NUmber of days are 31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Number of days are 30");
                break;
            case 2:
                System.out.println("Numbers of days are 28 or 29");
                break;
            default:
                System.out.println("you have entered wrong month number");
        }
    }
}
