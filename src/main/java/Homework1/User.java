package Homework1;

import java.util.StringJoiner;

public class User implements Comparable<User> {
    private final Long id;
    private final String firstName;
    private final String lastName;
    private final int age;
    private final double height;

    public User(Long id, String firstName, String lastName, int age, double height) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
    }

//    public Long getId() {
//        return id;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public double getHeight() {
//        return height;
//    }

    @Override
    public String toString() {
        return new StringJoiner(", ", User.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("firstName='" + firstName + "'")
                .add("lastName='" + lastName + "'")
                .add("age=" + age)
                .add("height=" + height)
                .toString();
    }

    // a.compareTo(b)
    // возвращает отрицательное число, если a < b
    // возвращает 0, если a == b
    // возвращает положительное число, если a > b

    @Override
    public int compareTo(User o) {
        return this.age - o.age;
    }
}

