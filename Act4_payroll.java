/**
 * Design a program that determines the gender of an employee of
 * Asian Institute of Computer Studies. It accepts both uppercase and lowercase letters
 * Act4_payroll
 * date kung kailan ginawa
 * pangalan mo
 */
import java.util.Scanner;
//java.text.DecimalFormat is a class in the java.text package used to format numbers into strings with a specific pattern.
import java.text.DecimalFormat;
//NumberFormat is a class in the java.text package used to format and parse numbers based on locale (country/language settings).
import java.text.NumberFormat;
public class Act4_payroll
{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        NumberFormat formatter = new DecimalFormat("#0.00");

        String employee_name, position, gender_identity;
        char gender;
        double rate_per_day=0.00, bir_tax=0.00, sss=0.00, phil_health=0.00;
        int no_days_work=0;

        System.out.println();
        System.out.println("\t\t\tAsian Institute Of Computer Studies");
        System.out.println("\t\t2nd Floor Montalban Town Center Rodriguez Rizal");
        System.out.println("\t\t\tTelephone Number : 7438497,6428896");
        System.out.println();
        System.out.print("Enter the employee's name       :");
        employee_name=sc.nextLine();
        System.out.print("Enter the employee's position   :");
        position = sc.nextLine();
        System.out.print("Enter your Gender               :");
        //charAt(0) is a method call used on a String to get the first character of that string
        gender=sc.next().charAt(0);
        sc.nextLine(); // Fix: flush leftover newline in buffer after sc.next()

        System.out.print("Enter number of days worked (1-7)   :");
        no_days_work=sc.nextInt();
        System.out.print("Enter rate per day      (400-600)   :");
        rate_per_day = sc.nextDouble();
        sc.nextLine(); // Fix: flush leftover newline in buffer after sc.nextDouble()

        double gross_pay=(no_days_work * rate_per_day);

        System.out.println("Your Gross pay is Php"+formatter.format(gross_pay)+".");
        System.out.print("Enter SSS Deduction (200-500)       :");
        sss = sc.nextDouble();

        System.out.print("Enter BIR Tax Deduction (100-300)   :");
        bir_tax=sc.nextDouble();
        System.out.print("Enter PhilHealth Deduction (100-300) :");
        phil_health=sc.nextDouble();
        sc.nextLine(); // Fix: flush leftover newline in buffer after last sc.nextDouble()

        double total_deductions=(sss+bir_tax+phil_health);

        if (gender == 'M'|| gender =='m'){
            gender_identity = "Male";
        }
        else{
            gender_identity="Female";
        }

        System.out.println(" Your Total Deduction is Php " +formatter.format(total_deductions)+".");

        double net_pay=(gross_pay-total_deductions);

        System.out.println();
        System.out.println("\tEMPLOYEE'S PAYROLL RESULT");
        System.out.println();
        System.out.println("NAME        :" +employee_name);
        System.out.println("Position    :"+position);
        System.out.println("Gender      :"+gender_identity);
        System.out.println();
        System.out.println("Net Pay:Php"+formatter.format(net_pay)+".");
        System.out.println("\tEND OF PROGRAM");
        System.out.println();

    }
}
