import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();

        if (number
                .replaceAll("\\W", "")
                .equalsIgnoreCase(
                        new StringBuilder(number.replaceAll("\\W", ""))
                                .reverse().toString())) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}