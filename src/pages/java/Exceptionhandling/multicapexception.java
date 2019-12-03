package Exceptionhandling;

public class multicapexception {

    public static void main(String args[])
    {
        String s[]={"34","RAGj",null,"d","ddd5"};
        for (int i=0;i<=s.length;i++)
        {
            try {

                int inum=s[i].length()+Integer.parseInt(s[i]);
                inum=inum/0;
            }catch (NumberFormatException |NullPointerException| ArrayIndexOutOfBoundsException |ArithmeticException j)
            {
                System.out.println(j.fillInStackTrace());
            }
        }
    }
}
