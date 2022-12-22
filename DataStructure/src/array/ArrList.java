package array;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrList
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(34);
        list.set(1,54);

        // input
        System.out.println("enter 5 elements");
        for(int i=0;i<5;i++)
            list.add(sc.nextInt());



        // display
        for (int i = 0; i < 5; i++)
            System.out.println(list.get(i));

        System.out.println(list);

    }
}
