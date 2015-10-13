/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalproject;

/**
 *
 * @author sandra kamili
 */
import java.util.Scanner;
public class Hospitalproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner user_input=new Scanner(System.in);
        String first_name;
        String second_name;
        String gender;
        String address;
        int age;
        int contact;
        int patient_number;
        System.out.println("HOSPITAL MANAGEMENT SYSTEM");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("ENTER INPATIENT INFORMATION");
        System.out.println("Enter your name");
        first_name=user_input.next();
        System.out.println("Enter second name");
        second_name=user_input.next();
        System.out.println("Enter gender");
        gender=user_input.next();
        System.out.println("Enter address");
        address=user_input.next();
        System.out.println("Enter age");
        age=user_input.nextInt();
        System.out.println("Enter contact");
        contact=user_input.nextInt();
        System.out.println("Enter patient number");
        patient_number=user_input.nextInt();
        System.out.println("PATIENTS INFORMATION IS:"+first_name+second_name+patient_number);
        System.out.println("xxxxxxxxxxxxxx END xxxxxxxxxxxxx");
    }
}
