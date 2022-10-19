public class FillingField {
    public static void fillingField(String namePlayer, int[][] fieldPlayer) {
        int ship = 4;
        for (int i = ship; i >= 1; i--) {
            for (int k = 0; k < 5-i; k++) {
                PrintField.printField(fieldPlayer);
                System.out.println(namePlayer + " Укажите координаты " + i + "-палубного корабля");
                System.out.println("Укажите координату Х!");
                int x = Menu.scanner.nextInt();
                System.out.println("Укажите координату У!");
                int y = Menu.scanner.nextInt();
                System.out.println("Выберите направление: \n1. По вертикали! \n2. По горизонтали!");
                int napravlenie = Menu.scanner.nextInt();
                for (int j = 0; j < ship; j++) {
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
