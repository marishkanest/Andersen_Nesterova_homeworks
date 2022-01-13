package Homework3.MarinaPattern;

import Homework3.MarinaPattern.User;

public class Main {

    public static void main(String[] args) {
        User user1 = User.builder()
                .setFirstName("Marina")
                .setLastName("Nesterova")
                .setAge(35)
                .setIsWorker(true)
                .build();

        User user2 = User.builder()
                .setFirstName("Ksenia")
                .setAge(5)
                .build();

        System.out.println(user1.toString());
        System.out.println(user2.toString());

    }
}