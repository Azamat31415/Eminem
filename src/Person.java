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

}
