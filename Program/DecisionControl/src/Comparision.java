public class Comparision
{
    public static void main(String[] args)
    {
        com3(18,9,5);
    }

    static void com(int x,int y,int z)
    {
        if(x>y)
        {
            if(x>z)
                System.out.println("greater no is "+x);
            else
                System.out.println("greater no is "+z);
        }
        else
        {
           if(y>z)
               System.out.println("greater no is "+y);
           else
               System.out.println("greater no is "+z);
        }
    }

    static void com2(int x,int y,int z)
    {
         if(x>y && x>z)
             System.out.println("greater no is "+x);
         else if(y>z)
             System.out.println("greater no is "+y);
         else
             System.out.println("greater no is "+z);
    }

    static void com3(int x,int y,int z)
    {
        int max;
        if(x>y)
            max=x;
        else
            max=y;
        if(max>z)
            System.out.println("greater no is "+max);
        else
            System.out.println("greater no is "+z);
    }
}
