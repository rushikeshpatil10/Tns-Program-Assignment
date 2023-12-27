package tax.calulator.app;

public class IncomeTaxCalculator {
    // Method to calculate income tax
    public static double calculateIncomeTax(Person person) {
        double income = person.getIncome();
        int age = person.getAge();
        String gender = person.getGender();

        double tax = 0;

        // Income tax calculation logic (a basic example)
        if (age < 60) {
            if (gender.equalsIgnoreCase("male")) {
                if (income <= 250000) {
//                    tax = 0;
                	person.setTax(0);
                } else if (income <= 500000) {
                    tax = 0.05 * (income - 250000);
                    person.setTax(tax);
                } else {
                    tax = 0.05 * (500000 - 250000) + 0.1 * (income - 500000);
                    person.setTax(tax);
                }
            } else if (gender.equalsIgnoreCase("female")) {
                if (income <= 250000) {
                    tax = 0;
                    person.setTax(tax);
                } else if (income <= 500000) {
                    tax = 0.04 * (income - 250000);
                    person.setTax(tax);
                } else {
                    tax = 0.04 * (500000 - 250000) + 0.08 * (income - 500000);
                    person.setTax(tax);
                }
            }
        } else {
            // Senior citizen (>60 years old)
            // No tax for seniors
            tax = 0;
            person.setTax(tax);
        }

        return tax;
    }
}

