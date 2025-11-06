import java.util.*;
public class Reverse_Inbuild
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sobj.nextLine();

        String rev = null;

        rev = new StringBuilder(str).reverse().toString();

        if(str.equals(rev))
        {
            System.out.print("palindrom");
        }
        else
        {
            System.out.print("not palindrom");
        }
        
    }

}