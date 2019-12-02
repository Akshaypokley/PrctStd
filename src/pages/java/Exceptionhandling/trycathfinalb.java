package Exceptionhandling;



public class trycathfinalb {
    public static void main (String args[])
    {

        String s[]= {"Akshay","123","Magesh","34.25"};
        for (int i=0;i<s.length;i++)
        {
            try {
                int I= Integer.parseInt(s[i]);
                System.out.println("Successfully parse"+I);
            }catch (NumberFormatException n)
            {
                System.out.println(n.getStackTrace());
                System.out.println(n.fillInStackTrace());
            }
            finally {
                System.out.println("Finally excuted");
            }
        }

    }
}
