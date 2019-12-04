package Exceptionhandling;

public class nesteadTryblock
{
    public static void main(String args [])
    {
        String arry[]={"4","kjdk","ldnnk","65","54d","54549"};
        for (int i=0;i<arry.length;i++)
        {
            try {
                System.out.println(arry.length);
                try {
                    System.out.println(arry.length + arry[i]);
                    try {
                        int j = Integer.parseInt(arry[i]);
                    } catch (NullPointerException n) {
                        System.out.println("I didn't catch exception in first catch block"+" "+n.fillInStackTrace());
                    }
                } catch (ArithmeticException j) {
                    System.out.println("I got the exception in second block"+" "+j.fillInStackTrace());
                }

            }catch (Exception e)
            {
            System.out.println(e.fillInStackTrace());
        }
        }
    }
}
