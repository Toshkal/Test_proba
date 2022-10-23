public class Correctness {
    public static boolean correctness(int x, int y, int ship, int napravlenie, int[][] battlefield) {
        if (napravlenie == 1 && (y + ship) > battlefield.length) {
            return false;
        } else if (napravlenie == 2 && (x + ship) > battlefield[0].length) {
            return false;
        }

        return true;
    }
}
