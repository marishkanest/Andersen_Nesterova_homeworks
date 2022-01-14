package Homework3.MarinaPattern;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private boolean isWorker;

    private User(String firstName, String lastName, int age, boolean isWorker) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isWorker = isWorker;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isWorker() {
        return isWorker;
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    @Override
    public String toString() {
        return "User {" + firstName +", "+ lastName+ ", "+age+", "+isWorker+ "}";
    }

    public static class UserBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private boolean isWorker;

        public UserBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setIsWorker(boolean isWorker) {
            this.isWorker = isWorker;
            return this;
        }
        public User build() {
            return new User(firstName, lastName, age, isWorker);
        }
    }
}
