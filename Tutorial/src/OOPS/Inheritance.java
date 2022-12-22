package OOPS;

class Person
{
      int age;
      String name;
    Person(int a, String b)
    {
        age=a;
        name=b;
    }
    public void show()
    {
        System.out.println(age+" "+name);
    }
}
class Child extends Person
{
      int rollno;
    Child(int a, String b,int c)
    {
        super(a, b);
        rollno=c;
    }
    public void display()
    {
        System.out.println(age+" "+name+" "+rollno);
    }
}
class Student1 extends Child
{
    float marks;
    Student1(int a, String b, int c,float d) {
        super(a, b, c);
        marks=d;
    }
    public void display()
    {
        System.out.println(age+" "+name+" "+rollno+" "+marks);
    }

}

public class Inheritance
{
    public static void main(String[] args)
    {
        Child c=new Child(25,"sahil",76);
        c.show();
        c.display();
        Student1 s=new Student1(23,"jangra",74,98.7f);
        s.show();
        s.display();
    }
}
