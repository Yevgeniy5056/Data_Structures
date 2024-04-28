package review;

public class User {
    String name;
    String surname;
    User next;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
