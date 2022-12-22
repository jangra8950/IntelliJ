package Basics;

public class Wrapper
{
    public static void main(String[] args) {
        // Autoboxing converts primitive data type to respective wrapper class
        int a=20;
        float b= 3.6f;
        Integer i1=a;  // automatic
        Float f1=b;
        System.out.println(i1);
        System.out.println(f1);

        // unboxing means wrapper to primitive
        Integer x= 5;
        Float s= 9.5F;
        int i = x;
        float f=s;
        System.out.println(i);
        System.out.println(f);
    }
}
