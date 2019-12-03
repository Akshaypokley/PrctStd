package Exceptionhandling;

public class ureachableExcep {

    public static void main(String args[])
    {
        String str="Akshay";
    /*    try {
            int i=Integer.parseInt(str);
        }catch (Exception e)
        {
            System.out.println(e.fillInStackTrace());
        }*/
        /*catch (NumberFormatException n)
        {
            //Compile time error
            //This block becomes unreachable as
            //exception is already handled by above catch block
        }*/

        /*For this type of switchvation:The order of catch blocks should be from most specific to most general ones. i.e Sub classes of Exception must come first and super classes later.
        If you keep the super classes first and sub classes later, you will get compile time error : Unreachable Catch Block. */

        /*correct code*/
        try
        {
            int j=Integer.parseInt(str);
        }
        catch (NumberFormatException n)
        {
            System.out.println(n.fillInStackTrace());
        }
        catch (Exception e)
        {
            System.out.println(e.fillInStackTrace());
        }
    }
}
