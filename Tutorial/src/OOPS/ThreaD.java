package OOPS;

class C extends Thread
{
    public void run()
    {
        int i;
        for(i=0;i<900;i++)
            System.out.println("C i="+i);
    }
}
class C1 extends Thread
{
    public void run()
    {
        int i;
        for(i=0;i<100;i++)
            System.out.println("C1 i="+i);
    }
}
public class ThreaD
{
    public static void main(String[] args) {
        C a= new C();
        C1 b=new C1();
        a.start();
        b.setPriority(7);
        b.start();
    }
}
