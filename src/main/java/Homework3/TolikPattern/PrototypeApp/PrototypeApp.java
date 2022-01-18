package Homework3.TolikPattern.PrototypeApp;


public class PrototypeApp {
    public static void main(String[] args) {
        Human original = new Human(20, "Petya");
        System.out.println(original);

        Human notOrignal =(Human)original.copy();
        System.out.println(notOrignal);

        Human notOriginal2 =(Human)original.copy();
        System.out.println(notOriginal2);

    }
}

interface Copyable {
    Object copy();
}
class Human implements Copyable /*Cloneable*/{
    int age;
    String name;
    public Human(int age, String name){
        this.age=age;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    public Object copy(){
        return new Human(age,name);
    }
}


