package Basics;

class Human
{
    int age;
    String name;
    static  int population=500000;  // only created once
    Human(int a, String b)
    {
        age=a;
        name=b;
    }
    public void show()
    {
        int x;
        System.out.println("age is "+age);
        System.out.println("name is "+name);
        System.out.println("population is "+population);
    }
    public static void fun()
    {
        int x=9;
        System.out.println(x);
       // System.out.println(age);   static function do not access instance variables
        System.out.println(population);
    }
}
 class Counter1
 {
     int count =0;    // created each time as many as object created
     Counter1()
     {
         count++;
         System.out.println(count);
     }
 }
class Counter2
{
    static int count =0;    // created only once
    Counter2()
    {
        count++;
        System.out.println(count);
    }
}
public class Static
{
    public static void main(String[] args) {
        System.out.println(Human.population);  // dont depend upon object
        Human obj1=new Human(23,"sahil");
        Human obj2=new Human(25,"jangra");
        obj1.show();
        obj2.show();
        Human.population=7;
       // obj1.fun();  static function do not depend upon object they directly called using class name
        Human.fun();
        Counter1 c1= new Counter1();
        Counter1 c2= new Counter1();
        Counter1 c3= new Counter1();

        Counter2 d1= new Counter2();
        Counter2 d2= new Counter2();
        Counter2 d3= new Counter2();
    }
}
