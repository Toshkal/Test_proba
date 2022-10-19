import java.util.Scanner;

public class Menu {
    public static final int LENGTH = 10;
    static Scanner scanner = new Scanner(System.in);
    static int vybor;

    public static void menu() {
        System.out.println("Выберите режим!!");
        System.out.println("1. Режим отыгрыша");
        System.out.println("2. Режим игры");
        System.out.println("3. Выход");
        switch (vybor = scanner.nextInt()) {
            case 1:
                break;
            case 2:
                Game.game();
                break;
            case 3:
                return;
            default:
                return;
        }
        menu();
    }
}
