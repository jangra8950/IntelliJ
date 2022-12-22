package Basics;

public class InstanceBlock
{
    int i=10;
    int x;
    String name;

    {
        x=10;
        System.out.println("NOn static Block");
        fun();
        System.out.println(x);
    }
    InstanceBlock()
    {
        System.out.println("constructor");
        System.out.println(++i);
        fun();
    }
    InstanceBlock(int a,String b)
    {
        x=a;
        name=b;
        System.out.println(x+" "+name);
    }
    public void fun()
    {
        System.out.println(j);
    }

    public static void main(String[] args)
    {
        System.out.println("main method");
        InstanceBlock a=new InstanceBlock();
        InstanceBlock a1=new InstanceBlock(3,"sahil");
    }

    {
        System.out.println("non statick block 2");
    }
    int j=20;
}
