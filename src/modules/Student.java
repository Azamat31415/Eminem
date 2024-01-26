package modules;

// Student class extending Person
public class Student extends Person {
    private double gpa;
    public double salary;

    // Default constructor
    public Student() {
        super();

    }

    // Parameterized constructor

    public Student(String name, String surname, double gpa) {
        this();
        setName(name);
        setSurname(surname);
        setGpa(gpa);
        setSalary();
        setPosition("modules.Student");
    }

    // Override getPaymentAmount to return a salary based on the GPA

    @Override
    public double getPaymentAmount() {
        if (gpa > 2.67) {
            return 36660.00;
        }
        return 0;
    }

    // Override toString to include information about the salary

    @Override
    public String toString() {
        return super.toString() + " earns " + getSalary() + " tenge";

    }

    // Getter method for the salary field

    public double getSalary() {
        return salary;

    }

    // Setter method for the salary field

    public void setSalary() {
        this.salary = getPaymentAmount();

    }

    // Setter method for the GPA field
    public void setGpa(double gpa) {
        this.gpa = gpa;

    }
}
