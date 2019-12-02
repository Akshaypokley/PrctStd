package Exceptionhandling;

public class Difftyofexception_usingTrycatch {

    public static void main(String args[])
    {
        /*Arithmetic Exception*/
        try
        {
            int inum=4545/0;

        }catch (Exception a)
        {
            System.out.println(a.fillInStackTrace());
        }

        /*Array outof Bound exception*/

        try
        {
            String s =args[1];
        }
        catch(Exception arbound)
        {
            System.out.println(arbound.fillInStackTrace());
        }

        /*Null pointer exception*/
        String s=null;
        try
        {
            System.out.println(s.length());

        }
        catch (Exception NullPnter)
        {
            System.out.println(NullPnter.fillInStackTrace());
        }
        /*Class cast exception*/
        Object ob=new Object();
        try
        {
            Difftyofexception_usingTrycatch d=(Difftyofexception_usingTrycatch )ob;

        }catch (Exception casting)
        {
            System.out.println(casting.fillInStackTrace());
        }

    }
}
