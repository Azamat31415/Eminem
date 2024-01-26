import modules.Employee;
import modules.Person;
import modules.Student;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {

        // Creating instances of Employee and Student

        Employee Employee1 = new Employee("Patrick", "Bateman", 29666.910);
        Employee Employee2 = new Employee("Marshall", "Mathers", 50000.00);
        Student Student1 = new Student("Ryan", "Gosling", 2.66);
        Student Student2 = new Student("Peter", "Parker", 4.00);

        // Creating an ArrayList to store instances of Person

        ArrayList<Person> people = new ArrayList<>();

        people.add(Employee1);
        people.add(Employee2);
        people.add(Student1);
        people.add(Student2);

        // Sorting the ArrayList based on the natural ordering defined in the compareTo method

        Collections.sort(people);

        // Printing information about each person

        printData(people);
    }

    // Method to print information about each person in the Iterable collection

    public static void printData(Iterable<Person> people) {
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
}
