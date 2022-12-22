package Basics;

class Test
{
    private int x;
    static private  int y;
   // Initilizor Block  each time when object created
    {
        System.out.println(" Initialization Block x="+x);
        x=10;
    }
    static   // Static block only executed once
    {
        System.out.println("Static Block y="+y);
        y=5;
    }
    Test()
    {
        System.out.println("Constructor Block x="+x);
        System.out.println("Constructor Block y="+y);
    }
}
public class Block
{
    public static void main(String[] args) {
        Test t=new Test();
        Test t2=new Test();
    }
}
