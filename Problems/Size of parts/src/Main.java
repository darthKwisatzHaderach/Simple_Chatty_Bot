import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int partsNumber = scanner.nextInt();
        int[] parts = new int[partsNumber];
        int larger = 0;
        int smaller = 0;
        int perfect = 0;

        for (int i = 0; i < partsNumber; i++) {
            parts[i] = scanner.nextInt();
        }

        for (int i = 0; i < partsNumber; i++) {
            if (parts[i] > 0) {
                larger++;
            } else if (parts[i] < 0) {
                smaller++;
            } else if (parts[i] == 0) {
                perfect++;
            }
        }

        System.out.println(perfect + " " + larger + " " + smaller);
    }
}