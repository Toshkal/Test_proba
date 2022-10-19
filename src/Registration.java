import java.util.Scanner;

public class Registration {
    static int[][] monitorPlayer1 = new int[Menu.LENGTH][Menu.LENGTH]; // поле первого игрока для второго
    static int[][] monitorPlayer2 = new int[Menu.LENGTH][Menu.LENGTH]; // поле второго игрока для первого
    static int[][] fieldBattlePlayer1 = new int[Menu.LENGTH][Menu.LENGTH];  // поле первого игрока
    static int[][] fieldBattlePlayer2 = new int[Menu.LENGTH][Menu.LENGTH];  // поле второго игрока
    static String namePlayer1; // имя первого игрока
    static String namePlayer2; // имя второго игрока
    static Scanner scanner = new Scanner(System.in);
    public static void registration() {
        System.out.println("Игрок №1, пожалуйста, введите свое имя!");
        namePlayer1 = scanner.nextLine();
        System.out.println("Привет, " + namePlayer1 + "!");
        System.out.println("Игрок №2, пожалуйста, введите свое имя!");
        namePlayer2 = scanner.nextLine();
        System.out.println("Привет, " + namePlayer2 + "!");
FillingField.fillingField(namePlayer1,fieldBattlePlayer1);
FillingField.fillingField(namePlayer2,fieldBattlePlayer2);
    }
}
