package Basics;
class Box{
   private int length,breadth,height;
   Box(int l,int b,int h)
   {
       length=l;
       breadth=b;
       height=h;
   }
   public void show()
   {
       System.out.println("length of the box is "+length);
       System.out.println("breadth of the box is "+breadth);
       System.out.println("height of the box is "+height);
   }

}
public class Clasobj {
    public static void main(String[] args) {
        Box obj=new Box(5,2,8);
        obj.show();
    }
}
