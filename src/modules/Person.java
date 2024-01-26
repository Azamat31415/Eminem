package modules;

// Abstract base class representing a person, implementing Payable and Comparable interfaces
public abstract class Person implements Payable, Comparable<Person> {
    private static int id_gen = 1;
    private final int id;
    private String name;
    private String surname;
    private String position;

    // Constructor to assign a unique ID to each person

    public Person() {
        id = id_gen++;
    }

    // Override toString to provide a formatted string representation

    @Override
    public String toString() {
        return getPosition() + ": " + getId() + ". " + getName() + " " + getSurname();

    }

    // Getter methods for various fields
    public String getPosition() {
        return position;

    }
    public int getId() {
        return id;

    }
    public String getName() {
        return name;

    }
    public String getSurname() {
        return surname;

    }

    // Setter methods for various fields

    public void setName(String name) {
        this.name = name;

    }
    public void setSurname(String surname) {
        this.surname = surname;

    }
    public void setPosition(String position) {
        this.position = position;

    }

    // Override compareTo to compare persons based on payment amounts

    @Override
    public int compareTo(Person x) {
        return Integer.compare((int) this.getPaymentAmount(), (int) x.getPaymentAmount());
    }

    // Abstract method to be implemented by subclasses

    @Override
    public double getPaymentAmount() {
        return 0;
    }
}
