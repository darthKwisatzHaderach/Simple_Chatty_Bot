import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        String res1 = str1.replace(" ", "");
        String res2 = str2.replace(" ", "");

        if (res1.equals(res2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}