package tax.calulator.app;
import java.util.*;



//Main class for testing
public class Main {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter income: ");
        double income = sc.nextDouble();

        sc.nextLine(); 

        System.out.print("Enter gender: ");
        String gender = sc.nextLine();

     // Create a Person object
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        person.setIncome(income);
        person.setGender(gender);

        // Close the Scanner
        sc.close();
        
        
      

     

        // Calculate and display income tax
        double incomeTax = IncomeTaxCalculator.calculateIncomeTax(person);
        System.out.println("Income Tax for " + person.getName() + ": " + incomeTax);
        
        
        
        System.out.println(person);
    }
}