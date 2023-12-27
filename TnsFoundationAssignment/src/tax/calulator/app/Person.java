package tax.calulator.app;


public class Person {
    public  String name;
    public int age;
    public double income;
    public String gender;
    protected double tax;
    
    

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public double getTax() {
    	return tax;
    }
    public void setTax(double tax2) {
    	this.tax = tax2;
    }

//    // Method to get person details
//    public String getDetails() {
//        return "Name: " + name + "\nAge: " + age + "\nIncome: " + income + "\nGender: " + gender;
//    }
    public String toString() {
    	return "Person [name= " +name + ", age= " + age + ", gender= " + gender + ", income= " + income + ", Tax= " + tax +"]";
    }
}