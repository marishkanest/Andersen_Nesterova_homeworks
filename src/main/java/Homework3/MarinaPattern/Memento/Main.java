package Homework3.MarinaPattern.Memento;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.set("LVL-1", 30000);
        System.out.println(game);

        File file = new File();
        file.setSave(game.save());

        game.set("LVL-2", 35000);
        System.out.println(game);

        System.out.println("загружаемся");
        game.load(file.getSave());
        System.out.println(game);

    }
}
