package OOPS;

class Student
{
    int age;
    String name;
    float marks;
    Student()   // default constructor
    {
        age=25;
        name="sahil";
        marks=78.9f;
        System.out.println("default called ");
    }
    Student(int a, String b)   // parameterized constructor
    {
        age=a;
        name=b;
        System.out.println("two parameterized");
    }
    Student(int a, String b,float c)   //  constructor overloading
    {
        age=a;
        name=b;
        marks=c;
    }
    Student(Student s)               // copy constructor
    {
        age=s.age;
        name=s.name;
        marks=s.marks;
    }
    public void  display()
    {
        System.out.println(age+" " +name+ " "+marks );
    }
}
class Stud extends Student
{
    public Stud()
    {
        this(2,"xz");                       // constructor chaining
        System.out.println(" default stud");
    }
    public Stud(int a, String b)
    {                                // automatically called default constructor of parent class or else
       // super(a,b);
        System.out.println(" stud called ");
    }
}
public class Construct
{
    public static void main(String[] args)
    {
          Student s1= new Student();
          s1.display();
          Student s2=new Student(23,"jangra");
          s2.display();
          Student s3 = new Student(34,"ajay",70.5f);
          s3.display();
          Student s4=new Student(s3);
          s4.display();
          Stud a= new Stud();
    }
}
