package Basics;

class Example                        // this is the reference variable which represent current class caller object
{
    private int l,b,h,x;
    Example()
    {
        this(4,6,8);     //   to refer current class constructor
        System.out.println(" hello default ");
    }
    Example(int l,int b,int h)
    {
        this.l=l;                  // to refer current class instance variable
        this.b=b;
        this.h=h;
        System.out.println(this.l+" "+this.b+" "+this.h);
    }
    Example(int a,int j, int c,int d)
    {
        this(a,j,c);                           // constructor chaining
        x=d;
        System.out.println(l+" " +b+" "+h+" "+x);
    }

    public  void m()
    {
        System.out.println(" hello m ");
    }
    public void n()
    {
        System.out.println("hello n");
        this.m();                               // to refer current class method
    }
}
public class This
{
    public static void main(String[] args)
    {
        Example a=new Example();
        Example e= new Example(3,5,8);
        e.n();
        Example b= new Example(9,9,9,9);
    }
}
