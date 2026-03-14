/**
 * Write a program check if  the user age is older than 18 but youger than 40.
 * the second condition  is "Less than 40"(Use<50).finally if the user is greater
 * than 50 years old(Using switch satement)
 *
 * pangalan mo!!!!!
 *  date kailan mo ginawa!!!!
 */
import java.util.Scanner;
public class Act6_age_Switch
{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.print("Age Checker Program");
    System.out.println();
      System.out.println("Enter Your Desired Age :");
    int user_age=input.nextInt();

    switch(user_age){
        case 1: case 2 : case 3: case 4: case 5:
        case 6: case 7 : case 8: case 9: case 10:
        case 11: case 12 : case 13: case 14: case 15:
        case 16: case 17: case 18:
        System.out.println("The User is 18 years old or Younger");
        break;

        case 19: case 20: case 21: case 22:
        case 23: case 24: case 25: case 26: case 27:
        case 28: case 29: case 30: case 31: case 32:
        case 33: case 34: case 35: case 36: case 37:
        case 38: case 39: case 40: case 41: case 42:
        case 43: case 44: case 45: case 46: case 47:
        case 48: case 49:
        System.out.println("The User age is between 19 to 49 years old");
        break;

        default:
            System.out.println("The user is older the 50 years old");

    }

  }
}
