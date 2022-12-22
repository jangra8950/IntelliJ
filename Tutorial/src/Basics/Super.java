package Basics;

class A                       // reference variable which refers parent class object
{
    int x;
    A(int x)
    {
        this.x=x;
    }
    public void fun()
    {
        System.out.println("hello A");
    }
}
class B extends A
{
  int x,y;
  B(int a,int b,int c)
  {
      super(a);                 // to call parent class constructor
      y=b;
      x=c;
  }
  void display()
  {
      System.out.println(super.x+" "+y+" "+x);
  }
  public void fun()
  {
      int z=2;
      this.x=3;
      super.x=4;                            // to initialise parent class variable
      System.out.println(z+" "+x+" "+super.x);
      System.out.println("hello B");
      super.fun();                         // to call the super class methods
  }
}
public class Super
{
    public static void main(String[] args) {
        B a=new B(8,9,10);
        a.display();
        a.fun();

    }
}
