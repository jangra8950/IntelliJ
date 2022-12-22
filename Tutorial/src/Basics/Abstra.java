package Basics;

abstract class Person1         // we cannot create object of abstract class
                              // but we can extends the abstract class to use variables and methods
{
    int age ;                    // methods which have no implementation only declaration called abstract method
    String name;                  // it is optional to create abstract method in abstract class,
                                 // abstract class can have or do not have any abstract methods
    Person1(int a,String b)      // if we create abstract method in any class then class must be make abstract
    {
        age=a;
        name=b;
        System.out.println(age+" "+name);
    }
    abstract void fun();
}
 class Stude extends  Person1                          // as fun() is inherited, stude class is also abstract
{                                                         // we are not allowed to make object of stude class
    int rollno;                                            // to make object of stude class we have to Override fun()
    Stude(int a,String b,int c)
    {
        super(a,b);
        rollno=c;
    }
    public void display()
    {
        System.out.println(age+" "+name+" "+rollno);
    }
    void fun()
    {
        System.out.println("fun Override");
    }
}

class Wom extends Person1
{
    Wom(int a, String b) {
        super(a, b);
   }

    void fun() {
        System.out.println("Wom Override");
    }
}
public class Abstra
{
     public static void main(String[] args) {
        //Person1 p=new Person1();
        Stude a=new Stude(3,"sj",34);
         a.display();
        Person1 p=new Stude(1,"jangra",8);
        p.age=5;
        p.fun();
       // p.display();                              not present in abstract class as p is refrence variable

         p=new Wom(2,"kl");
         p.fun();
    }
}
