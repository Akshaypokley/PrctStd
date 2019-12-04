package Exceptionhandling;

public class Returtrycatfinal {

    /*Return Value From try-catch-finally Blocks
    * If method returns a value and also has try, catch and finally blocks in it, then following two rules need to follow.
    * 1) If finally block returns a value then try and catch blocks may or may not return a value.
    * 2) If finally block does not return a value then both try and catch blocks must return a value.*/

    public static void main(String args[])
    {
        System.out.println(sum_method(5,6));
        System.out.println(sum_method(0,0));
        System.out.println(sum_method(6,8));
    }

    static String sum_method(int a, int b)
    {
        int res=0;
        try {
            res=a+b;
            return res+"";
        }catch (NullPointerException e)
        {
            System.out.println(e.fillInStackTrace());
            return res+"";
        }

        finally {
            res=b-a;
            return res+"I am always excute";
            }
    }
}
