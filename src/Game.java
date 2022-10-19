import java.util.Scanner;

public class Game {
    static int vybor1;
    static Scanner scanner = new Scanner(System.in);

    public static void game() {
        System.out.println("Выберите один из вариантов");
        System.out.println("1. Игрок против игрока!");
        System.out.println("2. Игрок против компьютера!");
        System.out.println("3. Компьютер против компьютера!");
        System.out.println("3. Выход!");
        switch (vybor1 = scanner.nextInt()) {
            case 1:
                Registration.registration();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                return;
            default:
                System.out.println("Неправильное значение");
                break;
        }
        game();
    }
}
