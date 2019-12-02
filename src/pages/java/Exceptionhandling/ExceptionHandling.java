package Exceptionhandling;

public class ExceptionHandling {
    public static void main(String args[])
    {
        System.out.println("Below Statment will excute ");
      /*  Integer I=new Integer("Aks");//NumberFormatException*/

        /*Hnadling Above statement using try catch block */

     try
     {
      Integer I=new Integer("s");
         System.out.println("Above Statement is excuted successfully");
     }
     catch (Exception e)
     {
         System.out.println(e.fillInStackTrace());
         System.out.println("Exception Caught");
     }

    }
}
