import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> s = new ArrayList<>();

        for (int i = 1; i < 100; i++) {
            for (int j = 1; j <= i; j++) {
                s.add(i);
            }
        }

        for (int x = 0; x < n; x++) {
            System.out.println(s.get(x));
        }
    }
}