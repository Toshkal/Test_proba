public class PrintField {
    public static void printField(int[][] field){
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < field.length; i++) {
            System.out.print(i+" ");
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == 1) {
                    System.out.print("- ");
                }else {
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
    }
}
