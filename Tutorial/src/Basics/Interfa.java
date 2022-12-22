package Basics;
interface I
{                                 // in interface all the variables are Public and Static and Final
    int x=9;                      //  all the methods are Public and Abstract
    void fun();
}
interface I1
{
    void fun1();
}
class A2 implements I,I1                // interface do not contain constructor as all the variables are static
{                                       // we have to override all the methods inherited from interface
    public void fun()
    {
        System.out.println("fun called");
    }
    public void fun1()
    {
        System.out.println("fun1 called");
    }
}
public class Interfa
{
    public static void main(String[] args) {
        A2 a=new A2();
        a.fun1();
    }

}
