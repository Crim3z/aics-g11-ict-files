/**
 * Write a description of class Act7_1_multiplication_table here.
 *
 *  (your name)
 * (a version number or a date)
 */
public class Act7_1_multiplication_table
{
    public static void main(String[]args){
        int Table_Size = 10;
        Display(Table_Size);
    }
    public static void Display(int Table_Size){
        System.out.print("\t\tMULTIPLICATION TABLE");
        System.out.print("\n\n");
        System.out.format("      ");
        for(int i=0;i<=Table_Size;i++){
            System.out.format("%4d",i);
        }

        System.out.println();
        System.out.println("__________________________________________________");
        for (int i =0;i<=Table_Size;i++){
            System.out.format("%4d |",i);
            for(int j =0;j<=Table_Size;j++){
                System.out.format("%4d",i*j);

                System.out.println();
            }
            System.out.println("\n");
        }
        System.out.println("\t\tEnd of Program");
        System.out.println("\n\n");
    }
}
