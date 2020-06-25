import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        boolean[][] board = new boolean[8][8];

        for (int i = 0; i < 8; i++) {
            board[x1][i] = true;
            board[i][y1] = true;

            try {
                board[x1 + i][y1 + i] = true;
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                board[x1 - i][y1 - i] = true;
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                board[x1 + i][y1 - i] = true;
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                board[x1 - i][y1 + i] = true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        if (board[x2][y2]) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}