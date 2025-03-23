class Employee {
    // Private instance members (specific to each object)
    private String name;
    private double salary;

    // Static member (shared across all instances)
    private static String company = "ABC";

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Public method to access private instance members
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Company: " + company);
    }

    // Static method to update the static member
    public static void setCompany(String newCompany) {
        company = newCompany;
        System.out.println("Company updated to: " + company);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating Employee objects
        Employee emp1 = new Employee("Anil", 50000);
        Employee emp2 = new Employee("Ajay", 60000);

        // Displaying employee details
        emp1.displayDetails();
        emp2.displayDetails();

        // Updating static member (company name)
        Employee.setCompany("XYZ");

        // Display details again to see the updated company name
        emp1.displayDetails();
        emp2.displayDetails();
    }
}
