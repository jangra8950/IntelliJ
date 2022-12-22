package Basics;
//import OOPS;
public class Useimport
{
    public static void main(String[] args) {
        Human h= new Human(25,"sahil"); // directly use different classes in same packages
        h.show();
        Box b= new Box(3,4,5);
        b.show();
    }

}
