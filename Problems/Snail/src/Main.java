import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int r = 0;
        int day = 1;

        while (r != h) {
            r += a;
            if (r >= h) {
                System.out.println(day);
                break;
            } else {
                r -= b;
            }
            day++;
        }
    }
}