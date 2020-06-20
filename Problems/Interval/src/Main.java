import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String positiveResult = "True";
        String negativeResult = "False";

        if (number > -15 && number <= 12) {
            System.out.println(positiveResult);
        } else if (number > 14 && number < 17) {
            System.out.println(positiveResult);
        } else if (number >= 19) {
            System.out.println(positiveResult);
        } else {
            System.out.println(negativeResult);
        }
    }
}