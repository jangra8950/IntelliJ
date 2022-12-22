package Basics;

final class Test1                                       // make class final to stop from inheritance
                                                        // but we can create object of final class
{
    private final int x=9;   // value of x cannot be changed
    static  final int y;
    static
    {
        y = 4;
        System.out.println(y);
    }
    static final void sum(int a,int b)    // final method cannot be override
    {
        System.out.println(a+b);
    }
}
//class Test2 extends  Test1                    // if test1 is final then test1 cannot be extended
//{
//    static void sum(int a,int b)
//    {
//        System.out.println(a*b);
//    }
//}
public class Final
{
    public static void main(String[] args)
    {
        Test1 t= new Test1();
        // Test1.y=2;                      cannot  change
//        Test2 a= new Test2();
//        a.sum(3,5);
    }
}
