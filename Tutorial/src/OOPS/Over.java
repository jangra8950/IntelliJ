package OOPS;

class Add
{
    static void add(int a,int b)
    {
        System.out.println(a+b);
    }

    static void add(int a,int b,int c)   // overloading
    {
        System.out.println(a+b+c);
    }
    public  void fun()
    {
        System.out.println(" Class Add ");
    }
}
class Adder extends Add
{
    public void fun()    // overriding
    {
        System.out.println("Class Adder riding");
    }
    public void fun(int a)    // overloading
    {
        System.out.println("Class Adder loading");
    }
    static void add(int a,int b)  // overriding
    {
        System.out.println(a*b);
    }
    static void add(float a,float b,float c)   // overloading
    {
        System.out.println(a+b+c);
    }
}
public class Over
{
    public static void main(String[] args) {
        Add.add(2,3);
        Add.add(3,6,1);
        Adder.add(3,5);
        Adder.add(2,7,9);
        Adder.add(4.5f,7.9f,9.4f);
        Adder a= new Adder();
        a.fun();
        a.fun(3);
    }
}
