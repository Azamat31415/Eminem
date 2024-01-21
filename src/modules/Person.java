package modules;

public class Person {
    private static int id_gen = 1;
    private int id;
    private String name;
    private String surname;
    private String position;

    public Person() {
        id = id_gen++;
    }

    public Person(String name, String surname) {
        this();
        setName(name);
        setSurname(surname);
    }

    @Override
    public String toString() {
        return getPosition() + ": " + getId() + ". " + getName() + " " + getSurname();
    }

    public String getPosition() {
        return position;
    }

    public int getId() {
        return id;
    }



}
