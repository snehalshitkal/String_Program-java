/*
        Input : sneha###lshitkal
        output: ###snehalshitkal
*/
import java.util.*;
public class MoveSpecialCharFront
 {
    public static void moveHashesFront(char[] arr) 
    {
        int read = arr.length - 1;
        int write = arr.length - 1;

        // Move non-# characters to the end, from the back
        while (read >= 0) 
        {
            if (arr[read] != '#') 
            {
                arr[write] = arr[read];
                write--;
            }
            read--;
        }

        // Fill the front with `#`
        for (int i = 0; i <= write; i++) 
        {
            arr[i] = '#';
        }
    }

    public static void main(String[] args) 
    {

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String");
        String input = sobj.nextLine();

        char Arr[] = input.toCharArray();

        moveHashesFront(Arr);

        String output = new String(Arr);

        System.out.println("Output: " + output);  
       
    }
}