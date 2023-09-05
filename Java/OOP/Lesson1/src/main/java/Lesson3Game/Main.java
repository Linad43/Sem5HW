package Lesson3Game;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flag = "";
        cicle:do {
            System.out.println("Игра быки-коровы.");
            System.out.println("1.Игра с числами");
            System.out.println("2.Игра с Eng буквами");
            System.out.println("3.Игра с Ru буквами");
            System.out.println("4.Предыдущая игра");
            System.out.println("0.Выход");
            flag = scanner.nextLine();
            Game game=null;
            switch (flag)
            {
                case "1":
                    game = new GameNum();
                    Game(scanner, game);
                    System.out.println("Желаете повторить игру? (y/n)");
                    flag = scanner.nextLine();
                    break;
                case "2":
                    game = new ENGame();
                    Game(scanner, game);
                    System.out.println("Желаете повторить игру? (y/n)");
                    flag = scanner.nextLine();
                    break;
                case "3":
                    game = new RUGame();
                    Game(scanner, game);
                    System.out.println("Желаете повторить игру? (y/n)");
                    flag = scanner.nextLine();
                    break;
                case "4":
                    Answer.printLog();
                    flag = "y";
                    break;
                default:break cicle;
            }
        }
        while (flag.equals("y"));
        Answer.cleanFille();
    }
    public static void Game(Scanner scanner, Game game)
    {
        game.Start(5, 2);
        while (!(game.getNameStatus().equals(GameStatus.WIN)) &&
                !game.getNameStatus().equals(GameStatus.LOSE)) {
            String inputWord = scanner.nextLine();
            System.out.println(game.inputValue(inputWord));

        }
        System.out.println(game.getNameStatus());
    }
}
