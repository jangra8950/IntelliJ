public class Lcm
{
    public static void main(String[] args)
    {
      lcm(4,10);
      hcf(8,12);
    }

    static void lcm(int x,int y)
    {
        int i;
        int z=(x>y)?x:y;
        for ( i = z; i <=x*y; i++)
        {
            if(i%x==0 && i%y==0)
                break;
        }
        System.out.println(i);
    }

    static void hcf(int x,int y)
    {
        int i;
        int z=(x<y)?x:y;
        for ( i = z; i >0; i--)
        {
            if(x%i==0 && y%i==0)
                break;
        }
        System.out.println(i);
    }
}
