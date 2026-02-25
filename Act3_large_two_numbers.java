/**
 * Act3 if-else
 * conditional statements
 * ilagay mo pangalan mo dito!!!!!!!!
 * Date kung kailan mo ginawa itong activity!!!!!!
 */
import java.util.Scanner;
public class Act3_large_two_numbers
{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        //Data type and variable with value na 0
        int no1=0,no2=0;
        System.out.println();
        //Display lang to na parang title ng program
        System.out.println("HANAPIN ANG MAS MALAKI SA PINILING NUMERO");
        System.out.println();
        //input ng dalawang numero;
        System.out.print("Maglagay ng unang napiling numero        :");
        //variable na pag lalagyan ng unang numero at ang method na gagamitin
        no1=scan.nextInt();
        System.out.print("Maglagay ng pangalawang napiling numero  :");
        no2=scan.nextInt();

        //unang block/condition
        if(no1>no2){
            System.out.println();
            //kapag naging TRUE ang condition ito ang mag didisplay
            System.out.println("Ang unang napiling numero ay mas malaki kaysa pangalawang napiling numero");
        }
        //pangalawang block
        //Kapag False ang condition ito namn ang mag didisplay
        else {
            System.out.println("Ang pangalawang napiling numero ay mas malaki kaysa unang napiling numero");
        }
        System.out.println();
        System.out.println("End Of Program");
        System.out.println();
    }
}
