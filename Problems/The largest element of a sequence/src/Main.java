import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> values = new ArrayList();

        int value;
        do {
            value = scanner.nextInt();
            values.add(value);
        } while (value != 0);

        System.out.println(Collections.max(values));
    }
}