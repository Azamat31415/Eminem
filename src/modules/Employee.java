package modules;

public class Employee extends Person {
    public double salary;
    public Employee() {
        super();
    }

    public Employee(String name, String surname, double salary) {
        this();
        setName(name);
        setSurname(surname);
        setPosition("modules.Employee");
        setSalary(salary);
    }

}