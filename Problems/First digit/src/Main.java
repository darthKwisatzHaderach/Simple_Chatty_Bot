import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();

        System.out.println(number.substring(0, 1));
    }
}