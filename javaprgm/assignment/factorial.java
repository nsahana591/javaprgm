import java.util.Scanner;

 class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x, i = 1;

        System.out.println("-----Enter the positive integer number-----");
        x = in.nextInt();

        System.out.print("\nThe factors of the " + x + " are: ");
        while (i <= x) {
            if (x % i == 0) {
                System.out.print(i + " ");
            }
            ++i;
        }
        System.out.print("\n");
    }
}