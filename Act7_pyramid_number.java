/**
 * Desiagn a program that will generatea pyramidfor a gevin number
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
        System.out.print("Enter First Number :");
        int a = input.nextInt();
        System.out.print("Enter Second Number :");
        int b = input.nextInt();

        for(int i=1;i<=a;i++)
        {
            for (int j=b; j <= i; j++)
            {
                System.out.print("" +i+ "");
            }
            System.out.println();
        }

    }
}//End
