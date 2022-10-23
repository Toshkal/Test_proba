public class FillingField {
    static int x;
    static int y;
    static int napravlenie;
    public static void fillingField(String namePlayer, int[][] fieldPlayer) {
        for (int i = 4; i >= 1; i--) {
            for (int k = 5-i; k > 0; k--) {
                System.out.println(namePlayer + " Укажите координаты " + i + "-палубного корабля");
                System.out.println(namePlayer + " Осталось указать " + k + " корабля");
                PrintField.printField(fieldPlayer);
                System.out.println("Укажите координату Х!");
                x = Menu.scanner.nextInt();
                System.out.println("Укажите координату У!");
                y = Menu.scanner.nextInt();
                System.out.println("Выберите направление: \n1. По вертикали! \n2. По горизонтали!");
                napravlenie = Menu.scanner.nextInt();
                if (Correctness.correctness(x,y,i,napravlenie,fieldPlayer)) {
                    System.out.println("Недопустимые координаты!");
                    continue;
                }
                for (int j = 0; j < i; j++) {
                    if (napravlenie == 1) {
                        fieldPlayer[x+j][y] = 1;
                    } else {
                        fieldPlayer[x][y+j] = 1;
                    }
                }
            }
        }
        PrintField.printField(fieldPlayer);
    }
}
