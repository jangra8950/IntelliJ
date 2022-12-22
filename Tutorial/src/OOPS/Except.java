package OOPS;

public class Except                            // when the exception occurs default catch machanism works
                                                // which print the error message and program stop there.
{
    public static void main(String[] args)      // to get message as per our need and program do not stop
    {                                           // we create our own catch machanism
        System.out.println("first line");
       // System.out.println("result "+3/0);      // if there are some situation which correct as per java but in our
        System.out.println("last line");           // way of code they create errors during Runtime
        try                               // to handle such situation we create our own TRY block and THROW the exception
        {
            System.out.println(" in try ");
            System.out.println(3/0);                    // DEFAULT THROW AND OUR CATCH
            System.out.println("in try last");          // not executed after exception occur
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println(" always executed");
        }
        System.out.println("hello ");                  // if our CATCH works program continue
    }
}
