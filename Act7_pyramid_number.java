/**
 * Design a program that will generate a pyramid for a given number
 * using for loop statement
 *
 * pangalan mo!!!!!
 * Date kung kailan mo ginawa!!!!!!
 */
import java.util.Scanner;
public class Act7_pyramid_number
{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("PYRAMID OF NUMBERS");
        System.out.println();
        System.out.print("Enter First Number: ");
        int a = input.nextInt();
        System.out.print("Enter Second Number: ");
        int b = input.nextInt();
        for(int i = a; i <= b; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}//End
