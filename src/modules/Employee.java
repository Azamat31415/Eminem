package modules;

// Employee class extending Person
public class Employee extends Person {
    public double salary;

    // Default constructor
    public Employee() {
        super();
    }

    // Parameterized constructor

    public Employee(String name, String surname, double salary) {
        this();
        setName(name);
        setSurname(surname);
        setPosition("modules.Employee");
        setSalary(salary);
    }

    // Override getPaymentAmount to return the salary

    @Override
    public double getPaymentAmount() {
        return this.salary;

    }

    // Override toString to include information about the salary

    @Override
    public String toString() {
        return super.toString() + " earns " + getPaymentAmount() + " tenge";
    }

    // Setter method for the salary field

    public void setSalary(double salary) {
        this.salary = salary;

    }
}
