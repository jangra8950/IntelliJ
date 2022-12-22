package OOPS;

class Parent
{
    public void fun()
    {
        System.out.println("Parent method");
    }
    public void fun1()
    {
        System.out.println("Fun1");
    }
}

class Child1 extends Parent
{
    public void fun()
    {
        System.out.println("Child method");
    }
    public void fun2()
    {
        System.out.println("Fun2");
    }
}
public class Refreance
{
    public static void main(String[] args) {
        Child1 c=new Child1();
        c.fun();
        c.fun2();
        c.fun1();

        Parent p= new Parent();
        p.fun();
        p.fun1();

        Parent p1=new Child1();
        p1.fun1();
        p1.fun();
    }
}
