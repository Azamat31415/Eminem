package modules;

public class Student extends Person {
    private double gpa;
    public double salary;

    public Student() {
        super();
    }

    public Student(String name, String surname, double gpa) {
        this();
        setName(name);
        setSurname(surname);
        setGpa(gpa);
        setSalary();
        setPosition("modules.Student");
    }

    @Override
    public double getPaymentAmount() {
        if (gpa > 2.67) {
            return 36660.00;
        }
        return 0;
    }


}
