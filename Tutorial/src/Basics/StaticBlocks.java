package Basics;

public class StaticBlocks
{
    static int x=10;
    static
    {
        System.out.println("static block 1");
        fun();
    }
    static void fun()
    {
        System.out.println(j);
    }
    public static void main(String[] args)
    {
        fun();
        System.out.println("hello");
    }
    static
    {
        System.out.println("static 2");
    }
    static int j=20;
}
